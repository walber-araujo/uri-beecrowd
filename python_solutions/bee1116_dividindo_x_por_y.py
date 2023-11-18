# Walber Araújo 16/11/2023

n = int(input())
for _ in range(n):
    x, y = (int(num) for num in input().split())
    if y == 0: print("divisao impossivel")
    else: print(f"{x / y:.1f}")