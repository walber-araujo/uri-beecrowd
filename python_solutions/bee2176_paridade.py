# Walber Araújo 16/11/2023

bits = input()
qtd_de_1 = 0
for bit in bits:
    if bit == '1': qtd_de_1 += 1

if qtd_de_1 % 2 == 0: print(bits + '0')
else: print(bits + '1')