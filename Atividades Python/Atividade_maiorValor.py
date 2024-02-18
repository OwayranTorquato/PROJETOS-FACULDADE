  def maior_valor (valor1,valor2):
    if valor1>valor2:
        return valor1
    else:
        return valor2

valor1 = float(input("Insira o valor 1: "))
valor2 = float(input("Insira o valor 2: "))

maiorvalor = maior_valor(valor1,valor2)
print (f"O maior valor digitado foi {maiorvalor}")
