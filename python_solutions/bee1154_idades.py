# Walber Araújo 18/11/2023

soma_idades, qtd_idades_validas = 0, 0

while True:
    idade = int(input())
    if idade < 0: break
    soma_idades += idade
    qtd_idades_validas += 1

print(f'{soma_idades / qtd_idades_validas:.2f}')