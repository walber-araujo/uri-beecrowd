#Walber Araújo 10/11/2023

regras = {
    'tesoura': ('papel', 'lagarto'),
    'papel': ('pedra', 'Spock'),
    'pedra': ('lagarto', 'tesoura'),
    'lagarto': ('Spock', 'papel'),
    'Spock': ('tesoura', 'pedra'),
}

nums_teste = int(input())

for i in range(nums_teste):
    sheldon, raj = input().split()
    if sheldon == raj: print(f"Caso #{i+1}: De novo!")
    elif raj in regras[sheldon]: print(f"Caso #{i+1}: Bazinga!")
    else: print(f"Caso #{i+1}: Raj trapaceou!")