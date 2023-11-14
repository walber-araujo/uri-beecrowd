# Walber Araújo 13/11/2023

sequencias = {0: ['0', 1],
              1: ['0 1', 2]}
i, maior_chave = 1, 1

while True:
    try:
        n = int(input())
        if n > maior_chave:
            sequencia = sequencias[maior_chave][0]
            for num in range(maior_chave+1, int(n) + 1):
                sequencia += f' {str(num)}' * num
                sequencias[num] = [sequencia, sequencias[num-1][1]+num]
            maior_chave = num

        if n == 0:
            print(f'Caso {i}: {sequencias[n][1]} numero\n{sequencias[n][0]}\n')
        else: 
            print(f'Caso {i}: {sequencias[n][1]} numeros\n{sequencias[n][0]}\n')
            
        i += 1

    except EOFError:
        break