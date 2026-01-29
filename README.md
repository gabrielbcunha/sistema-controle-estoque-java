# Sistema de Controle de Estoque (Java • Console)

Projeto em Java desenvolvido para praticar **lógica de programação** e **Programação Orientada a Objetos (POO)**, simulando um sistema simples de controle de estoque via terminal.

## Funcionalidades
- Cadastrar produto (com **ID gerado automaticamente**)
- Remover produto por ID
- Listar produtos cadastrados
- Buscar produto por ID
- Entrada e saída de estoque de produto por ID (adição e remoção de quantidade)

## Regras e validações
- ID do produto é **imutável** e gerado pelo sistema
- Não permite:
  - nome vazio
  - preço negativo
  - quantidade negativa
  - saída de estoque maior do que a quantidade disponível
- Operações por ID retornam mensagem de “não encontrado” quando o produto não existe


## Estrutura do projeto
- `Produto`: representa os dados do produto e valida o estado do objeto
- `Estoque`: contém as regras de negócio e gerencia a lista de produtos
- `Main`: menu e interação com o usuário via `Scanner`

Estrutura de pastas:
```bash
src/
├── Main.java
├── Estoque.java
└── Produto.java
```

## Tecnologias e conceitos
- Java
- POO (encapsulamento, classes e objetos)
- `ArrayList` / `List`
- Tratamento de exceções (`IllegalArgumentException`)
- Boas práticas (separação de responsabilidades)

## Como executar
### Opção 1: IntelliJ IDEA
1. Abra o projeto no IntelliJ
2. Execute a classe `Main`

### Opção 2: Terminal (javac/java)
Dentro da pasta do projeto:
```bash
javac src/*.java
java -cp src Main
