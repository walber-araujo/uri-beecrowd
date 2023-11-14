# Walber Araújo 12/11/2023

qtd_testes = int(input())

for _ in range(qtd_testes):
    anos_transcorridos = int(input())
    delta_anos = 2015 - anos_transcorridos
    if delta_anos > 0:
        print(delta_anos, 'D.C.') 
    
    elif delta_anos < 0:
        print(-delta_anos + 1, 'A.C.')

    else: print(f'1 A.C.')