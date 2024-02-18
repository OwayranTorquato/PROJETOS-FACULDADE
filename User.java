public class User {
    private String nome;
    private String email;
    private Integer idade;
    private Cart carrinho;

    public User() {
        this.carrinho = new Cart();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void associarCarrinho(Cart carrinho) {
        this.carrinho = carrinho;
    }

    public Cart getCarrinho() {
        return carrinho;
    }

    public void Pagar() {
        // Implemente conforme necessário
    }
}