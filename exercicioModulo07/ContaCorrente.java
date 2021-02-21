package exercicioModulo07;

public class ContaCorrente extends Conta {
    //atributos
    private double chequeEspecial;

    //costrutor
    // recebendo como erança  atributos Classe Conta 
    public ContaCorrente(int agencia, int numero, String banco, double saldo, double chequeEspecial){
        super(agencia, numero, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    // obrigado a implementat methodo getSaldo()
    //methodo abstrato
   @Override
   public double getSaldo() {
       return  this.chequeEspecial += this.saldo;
   }



    // toString
    
    @Override
    public String toString() {

        return "Conta{" +
        "Cheque Especial= " + chequeEspecial +
        "}";
    }

    
}
