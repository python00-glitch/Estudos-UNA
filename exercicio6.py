print("Descubra seu IMC agora!")
peso = float(input("Digite seu peso: "))
altura = float(input("Digite a sua altura: "))

imc = peso/(altura**2)

if imc < 20:
    print("Voce esta ABAIXO DO PESO.")
elif imc < 25 or imc > 20:
    print("Seu peso é NORMAL.")
elif imc > 25 or imc < 30:
    print("Seu peso é SOBREPESO.")
elif imc > 30 or imc < 40:
    print("Seu peso é OBESO.")
elif imc > 40:
    print("Seu peso é OBESO MÓRBIDO.")

input(print("Pressione o Enter para finalizar.."))