# Walber Araújo 18/11/2023

n = int(input())
seq = [0, 1]
for _ in range(2, n):
   seq.append(seq[-1] + seq[-2])

for i in range(n-1):
   print(seq[i], '', end='')

print(seq[n-1])