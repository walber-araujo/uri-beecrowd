# Walber Araújo 16/11/2023

i, j = 1, 7
for c in range(1, 16):
    print(f"I={i} J={j}")
    j -= 1
    if c % 3 == 0: 
        i += 2
        j += 5