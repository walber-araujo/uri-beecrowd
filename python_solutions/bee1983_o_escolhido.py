# Walber Araújo 13/11/2023

qtd_alunos = int(input())
maior_nota, matricula_apto = 0, 0
for _ in range(qtd_alunos):
    matricula_nota = input().split()
    if float(matricula_nota[1]) > maior_nota:
        maior_nota = float(matricula_nota[1])
        matricula_apto = matricula_nota[0]
        if maior_nota == 10: break

if maior_nota < 8: matricula_apto = 'Minimum note not reached'

print(matricula_apto)