# Walber Araújo 16/11/2023

n = int(input())
for _ in range(n):
    soma = 0
    x, y = (int(n) for n in input().split())
    if y < x: x, y = y, x
    for numero in range(x+1, y):
        if numero % 2 == 1:
            soma += numero

    print(soma)