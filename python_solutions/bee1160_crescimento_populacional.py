# Walber Araújo 18/11/2023

from math import trunc
t = int(input())
for _ in range(t):
    populacao_a, populacao_b, cresc_a, cresc_b = (float(n) for n in input().split())
    anos = 0
    while populacao_a <= populacao_b and anos <= 100:
        populacao_a += trunc(populacao_a * cresc_a / 100)
        populacao_b += trunc(populacao_b * cresc_b / 100)
        anos += 1

    if anos <= 100: print(f'{anos} anos.')
    else: print('Mais de 1 seculo.')