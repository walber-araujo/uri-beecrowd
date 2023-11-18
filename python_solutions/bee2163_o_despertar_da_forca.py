# Walber Araújo 15/11/2023

def verifica_vizinhos(matriz, linha, coluna):
    vizinhos_validos = True
    if matriz[linha+1][coluna] != '7': vizinhos_validos = False
    elif matriz[linha+1][coluna+1] != '7': vizinhos_validos = False
    elif matriz[linha+1][coluna-1] != '7': vizinhos_validos = False
    elif matriz[linha][coluna+1] != '7': vizinhos_validos = False
    elif matriz[linha][coluna-1] != '7': vizinhos_validos = False
    elif matriz[linha-1][coluna] != '7': vizinhos_validos = False
    elif matriz[linha-1][coluna+1] != '7': vizinhos_validos = False
    elif matriz[linha-1][coluna-1] != '7': vizinhos_validos = False
    return vizinhos_validos
    
lins, cols = (int(n) for n in input().split())

mat = [[n for n in input().split()] for _ in range(lins)]
tem_sabre = False

for ilin in range(lins):
    for icol in range(cols):
        if mat[ilin][icol] == '42':
            if (ilin + 1) < lins and (ilin - 1) > -1 and (icol + 1) < cols and (icol - 1) > -1:
                tem_sabre = verifica_vizinhos(mat, ilin, icol)
                if tem_sabre == True: break
    if tem_sabre == True:
        break

if tem_sabre == True: print(ilin+1, icol+1)
else: print(0, 0)