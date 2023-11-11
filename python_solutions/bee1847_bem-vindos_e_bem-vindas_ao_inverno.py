#Walber Araújo 10/11/2023

temp1, temp2, temp3 = (int(n) for n in input().split())
delta2_1 = abs(temp2 - temp1)
delta3_2 = abs(temp3 - temp2)


if temp1 > temp2 and temp3 >= temp2: print(':)')
elif temp2 > temp1 and temp2 >= temp3: print(':(')
elif temp2 > temp1 and temp3 > temp2 and delta3_2 < delta2_1: print(':(')
elif temp3 > temp2 > temp1 and delta3_2 >= delta2_1: print(':)')
elif temp1 > temp2 > temp3 and delta3_2 < delta2_1: print(':)')
elif temp1 > temp2 > temp3 and delta3_2 >= delta2_1: print(':(')
elif temp1 == temp2:
    if temp3 > temp2: print(':)')
    else: print(':(')