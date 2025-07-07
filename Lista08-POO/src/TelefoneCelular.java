public class TelefoneCelular extends ContatoTelefone{

    public TelefoneCelular(String nome, String numero){
        super(nome, numero);
    }

    @Override
    public String getTipo() {
        return "Celular";
    }
}
