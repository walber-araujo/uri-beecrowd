# Walber Araújo 16/11/2023

n = int(input())
total, qtd_coelhos, qtd_ratos, qtd_sapos = 0, 0, 0, 0

for _ in range(n):
    qtd, animal = input().split()
    if animal == "C" : qtd_coelhos += int(qtd)
    elif animal == "R": qtd_ratos += int(qtd)
    else: qtd_sapos += int(qtd)

total = qtd_coelhos + qtd_ratos + qtd_sapos
print(f"""Total: {total} cobaias
Total de coelhos: {qtd_coelhos}
Total de ratos: {qtd_ratos}
Total de sapos: {qtd_sapos}
Percentual de coelhos: {(qtd_coelhos * 100) / total:.2f} %
Percentual de ratos: {(qtd_ratos * 100) / total:.2f} %
Percentual de sapos: {(qtd_sapos * 100) / total:.2f} %""")