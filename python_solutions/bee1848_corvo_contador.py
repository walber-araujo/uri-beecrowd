#Walber Araújo 10/11/2023

gritos, numeros_sorteados = 0, [0, 0, 0]
while gritos != 3:
    entrada = input()
    if entrada[0] == 'c':
        gritos += 1
        continue
    
    tam_entrada = len(entrada)
    for i in range(tam_entrada):
        if entrada[i] == '*': numeros_sorteados[gritos] += 2 ** (tam_entrada-1 - i)
    
for num in numeros_sorteados:
    print(num)