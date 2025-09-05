public class ContatoTelefoneCelular extends ContatoTelefone {
    public ContatoTelefoneCelular(String nome, String numero) {
        super(nome, numero);
    }

    public String getTipo() {
        return "Celular";
    }
}
