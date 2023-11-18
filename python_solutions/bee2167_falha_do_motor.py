# Walber Araújo 15/11/2023

n = int(input())
velocidades = [int(velocidade) for velocidade in input().split()]

for i in range(n-1):
    if velocidades[i] > velocidades[i+1]:
        print(i+2)
        break
    if i == n-2: print(0)