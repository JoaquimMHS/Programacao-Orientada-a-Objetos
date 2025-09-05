package Questão03;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        setCodigo(codigo);
        setNome(nome);
        setPreco(preco);
        setEstoque(estoque);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        try {
            if (codigo <= 0) {
                throw new excecao.ExcecaoDadoInvalido("O código deve ser maior que 0 (zero)!");
            }
            this.codigo = codigo;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try {
            if (nome == null || nome.trim().isEmpty()) {
                throw new excecao.ExcecaoDadoInvalido("Nome não pode ser vazio ou nulo!");
            }
            this.nome = nome;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        try {
            if (preco < 0) {
                throw new excecao.ExcecaoDadoInvalido("O preço não pode ser negativo!");
            }
            this.preco = preco;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        try {
            if (estoque < 0) {
                throw new excecao.ExcecaoDadoInvalido("Quantidade de estoque não pode ser negativa!");
            }
            this.estoque = estoque;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.format("Produto [código=%d, nome=%s, preço=%.2f, estoque=%d]",
                codigo, nome, preco, estoque);
    }
}