import tkinter as tk
from tkinter import *
from tkinter import messagebox

# Definindo a função que será executada para enviar a mensagem
def botao_enviar():
    nome = entrada_nome.get()
    mensagem = entrada_mensagem.get()
    
    # Definindo condição para exibição da janela com a mensagem
    if nome and mensagem :
        bisteca = tk.Toplevel(janela_main)
        bisteca.title("Mensagem enviada")

        # Criar um texto para aparecer na tela
        texto = tk.Label(bisteca, text=f"{nome} diz: {mensagem}")
        texto.pack()

    else:
        messagebox.showerror("Erro", "Por favor, insira um nome e uma mensagem")

# Definindo janela
corVerde= "#32d15d"
janela_main= tk.Tk()
janela_main.title("Mensagem")
janela_main.geometry('250x150')
janela_main.config(bg=corVerde)

# Configuranbdo informações de entrada do Nome
info_nome = tk.Label(janela_main, text="Nome", bg=corVerde)
info_nome.pack()
entrada_nome = tk.Entry(janela_main)
entrada_nome.pack()

# Configurando informações de entrada da mensagem
info_mensagem = tk.Label(janela_main, text="Mensagem", bg=corVerde)
info_mensagem.pack()
entrada_mensagem = tk.Entry(janela_main)
entrada_mensagem.pack()

# Configurando informações e função do Botão
botao = tk.Button(janela_main, text='Enviar', command=botao_enviar)
botao.pack()

# Configurando mensagem para aguardar o usuário inserir os dados
mensagem_esperando = tk.Label(janela_main,text=f"Esperando a mensagem do usuário")
mensagem_esperando.pack()


janela_main.mainloop()


