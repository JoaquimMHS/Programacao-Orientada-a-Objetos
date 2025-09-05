public class AplProduto {
    public static void main(String[] args) {
        Codigo cod1 = new Codigo("IMP", 34);
        Produto prod1 = new Produto(cod1, "Impressora", 799.99);
        System.out.println(prod1);

        CodigoGenerico<String, Integer> codGen = new CodigoGenerico<>("SEC", 1413);
        Produto2<CodigoGenerico<String, Integer>, ValorM> prod2 = new Produto2<>(codGen, "Monitor", new ValorM(1250.50));
        System.out.println(prod2);
    }
}
