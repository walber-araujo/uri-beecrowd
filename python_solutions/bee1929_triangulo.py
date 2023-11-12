#Walber Araújo 11/11/2023

numeros = sorted([int(n) for n in input().split()])
if (numeros[0] + numeros[1]) > numeros[2]: print('S')
else:
    if (numeros[1] + numeros[2]) > numeros[3]: print('S')
    else: print('N')