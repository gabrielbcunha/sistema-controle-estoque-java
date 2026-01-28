public class Produto {
    private String nome;
    private int preco;
    private int quantidade;

    public Produto(String nome, int preco, int quantidade) {
        if(quantidade < 0){
            throw new IllegalArgumentException("Quantidade Produto não pode ser negativa");
        }
        if(preco < 0){
            throw new IllegalArgumentException("O preço Produto não pode ser negativo");
        }
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Produto deve conter um nome");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "[Nome: " + getNome() + "| Preço:" + getPreco() + "| Quantidade: " + getQuantidade() + "]";
    }
}
