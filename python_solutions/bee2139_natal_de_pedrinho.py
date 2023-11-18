# Walber Araújo 14/11/2023

meses = {
    1: 31,
    2: 29,
    3: 31,
    4: 30,
    5: 31,
    6: 30,
    7: 31,
    8: 31,
    9: 30,
    10: 31,
    11: 30,
    12: 25
}

try:
    while True:
        mes, dia = (int(n) for n in input().split())
        if mes == 12 and dia >= 24:
            if dia > 25: print('Ja passou!')
            elif dia == 25: print('E natal!')
            elif dia == 24: print('E vespera de natal!')
        
        else:
            dias = meses[mes] - dia
            for chave in range(mes+1, 13):
                dias += meses[chave]
            print(f'Faltam {dias} dias para o natal!')

except EOFError:
    ...