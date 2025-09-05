//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Funcionario {
    private String nome;
    private String cpf;
    private String setor;

    public Funcionario(){}

    public Funcionario(String nome, String cpf, String setor){
        this.nome = nome;
        this.cpf = cpf;
        this.setor = setor;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getSetor(){
        return setor;
    }


}