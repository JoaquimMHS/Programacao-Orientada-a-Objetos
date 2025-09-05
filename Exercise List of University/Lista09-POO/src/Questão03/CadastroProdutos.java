package Questão03;

public class CadastroProdutos {
    private Produto[] produtos;
    private int quantidade;

    public CadastroProdutos(int capacidade) {
        this.produtos = new Produto[capacidade];
        this.quantidade = 0;
    }

    public void inserir(Produto produto) {
        try {
            if (quantidade >= produtos.length) {
                throw new excecao.ExcecaoRepositorio("Não há mais espaço para novos produtos!");
            }

            for (int i = 0; i < quantidade; i++) {
                if (produtos[i].getCodigo() == produto.getCodigo()) {
                    throw new excecao.ExcecaoElementoJaExistente("Já existe um produto com o código " + produto.getCodigo() + " cadastrado!");
                }
            }

            produtos[quantidade] = produto;
            quantidade++;
        } catch (Exception e) {
            System.out.println("Erro ao inserir produto: " + e.getMessage());
        }
    }

    public Produto buscar(int codigo) {
        try {
            for (int i = 0; i < quantidade; i++) {
                if (produtos[i].getCodigo() == codigo) {
                    return produtos[i];
                }
            }
            throw new excecao.ExcecaoElementoInexistente("Produto com código " + codigo + " não encontrado!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }

    public String obterDescricaoCompleta(int codigo) {
        try {
            Produto produto = buscar(codigo);
            if (produto == null) {
                throw new excecao.ExcecaoElementoInexistente("Produto não encontrado!");
            }
            return produto.toString();
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }
}