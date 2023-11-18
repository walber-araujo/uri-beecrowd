# Walber Araújo 17/11/2023

qtd_alcool, qtd_gasolina, qtd_diesel = 0, 0, 0
while True:
    tipo = int(input())
    if tipo == 4: break
    if tipo == 1: qtd_alcool += 1
    elif tipo == 2: qtd_gasolina += 1
    elif tipo == 3: qtd_diesel += 1

print(f"""MUITO OBRIGADO
Alcool: {qtd_alcool}
Gasolina: {qtd_gasolina}
Diesel: {qtd_diesel}""")