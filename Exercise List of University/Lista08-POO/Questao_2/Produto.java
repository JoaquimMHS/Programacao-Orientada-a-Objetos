public class Produto {
    private Codigo codigo;
    private String descricao;
    private double preco;

    public Produto(Codigo codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao='" + descricao + "', preco=" + preco + "}";
    }
}
