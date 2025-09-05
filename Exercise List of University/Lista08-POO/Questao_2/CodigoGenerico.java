public class CodigoGenerico<T1, T2> {
    private T1 parte1;
    private T2 parte2;

    public CodigoGenerico(T1 parte1, T2 parte2) {
        this.parte1 = parte1;
        this.parte2 = parte2;
    }

    @Override
    public String toString() {
        return parte1.toString() + parte2.toString();
    }
}
