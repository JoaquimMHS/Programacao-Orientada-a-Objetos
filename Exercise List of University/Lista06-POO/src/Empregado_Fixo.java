public class Empregado_Fixo extends Funcionario {
    private double salario;

    public Empregado_Fixo(String nome, String cpf, String setor, double salario){
        super(nome, cpf, setor);
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}
