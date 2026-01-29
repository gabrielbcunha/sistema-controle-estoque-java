import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private int proximoId =1;
    private final List<Produto> produtos = new ArrayList<>();

    public Produto adicionarProduto(String nome, int preco, int quantidade){
        int idGerado = proximoId++;
        Produto produto = new Produto(idGerado, nome, preco, quantidade);
        produtos.add(produto);
        return produto;
    }

    public boolean removerProduto(int id){
        Produto alvo = buscarProdutoId(id);
        if(alvo != null){
            produtos.remove(alvo);
            return true;
        }
        return false;
    }

    public List<Produto> listarProdutos(){
        return new ArrayList<>(produtos);
    }

    public Produto buscarProdutoId(int id){
        for(Produto produto : produtos){
            if(produto.getId() == id){
                return produto;
            }
        }
        return null;
    }

    public boolean adicionarEstoque(int id, int quantidade){
        Produto alvo = buscarProdutoId(id);
        if(alvo != null){
            alvo.adicionarEstoque(quantidade);
            return true;
        }else {
            return false;
        }
    }

    public boolean removerEstoque(int id, int quantidade){
        Produto alvo = buscarProdutoId(id);
        if(alvo != null){
            alvo.removerEstoque(quantidade);
            return true;
        }else {
            return false;
        }
    }
}
