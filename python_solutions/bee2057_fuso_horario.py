# Walber Araújo14/11/2023

hora_saida, tempo_viagem, fuso_horario_destino = (int(n) for n in input().split())
hora_chegada = hora_saida + tempo_viagem + fuso_horario_destino

if hora_chegada >= 24: hora_chegada -= 24
elif hora_chegada < 0: hora_chegada += 24
print(hora_chegada)