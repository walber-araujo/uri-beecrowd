# Walber Araújo 12/11/2023

num = float(input())

if num > 0 or str(num)[0] != '-' : sinal = '+'
else: sinal = ''

print(f'{sinal}{num:.4E}')