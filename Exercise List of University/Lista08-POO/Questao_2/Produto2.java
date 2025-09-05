public class Produto2<T, P> {
    private T codigo;
    private String descricao;
    private P preco;

    public Produto2(T codigo, String descricao, P preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public T getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public P getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto2{" + "codigo=" + codigo + ", descricao='" + descricao + "', preco=" + preco + "}";
    }
}
