calificaciones = [80, 90, 55, 100 ,70]
sum = 0
for i in calificaciones:
    sum = sum + i
promedio = sum / len(calificaciones)
if promedio >= 60:
    print("El estudiante ha aprobado con un promedio de", promedio)
else:
    print("El estudiante NO ha aprobado", promedio)