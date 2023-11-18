# Walber Araújo 16/11/2023

while True:
    x, y = (int(n) for n in input().split()) 
    if x > y: print('Decrescente')
    elif x < y: print('Crescente')
    else: break