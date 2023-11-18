# Walber Araújo 14/11/2023

count = 1
while True:
    try:
        qtd_subsequencias, i_ultima_subseq = 0, 0
        n1 = input()
        n2 = input()
        tam_n1 = len(n1)
        for i in range(len(n2) - tam_n1 + 1):
            subseq = ''
            for j in range(tam_n1):
                subseq += n2[i+j]

            if subseq == n1: 
                qtd_subsequencias += 1
                i_ultima_subseq = i
        
        if qtd_subsequencias:
            print(f"Caso #{count}:\nQtd.Subsequencias: {qtd_subsequencias}\nPos: {i_ultima_subseq+1}\n")
        else:
            print(f'Caso #{count}:\nNao existe subsequencia\n')
        count += 1

    except EOFError:
        break