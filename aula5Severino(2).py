#num = 0
#while num < 101:
#    num += 2
#    if num % 3:
#        print(num)
soma = 0
escolha = ''
while escolha.upper() == 'q':
    adic = float(input("Digite um numero para adicionar na soma: "))
    soma += adic
escolha = input("Deseja somar mais algum algarismo? ")
if escolha.upper() != 'q':
    str(print("Total dá: {}".format(soma)))