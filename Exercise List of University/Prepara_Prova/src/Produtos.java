//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Produtos {
   private String nome;
   private String descricao;
   private double preco;

   public Produtos(String nome, String descricao, double preco){
      this.nome = nome;
      this.descricao = descricao;
      this.preco = preco;
   }

   public String getNome(){
      return nome;
   }
   public String getDescricao(){
      return descricao;
   }
   public double getPreco(){
      return preco;
   }


}