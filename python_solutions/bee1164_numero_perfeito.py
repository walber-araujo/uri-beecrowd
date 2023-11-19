# Walber Araújo 18/11/2023

qtd_testes = int(input())
for _ in range(qtd_testes):
    num = int(input())
    soma_divisores = 0
    for divisor in range(1, num // 2 + 1):
        if num % divisor == 0: soma_divisores += divisor
    
    if soma_divisores == num: print(f'{num} eh perfeito')
    else: print(f'{num} nao eh perfeito')