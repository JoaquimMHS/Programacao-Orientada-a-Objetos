public class ContatoTelefoneComercial extends ContatoTelefone {
    public ContatoTelefoneComercial(String nome, String numero) {
        super(nome, numero);
    }

    public String getTipo() {
        return "Comercial";
    }
}
