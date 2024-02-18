def function (*args):
    for arg in args:
        print(arg)
    print(type(args))
function(1,2,3,4)
#------------------------------

def my_function(**kwargs):
    for chave, valor in kwargs.items():
        print(f"A chave é {chave} e o valor é {valor}")
    print (type(kwargs))

my_function(nome='João', idade=25, país='Brasil')
#------------------------------

def minha_fucao():
    return "Função do módulo"
if __name__=='__main__':
    print("Este script está sendo executado sozinho")
else:
    print("Este script foi importado!")
#------------------------------
