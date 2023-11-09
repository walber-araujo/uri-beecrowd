#Walber Araújo 04/11/2023

try:
    while True:
        _qtd_lesmas = int(input())
        velocidades = (int(v) for v in input().split())
        maior_velocidade = max(velocidades)
        if maior_velocidade < 10: print(1)
        elif 10 <= maior_velocidade < 20: print(2)
        else: print(3)

except EOFError:
    ...