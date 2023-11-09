# Walber Araújo 04/11/2023

while True:
    assinaturas, qtd_falsas = {}, 0
    tam_turma = int(input())
    if tam_turma == 0: break

    for _ in range(tam_turma):
        nome, assinatura = input().split()
        assinaturas[nome] = assinatura

    qtd_presentes = int(input())
    for _ in range(qtd_presentes):
        diferencas = 0
        nome, assin_aula = input().split()
        for i in range(len(assin_aula)):
            if assin_aula[i] != assinaturas[nome][i]: diferencas += 1

        if diferencas > 1: qtd_falsas += 1

    print(qtd_falsas)
