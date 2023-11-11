#Walber Araújo 10/11/2023

a , b = (int(n) for n in input().split())
resto = a % abs(b)

if b < 0: 
    quociente = a // abs(b) * -1
else: 
    quociente = a // b

print(quociente, resto)