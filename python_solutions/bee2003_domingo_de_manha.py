# Walber Araújo 13/11/2023

while True:
    try:
        hora_acordou = input()
        if 5 <= int(hora_acordou[0]) <= 6 or hora_acordou == '7:00': atraso = 0

        elif hora_acordou[0] == '7': atraso = hora_acordou[-2] + hora_acordou[-1]

        elif hora_acordou[0] == '8': atraso = int(hora_acordou[-2] + hora_acordou[-1]) + 60
        elif hora_acordou[0] == '9': atraso = int(hora_acordou[-2] + hora_acordou[-1]) + 120
        print(f'Atraso maximo: {int(atraso)}')
        
    except EOFError:
        break