import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;
    public Agenda(){
        contatos = new ArrayList<>();
    }
    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }
    public boolean removerContato(String contato){
        for( int i = 0; i < contatos.size(); i++){
            if(contato == contatos.get(i)){
                contatos.remove(i);
                return true;
            }
        }
        return false;
    }
    public String buscarContato(String nome){
        for( int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equalsIgnoreCase(nome)){
                return String.format("Nome: %s", contatos.get(i).getNome());
            }
        }
        return null;
    }
    public void listarContatos(){
        for( int i = 0; i < contatos.size(); i++){
            System.out.println("Nome: %s"+ contatos.get(i).getNome());
            System.out.println("Telefone: %s"+ contatos.get(i).getTelefone());
            System.out.println("Email: %s"+ contatos.get(i).getEmail());
        }
    }

}
