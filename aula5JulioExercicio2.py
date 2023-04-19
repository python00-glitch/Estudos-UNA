c_salario = 0
c_filho = 0
contador = 0

while True:
    try:
        salario = float(input("Digite o seu salário (ou digite um valor negativo para sair): "))

        if salario == 0:
            raise ValueError("Salário não pode ser igual a zero.")
        filho = int(input("Digite a quantidade de filhos que você tem: "))
        c_salario += salario
        c_filho += filho
        contador += 1
        conf = str.upper(input("Digite \x1b[38;5;1m'STOP'\x1b[m se deseja parar a pesquisa "
                               "\nOu pressione \x1b[38;5;48m'Enter'\x1b[m para retomar: "))
        if conf == 'STOP':
            break
    except ValueError as e:
        print("Insira um salário com saldo positivo. Erro: {}".format(str(e)))
        input("Pressione qualquer tecla para retomar...")

if contador > 0:
    m_salario = c_salario / contador
    m_filho = c_filho / contador
    print("")
    print("Média salarial é de R${:.2f}".format(m_salario))
    print("E a média de filhos é de {:.2f}".format(m_filho))
else:
    print("Nenhum dado foi inserido.")
