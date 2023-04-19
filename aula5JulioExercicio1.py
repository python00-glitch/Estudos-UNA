RA = int(input("Digite seu RA: "))
nome = str.upper(input("Digite seu nome completo: "))
#confirmacao = 'Q'
#if RA == "62311953" and nome == "Ricardo Junior Pardim Silva":
#        print("Acesso concedido com sucesso!")
#        input("Pressione Enter para prosseguir...")
#else:
#    confirmacao = print(input("Acesso negado, tente novamente..."))
#    str.upper(input("Pressione 'Q' para continuar..."))
#    if confirmacao == 'Q':

nota1 = int(input("Informe sua primeira nota: "))
nota2 = int(input("Informe sua primeira nota: "))
nota3 = int(input("Informe sua primeira nota: "))
n = nota1 + nota2 + nota3 / 2
if n >= 70:
    print("\x1b[38;5;6m{}\x1b[m, o total da média das suas notas deu {}. \nVocê está aprovado!".format(nome, n))
elif n >= 60 and n / 2 < 70:
    print("\x1b[38;5;6m{}\x1b[m, o total da média das suas notas deu {}. \nVocê está de recuperação!".format(nome, n))
elif n < 60:
    print("\x1b[38;5;6m{}\x1b[m, o total da média das suas notas deu {}. \nVocê foi reprovado!".format(nome, n))