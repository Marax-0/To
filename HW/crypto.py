from binascii import unhexlify

# รับค่าจากโจทย์
from_bytes = lambda h: bytes.fromhex(h)

KEY1 = from_bytes("a6c8b6733c9b22de7bc0253266a3867df55acde8635e19c73313")
KEY2_xor_KEY1 = from_bytes("37dcb292030faa90d07eec17e3b1c6d8daf94c35d4c9191a5e1e")
KEY2_xor_KEY3 = from_bytes("c1545756687e7573db23aa1c3452a098b71a7fbf0fddddde5fc1")
FLAG_xor_ALL = from_bytes("04ee9855208a2cd59091d04767ae47963170d1660df7f56f5faf")

# คำนวณ KEY2
def xor_bytes(a, b):
    return bytes([x ^ y for x, y in zip(a, b)])

KEY2 = xor_bytes(KEY2_xor_KEY1, KEY1)
KEY3 = xor_bytes(KEY2_xor_KEY3, KEY2)

# แก้ FLAG
FLAG = xor_bytes(xor_bytes(xor_bytes(FLAG_xor_ALL, KEY1), KEY2), KEY3)

print("FLAG:", FLAG.decode())
