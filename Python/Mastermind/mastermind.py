
# Juego Mastermind

# Se implementa la librería random
import random 

digitos =('0','1','2','3','4','5','6','7','8','9')

codigo=''

for i in range(4):
    candidato = random.choice(digitos)
    while candidato in codigo:
        candidato = random.choice(digitos)
    codigo = codigo + candidato
    


print ("Bienvenido al Mastermind¡")
print ("Tienes que adivinar un numero de 4 cifras distintas")
propuesta = input("¿Qué código propones? ")

intentos = 0
while propuesta != codigo:
    intentos = intentos + 1
    aciertos = 0
    coincidencia = 0
    for i in range(4):
        if propuesta[i] == codigo[i]:
            aciertos += 1
        elif propuesta[i] in codigo:
            coincidencia += 1
    print("Tu propuesta "+ propuesta +" tiene "+ str(aciertos) +" aciertos "+ str(coincidencia) + " coincidencias")
    propuesta = input(" Propone otro código ")


print("Felicidades adivinaste el código en " + str(intentos) + " intentos")

