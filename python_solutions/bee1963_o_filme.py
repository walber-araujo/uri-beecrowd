# Walber Araújo 12/11/2023

valor_antigo, valor_atual = (float(n) for n in input().split())

aumento_percentual = (valor_atual * 100) / valor_antigo - 100
print(f'{aumento_percentual:.2f}%')