# Walber Araújo 18/11/2023

x = int(input())
z = int(input())
soma, qtd_nums = 0, 0

while z <= x: z = int(input())

while soma <= z:
    soma += x + qtd_nums
    qtd_nums += 1

print(qtd_nums)