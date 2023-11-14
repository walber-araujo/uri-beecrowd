# Walber Araújo 12/11/2023

altura_pulo, qtd_canos = (int(n) for n in input().split())
alturas_canos = [int(n) for n in input().split()]
mensagem = 'YOU WIN'

for i in range(len(alturas_canos) - 1):
    if abs(alturas_canos[i] - alturas_canos[i+1]) > altura_pulo:
        mensagem = 'GAME OVER'
        break

print(mensagem)