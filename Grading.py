a = int(input())
b = int(input())
c = int(input())
sum = a + b + c
if sum >= 80 and sum <= 100:
    print("A")
if sum >= 75 and sum <= 79:
    print("B+")
if sum >= 70 and sum <= 74:
    print("B")
if sum >= 65 and sum <= 69:
    print("C+")
if sum >= 60 and sum <= 64:
    print("C")
if sum >= 55 and sum <= 59:
    print("D+")
if sum >= 50 and sum <= 54:
    print("D")
if sum >= 0 and sum <= 49:
    print("F")