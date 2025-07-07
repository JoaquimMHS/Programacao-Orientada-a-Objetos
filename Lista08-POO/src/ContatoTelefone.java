public abstract class ContatoTelefone implements Contato{
    private String nome;
    private String numero;

    public ContatoTelefone(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }
    @Override
    public String getContato(){return numero;}
    @Override
    public String getNome(){return nome;}
    @Override
    public abstract String getTipo();
}
