package exercicioModulo07;

public class Start {

    public static void main(String[] args) {

        //Conta c1 = new Conta(1, 1, "Banco C6", 100.00);
        // System.out.println(c1);

        ContaCorrente cc1 = new ContaCorrente(0001, 3576, "Banco Brasil", 100.00, 1000.00);
        System.out.println(cc1);
        System.out.println("Saldo total Conta Corrente= " + cc1.getSaldo());

        System.out.println("=================================================================================");

        ContaPoupanca p1 =  new ContaPoupanca(0003, 0003, "Itau Unibanco", 95.00, 20, 0.05);
        System.out.println(p1);
        System.out.println("Saldo total da Conta Poupança= " + p1.getSaldo());
        System.out.println("Taixa de Juros % = " + p1.getTaxaDeJuros());
        

    }

}
