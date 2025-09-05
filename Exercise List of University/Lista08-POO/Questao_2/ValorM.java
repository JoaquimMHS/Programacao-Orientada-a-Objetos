public class ValorM {
    private double valor;

    public ValorM(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "R$ " + String.format("%.2f", valor);
    }
}
