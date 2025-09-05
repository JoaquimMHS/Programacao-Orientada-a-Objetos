public abstract class ContatoTelefone implements Contato {
    protected String nome;
    protected String numero;

    public ContatoTelefone(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return numero;
    }

    public abstract String getTipo();
}
