# Walber Araújo 18/11/2023

qtd_Testes = int(input())
for _ in range(qtd_Testes):
    numero = int(input())
    if numero > 2 and numero % 2 == 0 or numero < 2:
        print(f'{numero} nao eh primo')
        continue
    
    eh_primo = True
    for divisor in range(3, numero // 2):
        if numero % divisor == 0:
            print(f'{numero} nao eh primo')
            eh_primo = False
            break
    
    if eh_primo: print(f'{numero} eh primo')