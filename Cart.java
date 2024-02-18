import java.util.ArrayList;
import java.util.List;

public class Cart {
    private double precoBruto;
    private double taxa;
    private double precoTotal;
    private List<Product1> produtos;

    public Cart() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Product1 produto) {
        produtos.add(produto);
        calcularPrecoBruto();
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void calcularPrecoBruto() {
        precoBruto = 0;
        for (Product1 produto : produtos) {
            precoBruto += produto.getPreco();
        }
    }

    public void calcularPrecoTotal() {
        double desconto = precoBruto * taxa;
        precoTotal = precoBruto - desconto;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public List<String> listarProdutos() {
        List<String> nomesProdutos = new ArrayList<>();
        for (Product1 produto : produtos) {
            nomesProdutos.add(produto.getNome());
        }
        return nomesProdutos;
    }
}
