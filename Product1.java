public class Product1 {
    private String nome;
    private double preco;
    private double peso;

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }

    public double calcDesconto(boolean temDesconto) {
        if (temDesconto) {
            double desconto = preco * 0.1; 
            return preco - desconto;
        } else {
            return preco; 
        }
    }
}

