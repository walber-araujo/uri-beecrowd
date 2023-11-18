# Walber Araújo 15/11/2023

from sys import exit

n = int(input())

alturas = [int(n) for n in input().split()]

if alturas[0] > alturas[1]:
    for i in range(1, len(alturas) - 1):
        if i % 2 == 0:
            if alturas[i] <= alturas[i+1]:
                print(0)
                exit()
        else:
            if alturas[i] >= alturas[i+1]:
                print(0)
                exit()

elif alturas[0] < alturas[1]:
    for i in range(1, len(alturas) - 1):
        if i % 2 == 0:
            if alturas[i] >= alturas[i+1]:
                print(0)
                exit()
        else:
            if alturas[i] <= alturas[i+1]:
                print(0)
                exit()

else:
    print(0)
    exit()  
         
print(1)