class Carro:
    pneus = 4
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
carro1 = Carro("Ford","Fiesta")
carro2= Carro("Honda", "Civic")
print (carro1.pneus)
print(carro2.pneus)
print(Carro.pneus)

class turma:
    def __init__(self, nome, sobrenome):
        self.nome = nome
        self.sobrenome = sobrenome
    def texto(self):
        print(f"O meu nome é {self.nome} e meu sobrenome é {self.sobrenome}")
aluno1 = turma("Owayran", "Torquato")
aluno1.texto()

class estudante:
    def __init__(self, nome, idade):
        self.nome= nome
        self.idade = idade
    def apresentar(self):
        print(f"O meu nome é {self.nome}, e eu tenho {self.idade} anos")
estudante1 = estudante ("Owayran", "25")
estudante1.apresentar()

class livro:
    def __init__(self, titulo, autor, ano_publicacao):
        self.titulo = titulo
        self.autor = autor
        self.ano_publicacao = ano_publicacao
    def descricao(self):
        print(f"O livro {self.titulo}, foi escrito por {self.autor} e publicado em {self.ano_publicacao}")
livro1 = livro("As seis lições","Mises","1985")
livro2 = livro("Projeto Orvil", "Exército Brasileiro", "1965")

livro1.descricao()
livro2.descricao()
        