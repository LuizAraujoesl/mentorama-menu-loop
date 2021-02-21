package exercicioModulo07;

public class ContaSalario extends Conta {
   
    protected double valorSaque;
    protected int limiteSaquePorDia;
   

    //costrutor
    // recebendo como erança  atributos Classe Conta 
    public ContaSalario(int agencia, int numero, String banco, double saldo){
      super(agencia, numero, banco, saldo);
    }


    // obrigado a implementat methodo getSaldo()
    //methodo abstrato
   @Override
   public double getSaldo() {
  
       return  this.saldo;
   }
   
  

   
    // obrigado a implementat methodo sacar()
    //methodo abstrato
    @Override
    public void sacar( double valorSaque) {
        
        this.valorSaque = valorSaque;
        System.out.println("Este seu " + (this.limiteSaquePorDia + 1) + " Saque");

        if (this.valorSaque <= this.saldo & this.limiteSaquePorDia != 3) {
            this.saldo -= this.valorSaque;
            this.limiteSaquePorDia +=1;

        } else {
    
            System.out.println("Você esgotou limite de saque ou limite indisponivel");

        }
    }

    // obrigado a implementat methodo sacar()
    //methodo abstrato
    @Override
    public void depositar( double valorDeposito) {
       System.out.println("Não pode Depositar se nao for CNJP");
    }

       // toString
    
       @Override
       public String toString() {
   
        return "Conta Salário{" +
        "Numero Agencia= " + this.getAgencia() +
        ", Numero Conta= " +  this.getNumero() +
        ", Banco= " +  this.getBanco() +
        "}";
       }
}
