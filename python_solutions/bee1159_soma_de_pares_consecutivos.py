# Walber Araújo 18/11/2023

while True:
    soma = 0
    x = int(input())
    if x == 0: break

    if x % 2 == 1: x += 1

    for _ in range(5):
        soma += x
        x += 2
    
    print(soma)