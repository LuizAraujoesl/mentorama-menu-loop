package exercicioModulo09;

public class Cliente implements Autenticar {
    private String nome;
    private boolean status;
    private String senha;


    public Cliente(String nome, boolean status, String senha){
        this.nome = nome;
        this.status = status;
        this.senha = senha;

    }

    public String getNome(){
        return nome;
    }

    public String getSenha(){
        return senha;
    }

    @Override
    public String toString() {

        return "Clientes{" +
        "Nome= " + nome +
        ", Status= " + status +
        ", Senha= " + senha + 
        "}";
    }

    @Override
    public boolean autentica(String senha) {
        // TODO Auto-generated method stub
        if (this.senha != senha) {
            System.out.println("Náo autenticado");
            return false;
        } else {
            System.out.println("Autenticado");
            return true;
        }
    }
}
