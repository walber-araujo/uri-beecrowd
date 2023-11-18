# Walber Araújo 14/11/2023

escolha_jog1, jog1, jog2, roubou, acusou = (int(n) for n in input().split())

if roubou and acusou: vencedor = '2'
elif roubou and not acusou: vencedor = '1'
elif not roubou and acusou: vencedor = '1'
else:
    if escolha_jog1 == 1:
        if (jog1 + jog2) % 2 == 0: vencedor = '1'
        else: vencedor = '2'
    else:
        if (jog1 + jog2) % 2 == 1: vencedor = '1'
        else: vencedor = '2'
 
print('Jogador ' + vencedor + ' ganha!')