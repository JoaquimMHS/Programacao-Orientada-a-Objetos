public class ContatoFax implements Contato {
    private String nome;
    private String numeroFax;

    public ContatoFax(String nome, String numeroFax) {
        this.nome = nome;
        this.numeroFax = numeroFax;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return numeroFax;
    }

    public String getTipo() {
        return "Fax";
    }
}
