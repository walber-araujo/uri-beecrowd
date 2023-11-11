#Walber Araújo 10/11/2023

input()
pessoas = [int(n) for n in input().split()]
i_min = 0
for i in range(1, len(pessoas)):
    if pessoas[i] < pessoas[i_min]: i_min = i

print(i_min+1)