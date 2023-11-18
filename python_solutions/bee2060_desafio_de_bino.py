# Walber Araújo 14/11/2023

input()
numeros_de_bino = [int(n) for n in input().split()]
multiplos2, multiplos3, multiplos4, multiplos5 = 0, 0, 0, 0

for i in range(len(numeros_de_bino)):
    numero_de_bino = numeros_de_bino[i]
    if numero_de_bino % 4 == 0: 
        multiplos4 += 1
        multiplos2 += 1
    elif numero_de_bino % 2 == 0: multiplos2 += 1
    if numero_de_bino % 3 == 0: multiplos3 += 1
    if numero_de_bino % 5 == 0: multiplos5 += 1

print(f'''{multiplos2} Multiplo(s) de 2
{multiplos3} Multiplo(s) de 3
{multiplos4} Multiplo(s) de 4
{multiplos5} Multiplo(s) de 5''')