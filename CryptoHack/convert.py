ciphertext = """#/+*iu*xjb[wu]tuz#]nokk+vmxhn1"x#u/wjjmtfs+xpgocpokk/ g=zyhtl d#l
q= x#u1]jzw(z*]kx#u/[qu+a]/msyk1+kx#u[q(l=z

bqokk/xymu]/mrt=kgekbmbj1fqu+=y"k1ctqg)ov[c/vtokk[n)l=z

hclzyrqqk[fqf[fqfhv=z



oapa "+qokkfqhxakcpa t1tz



a[gymekbmbj"""

lookup1 = "\n \"#()*+/1:=[]abcdefghijklmnopqrstuvwxyz"
lookup2 = "ABCDEFGHIJKLMNOPQRSTabcdefghijklmnopqrst"

out = ""
prev = 0
for char in ciphertext:
    if char not in lookup2:
        # skip characters not in lookup2 (เช่น newline, space, ตัวอักษรพิเศษ)
        continue
    cur = lookup2.index(char)
    diff = (cur - prev) % 40
    out += lookup1[diff]
    prev = cur

print(out)
