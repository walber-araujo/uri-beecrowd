# Walber Araújo 18/11/2023

s, denominador = 1, 2
for numerador in range(3, 40, 2):
    s += numerador / denominador
    denominador *= 2

print(f'{s:.2f}')