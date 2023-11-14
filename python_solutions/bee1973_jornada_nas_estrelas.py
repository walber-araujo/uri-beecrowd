# Walber Araújo 12/11/2023

num_estrelas = int(input())
carneiros_antes = [int(n) for n in input().split()]
i, estrelas_invadidas, qtd_carneiros_roubados, qtd_carneiros_ini = 0, 0, 0, 0

for n in carneiros_antes:
    qtd_carneiros_ini += n

while 0 <= i <= num_estrelas-1:
    if i > estrelas_invadidas: estrelas_invadidas = i

    if carneiros_antes[i] % 2 == 1:
        carneiros_antes[i] -= 1
        qtd_carneiros_roubados += 1
        i += 1

    elif carneiros_antes[i] != 0:
        carneiros_antes[i] -= 1
        qtd_carneiros_roubados += 1
        i -= 1

    else: i -= 1

print(estrelas_invadidas+1, qtd_carneiros_ini - qtd_carneiros_roubados)