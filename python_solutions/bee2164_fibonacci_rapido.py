# Walber Araújo 15/11/2023

from math import sqrt
n = int(input())
fibonacci_n = (((1 + sqrt(5)) / 2) ** n - ((1 - sqrt(5)) / 2) ** n) / sqrt(5)
print(f'{fibonacci_n:.1f}')