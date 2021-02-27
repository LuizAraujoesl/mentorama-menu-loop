package exercicioModulo09;

import java.util.function.Consumer;

public class Cliente implements Autenticar, Consumer<Cliente> {
    private String nome;
    private boolean status;
    private String senha;
    private int compras;


    public Cliente(String nome, boolean status, String senha, int compras){
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.compras = compras;

    }

    public String getNome(){
        return nome;
    }

    public String getSenha(){
        return senha;
    }

    public int getCompras() {
        return compras;
    }

    @Override
    public String toString() {

        return "Cliente { " +
        " Nome: " + nome +
        ", Status: " + status +
        ", Senha:" + senha + 
        ", Compras:" + compras +
        " } ";
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

    @Override
    public void accept(Cliente t) {
        // TODO Auto-generated method stub

    }
}
