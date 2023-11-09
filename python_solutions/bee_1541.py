#Walber Araújo 04/11/2023

from math import trunc
while True:
    teste = input()
    if teste == '0': break

    medida1, medida2, percentual = (int(n) for n in teste.split())
    area_real = medida1 * medida2 * (percentual / 100) ** -1
    lado = trunc(area_real ** (1 / 2))
    print(lado)