#Walber Araújo 04/11/2023

try:
    while True:
        tam_vetor, num_consultas = (int(n) for n in input().split())
        vetor = [int(n) for n in input().split()]
        numeros = {}
        for i in range(tam_vetor):
            if vetor[i] in numeros.keys():
                numeros[vetor[i]] += [i]
            else:
                numeros[vetor[i]] = [i]

        for _ in range(num_consultas):
            ocorrencia, valor = (int(n) for n in input().split())
            if valor not in numeros.keys(): print(0)
            elif ocorrencia > len(numeros[valor]): print(0)
            else:
                print(numeros[valor][ocorrencia-1]+1)

except EOFError:
    ...