#Walber Araújo 04/11/2023

idas_a_feira = int(input())
for _ in range(idas_a_feira):
    disponiveis, gasto_total = {}, 0
    qtd_prod_disp = int(input())
    for _ in range(qtd_prod_disp):
        produto, valor = input().split()
        disponiveis[produto] = float(valor)

    qtd_desejados = int(input())
    for _ in range(qtd_desejados):
        produto, qtd = input().split()
        gasto_total += disponiveis[produto] * int(qtd)

    print(f'R$ {gasto_total:.2f}')