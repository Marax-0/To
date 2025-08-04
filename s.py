#!/usr/bin/env python3
import math
from sympy import mod_inverse

# RSA Parameters
n = 873224563026311790736191809393138825971072101706285228102516279725246082824238887755080848591049817640245481028953722926586046994669540835757705139131212
c = 2474441252733719053175980379328954044776087843017119343438261058084386421368354541036170692327407136161777172248070187377337987107227187627874507951272247

# Known factors
# p = 2^2 * 29191 * 555536052691
p_components = [2**2, 29191, 555536052691]
p = 1
for component in p_components:
    p *= component
print(f"Calculating p = 2^2 * 29191 * 555536052691 = {p}")

q = 13461849489713487060314335820366838732209350411400786049462870410864599506608054830134980593400417151801193313653034138251225115915195063

print("🔐 RSA Decryption with Known Factors")
print("=" * 60)
print(f"n = {n}")
print(f"c = {c}")
print(f"p = 2^2 * 29191 * 555536052691 = {p}")
print(f"q = {q}")
print(f"p components: 4 * 29191 * 555536052691 = {4 * 29191 * 555536052691}")
print()

# Verify factorization
print("🔍 Verifying factorization...")
if p * q == n:
    print("✅ Factorization verified: p * q = n")
else:
    print("❌ ERROR: p * q ≠ n")
    print(f"p * q = {p * q}")
    exit()

# Calculate phi(n)
phi_n = (p - 1) * (q - 1)
print(f"φ(n) = (p-1) * (q-1) = {phi_n}")
print()

# Try common e values
common_e_values = [3, 5, 17, 257, 65537]

print("🔑 Trying common e values...")
success = False

for e in common_e_values:
    print(f"\n--- Trying e = {e} ---")
    
    # Check if gcd(e, phi_n) = 1
    gcd_result = math.gcd(e, phi_n)
    print(f"gcd({e}, φ(n)) = {gcd_result}")
    
    if gcd_result == 1:
        try:
            # Calculate private exponent d
            d = mod_inverse(e, phi_n)
            print(f"d = {d}")
            
            # Decrypt: m = c^d mod n
            m = pow(c, d, n)
            print(f"m = c^d mod n = {m}")
            
            # Convert to hex
            hex_m = hex(m)[2:]
            if len(hex_m) % 2 != 0:
                hex_m = '0' + hex_m
            print(f"m (hex) = {hex_m}")
            
            # Try to convert to ASCII
            try:
                ascii_text = bytes.fromhex(hex_m).decode('ascii', errors='ignore')
                print(f"m (ASCII) = '{ascii_text}'")
                
                # Check if it looks like readable text
                if ascii_text.isprintable() and len(ascii_text.strip()) > 0:
                    printable_chars = ''.join(c for c in ascii_text if c.isprintable())
                    if len(printable_chars) > len(ascii_text) * 0.8:  # At least 80% printable
                        print(f"\n🎉 SUCCESS! Decryption with e = {e}")
                        print(f"📝 Plaintext: {ascii_text}")
                        print(f"🔑 OpenSSL Password: {ascii_text}")
                        success = True
                        
                        # Generate OpenSSL commands
                        print(f"\n📋 OpenSSL Commands:")
                        print(f"openssl enc -d -aes-256-cbc -in file.enc -out decrypted.txt -pass pass:{ascii_text}")
                        print(f"openssl enc -d -aes-128-cbc -in file.enc -out decrypted.txt -pass pass:{ascii_text}")
                        print(f"openssl enc -d -des3 -in file.enc -out decrypted.txt -pass pass:{ascii_text}")
                        break
            except Exception as decode_error:
                print(f"Cannot decode to ASCII: {decode_error}")
                
        except Exception as decrypt_error:
            print(f"❌ Decryption failed with e = {e}: {decrypt_error}")
    else:
        print(f"❌ Cannot use e = {e} (gcd ≠ 1)")

if not success:
    print(f"\n❌ No successful decryption found with common e values")
    print(f"💡 The plaintext might be:")
    print(f"   - Binary data (not ASCII text)")
    print(f"   - Using uncommon e value")
    print(f"   - Need different encoding")
    
    # Show raw results for manual analysis
    print(f"\n📊 Raw Results for Analysis:")
    for e in [65537]:  # Most common
        if math.gcd(e, phi_n) == 1:
            try:
                d = mod_inverse(e, phi_n)
                m = pow(c, d, n)
                hex_m = hex(m)[2:]
                if len(hex_m) % 2 != 0:
                    hex_m = '0' + hex_m
                print(f"e = {e}: m = {m}")
                print(f"e = {e}: hex = {hex_m}")
                
                # Try other encodings
                try:
                    utf8_text = bytes.fromhex(hex_m).decode('utf-8', errors='ignore')
                    print(f"e = {e}: UTF-8 = '{utf8_text}'")
                except:
                    pass
                    
                try:
                    latin1_text = bytes.fromhex(hex_m).decode('latin1', errors='ignore')
                    print(f"e = {e}: Latin-1 = '{repr(latin1_text)}'")
                except:
                    pass
                    
            except Exception as e:
                print(f"Error with e = {e}: {e}")

print(f"\n" + "=" * 60)