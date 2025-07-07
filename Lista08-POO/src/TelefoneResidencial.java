public class TelefoneResidencial extends ContatoTelefone{

    public TelefoneResidencial(String nome, String numero){
        super(nome, numero);
    }

    @Override
    public String getTipo() {
        return "Residencial";
    }
}
