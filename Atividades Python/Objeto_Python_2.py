class Endereco:
    def __init__(self, logradouro, cidade):
        self.logradouro = logradouro
        self.cidade = cidade
    def mostrar_endereco(self):
        return f"{self.logradouro}, {self.cidade}"

class Pessoa:
    def __init__(self, nome, endereco):
        self.nome=nome
        self.endereco = endereco
    def mostrar_informacoes(self):
        return f"{self.nome} esta localizada em {self.endereco.mostrar_endereco()}"

endereco_maria = Endereco("Av. Principal","São Paulo")
maria = Pessoa ("Maria",endereco_maria)
print(maria.mostrar_informacoes())