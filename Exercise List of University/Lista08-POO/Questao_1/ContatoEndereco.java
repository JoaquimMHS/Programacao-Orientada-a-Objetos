public class ContatoEndereco implements Contato {
    private String nome;
    private String endereco;

    public ContatoEndereco(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return endereco;
    }

    public String getTipo() {
        return "Endereço";
    }
}
