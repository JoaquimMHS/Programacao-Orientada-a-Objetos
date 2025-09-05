public class Empregado_Comissão extends Funcionario{
    private double salario;
    private int totalVendas;
    private double percentualComissao;

    public Empregado_Comissão(String nome, String cpf, String  setor, double salario, int totalVendas, double percentualComissao){
        super(nome, cpf, setor);
        this.salario = salario;
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }
    public double getSalario(){
        return salario;
    }
    public int getTotalVendas(){
        return totalVendas;
    }
    public double getPercentualComissao(){
        return percentualComissao;
    }
}
