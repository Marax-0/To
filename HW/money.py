PRICE = 275
n = int(input("Enter : "))
change = n-PRICE
if(n >= 100):
    print(change//100)
    change %= 100
if(n >= 10):
    print(change//10)
    change %= 10
if(n >= 1):
    print(change//1)
    change %= 1
