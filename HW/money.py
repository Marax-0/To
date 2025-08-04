PRICE = 275
n = int(input("Enter : "))
change = n-PRICE
if(n >= 100):
    print("แบงค์ 100 :",change//100,"ใบ")
    change %= 100
if(n >= 10):
    print("เหรียญ 10 :",change//10,"เหรียญ")
    change %= 10
if(n >= 1):
    print("เหรียญ 1 :",change//1,"เหรียญ")
    change %= 1
