package exercicioModulo09;

public class ContaCorrente extends Conta {
    //atributos
    private double chequeEspecial;
    protected double valorSaque;
    protected double valorDeposito;


    //costrutor
    // recebendo como erança  atributos Classe Conta 
    public ContaCorrente(int agencia, int numero, String banco, double saldo, double chequeEspecial){
        super(agencia, numero, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    // Getter and Setter cheque especial

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void setChequeEspecial(int valorChequeEspecial) {
        this.chequeEspecial = valorChequeEspecial;

    }

    // obrigado a implementat methodo getSaldo()
    //methodo abstrato
   @Override
   public double getSaldo() {
       double total = this.saldo + this.chequeEspecial;
       return  total;
   }

   
    // obrigado a implementat methodo sacar()
    //methodo abstrato
    @Override
    public void sacar( double valorSaque) {
        this.valorSaque = valorSaque;
        if (this.valorSaque <= this.saldo) {
            this.saldo -= this.valorSaque;
        } else {
            System.out.println("Seu saldo atual e de= " + getSaldo());
            System.out.println("Valor Indisponivel ligue ou va até uma Agência mais Próxima!!");

        }
        
    }

    // obrigado a implementat methodo sacar()
    //methodo abstrato
    @Override
    public void depositar( double valorDeposito) {
            this.valorDeposito = valorDeposito;
            this.saldo += this.valorDeposito;
      
    }



    // toString
    
    @Override
    public String toString() {

        return "Conta Corrent{" +
        "Numero Agencia= " + this.getAgencia() +
        ", Numero Conta= " +  this.getNumero() +
        ", Banco= " +  this.getBanco() +
        "}";
    }

    
}
