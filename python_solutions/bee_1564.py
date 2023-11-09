#Walber Araújo 04/11/2023

try:
    while True:
        qtd_reclamacoes = int(input())
        if qtd_reclamacoes == 0: print('vai ter copa!')
        else: print('vai ter duas!')

except EOFError:
    ...