package Questão03;

public class excecao {
    // Classes não públicas dentro da classe container
    public static class ExcecaoDadoInvalido extends Exception {
        public ExcecaoDadoInvalido(String mensagem) {
            super(mensagem);
        }
    }

    public static class ExcecaoRepositorio extends Exception {
        public ExcecaoRepositorio(String mensagem) {
            super(mensagem);
        }
    }

    public static class ExcecaoElementoJaExistente extends Exception {
        public ExcecaoElementoJaExistente(String mensagem) {
            super(mensagem);
        }
    }

    public static class ExcecaoElementoInexistente extends Exception {
        public ExcecaoElementoInexistente(String mensagem) {
            super(mensagem);
        }
    }
}
