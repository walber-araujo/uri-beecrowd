# Walber Araújo 12/11/2023

numeros_romanos = ['CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
valores_decimal = [900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
num = int(input())
num_romano = ''
i = 0

while num:
    if num >= valores_decimal[i]:
        num -= valores_decimal[i]
        num_romano += numeros_romanos[i]
    else: i += 1

print(num_romano) 