# Walber Araújo 16/11/2023

def calcular_media():
    qtd_validas = 0
    soma = 0
    while qtd_validas < 2:
        nota = float(input())
        if 0 <= nota <= 10:
            qtd_validas += 1
            soma += nota
        else: print('nota invalida')

    return soma / 2

while True:
    media = calcular_media()
    print(f'media = {media:.2f}')
    while True:
        continuar = input('novo calculo (1-sim 2-nao)\n')
        if continuar == '1' or continuar == '2': break
    if continuar == '2': break