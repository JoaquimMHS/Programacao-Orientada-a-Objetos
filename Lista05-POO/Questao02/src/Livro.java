public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor, boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public boolean getEmprestado(){
        return emprestado;
    }

   public boolean emprestar(){
        return emprestado = true;
   }
   public boolean devolver(){
        return emprestado = false;
   }

   public String toString(){
        return String.format("Dados do Livro\nTitulo: %s\nAutor: %s\nEmprestado: %b\n", titulo,autor,emprestado);
   }


}
