"""MinMax"""
n = int(input())
max = -2000000000
min = 2000000000
for i in range(n):
    a = int(input())
    if a > max:
        max = a
    if a < min:
        min = a
print(min)
print(max)
