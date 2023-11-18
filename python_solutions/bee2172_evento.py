# Walber Araújo 16/11/2023

while True:
    aumento, xp = (int(n) for n in input().split())
    if aumento == 0 and xp == 0: break
    print(aumento * xp)