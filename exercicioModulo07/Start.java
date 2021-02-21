package exercicioModulo07;

public class Start {

    public static void main(String[] args) {

        //Conta c1 = new Conta(1, 1, "Banco C6", 100.00);
        // System.out.println(c1);

        ContaCorrente cc1 = new ContaCorrente(0001, 3576, "Banco Brasil", 100.00, 1000.00);
        System.out.println();
        System.out.println(cc1);
        System.out.println("Valor Cheque Especial = " + cc1.getChequeEspecial());
        System.out.println("Seu saldo Conta-Corrent + Cheque Especial= " + cc1.getSaldo());
        System.out.println();
        cc1.depositar(150.00);
        System.out.println("Você Depositou= " + cc1.valorDeposito);
        System.out.println("Seu saldo Conta-Corrent + Cheque Especial= " + cc1.getSaldo());
        System.out.println();
        cc1.sacar(50.00);
        System.out.println("Você Sacou= " + cc1.valorSaque);
        System.out.println("Seu saldo Conta-Corrent + Cheque Especial= " + cc1.getSaldo());
        // Sacando Valor não permitido
        System.out.println();
        cc1.sacar(3000.00);
        System.out.println("Você tentou sacar = " + cc1.valorSaque);
     

        System.out.println("=================================================================================");

        ContaPoupanca p1 =  new ContaPoupanca(0003, 0003, "Itau Unibanco", 95.00, 20, 0.05);
        System.out.println(p1);
        System.out.println("Taixa de Juros % = " + p1.getTaxaDeJuros());
        System.out.println("Saldo total da Conta Poupança= " + p1.getSaldo());
        
        System.out.println();
        p1.depositar(50.00);
        System.out.println("Você fez Depósito de= " + p1.valorDeposito );
        System.out.println("Seu saldo Conta Poupança + Taxa de Juros % = " + p1.getSaldo());
        System.out.println();
        p1.sacar(20.00);
        System.out.println("Você fez um Saque de= " + p1.valorSaque);
        System.out.println("Seu saldo Conta Poupança + Taxa de Juros % = " + p1.getSaldo());
        

    }

}
