#Walber Araújo 11/11/2023

qt = int(input())
for _ in range(qt):
    nome1, escolha1, nome2, escolha2 = input().split()
    num1, num2 = input().split()
    if (int(num1) + int(num2)) % 2 == 0: 
        if escolha1 == 'PAR': print(nome1)
        else: print(nome2)
    else:
        if escolha1 == 'IMPAR': print(nome1)
        else: print(nome2)