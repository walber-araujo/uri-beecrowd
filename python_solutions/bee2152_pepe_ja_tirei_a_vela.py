# Walber Araújo 14/11/2023

T = int(input())
for _ in range(T):
    hora, minuto, ocorrencia = input().split()
    if len(hora) == 1: hora = '0' + hora
    if len(minuto) == 1: minuto = '0' + minuto
    if ocorrencia == '1': msg = f'{hora}:{minuto} - A porta abriu!'
    else: msg = f'{hora}:{minuto} - A porta fechou!'
    print(msg)