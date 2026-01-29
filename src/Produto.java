public class Produto {
    private final int id;
    private final String nome;
    private final int preco;
    private int quantidade;

    public Produto(int id, String nome, int preco, int quantidade) {

        if (id <= 0){
            throw new IllegalArgumentException("Id do produto deve ser positivo");
        }
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O produto deve conter um nome");
        }
        if(preco < 0){
            throw new IllegalArgumentException("O preço do produto não pode ser negativo");
        }
        if(quantidade < 0){
            throw new IllegalArgumentException("Quantidade do produto não pode ser negativa");
        }

        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "[Id:"+ getId() +" | Nome: " + getNome() + " | Preço:" + getPreco() + " | Quantidade: " + getQuantidade() + "]";
    }
}
