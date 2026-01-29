import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Sistema de controle de estoque");
            System.out.println("------------------------------");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Listar Produtos");
            System.out.println("4 - Procurar Produto por Id");
            System.out.println("0 - Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    try {
                        System.out.println("Digite o nome do produto: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite o preço do produto: ");
                        int preco = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite a quantidade do produto: ");
                        int quantidade = sc.nextInt();
                        sc.nextLine();
                        Produto produtoCriado = estoque.adicionarProduto(nome, preco, quantidade);
                        System.out.println("Produto adicionado com sucesso! ID: " + produtoCriado.getId());
                    }catch(IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                break;
                case 2:
                    System.out.println("Digite o Id do produto a ser excluido: ");
                    int idExcluir = sc.nextInt();
                    sc.nextLine();
                    Produto produtoExcluido = estoque.buscarProdutoId(idExcluir);
                    if(produtoExcluido == null) {
                        System.out.println("Produto não encontrado!");
                    }else {
                        estoque.removerProduto(idExcluir);
                        System.out.println("Produto removido com sucesso! " + produtoExcluido);
                    }
                break;
                case 3:
                    System.out.println("Lista de produtos no estoque");

                    var lista = estoque.listarProdutos();
                    if (lista.isEmpty()) {
                        System.out.println("O estoque está vazio!");
                    }else{
                        for (Produto p : lista) {
                            System.out.println(p);
                        }
                    }
                break;
                case 4:
                    System.out.println("Digite o id do produto a ser procurado: ");
                    int idProcurado = sc.nextInt();
                    sc.nextLine();
                    Produto produtoProcurado = estoque.buscarProdutoId(idProcurado);
                    if(produtoProcurado != null) {
                        System.out.println("Produto encontrado com sucesso! " + produtoProcurado);
                    }else  {
                        System.out.println("Produto não encontrado!");
                    }
                break;
                case 0:
                    System.out.println("Encerrando...");
                return;
                default:
                    System.out.println("Insira uma opção válida");
                break;
            }
        }
    }
}