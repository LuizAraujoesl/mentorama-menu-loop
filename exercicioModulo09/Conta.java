package exercicioModulo09;

public abstract class Conta {

    // atributos
    private int agencia;
    private int numero;
    private String banco;
    protected double saldo;

    // costrutor
    public Conta(int agencia, int numero, String banco, double saldo){

          this.agencia = agencia;
          this.numero = numero;
          this.banco = banco;
          this.saldo = saldo;
    }

    // Getter and Setter Agencia

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;

    }

    // Getter and Setter Numero
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;

    }

    // Getter and Setter Banco
    public String getBanco() {
        return this.banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;

    }

    // Getter and Setter Numero

    public abstract double getSaldo();
  

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    // methodos abstratos
    protected abstract void sacar(double valorSaque); 
    protected abstract void depositar(double valorDeposito);


    @Override
    public String toString() {

        return "Conta{" +
        "Numero= " + numero +
        ", Agência= " + agencia +
        ", banco= " + banco + 
        ", Saldo= " + saldo +
        "}";
    }
}
