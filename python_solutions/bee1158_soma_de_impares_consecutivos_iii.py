# Walber Araújo 18/11/2023

n = int(input())
for _ in range(n):
    soma = 0
    x, y = (int(n) for n in input().split())

    if x % 2 == 0: x += 1
    for _ in range(y):
        soma += x
        x += 2

    print(soma)