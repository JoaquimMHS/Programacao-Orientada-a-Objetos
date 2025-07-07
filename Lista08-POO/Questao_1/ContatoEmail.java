public class ContatoEmail implements Contato {
    private String nome;
    private String email;

    public ContatoEmail(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return email;
    }

    public String getTipo() {
        return "E-mail";
    }
}
