public class ContatoTelefoneResidencial extends ContatoTelefone {
    public ContatoTelefoneResidencial(String nome, String numero) {
        super(nome, numero);
    }

    public String getTipo() {
        return "Residencial";
    }
}
