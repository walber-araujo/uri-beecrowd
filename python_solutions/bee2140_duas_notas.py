# Walber Araújo 14/11/2023

notas = [2, 5, 10, 20, 50, 100]
trocos_possiveis = []
i = 0
while i < 6:
    for j in range(i, 6):
        trocos_possiveis.append(notas[i] + notas[j])
    i += 1

while True:
    valor_compra, valor_pago = (int(n) for n in input().split())
    if valor_compra == 0 and valor_pago == 0: break

    troco = valor_pago - valor_compra
    if troco > 200 or troco < 4: print('impossible')
    elif troco in trocos_possiveis: print('possible')
    else: print('impossible')