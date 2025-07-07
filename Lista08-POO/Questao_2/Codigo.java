public class Codigo {
    private String setor;
    private int numero;

    public Codigo(String setor, int numero) {
        this.setor = setor;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return setor + numero;
    }
}
