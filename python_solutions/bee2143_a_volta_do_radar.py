# Walber Araújo 14/11/2023

t = int(input())

while t != 0:
    for _ in range(t):
        n = int(input())
        if n % 2 == 0: print(n * 2 - 2)
        else: print(n * 2 - 1)

    t = int(input())