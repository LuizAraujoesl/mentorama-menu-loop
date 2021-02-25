package exercicioModulo09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Start {

    public static void main(String[] args) {
     
        /** 
        ContaCorrente cc1 = new ContaCorrente(001, 123, "C6 Bank", 100.00, 1000.0);
        ContaCorrente cc2 = new ContaCorrente(002, 456, "C6 Bank", 100.00, 150.0);
        ContaCorrente cc3 = new ContaCorrente(003, 789, "C6 Bank", 100.00, 999.0);

        List<ContaCorrente>contas = Arrays.asList(cc1, cc2, cc3);
        
        System.out.println();

       for (ContaCorrente conta : contas) {
            System.out.println("\t" + conta + "\n");
       }
       
       */

       Cliente cl1 = new Cliente("Fabiano", true, "abc");
       Cliente cl2 = new Cliente("Mentorama", true, "iop");
       Cliente cl3 = new Cliente("Brasil", false, "qwe");
    

       List<Cliente> clientes = Arrays.asList(cl1, cl2, cl3);

       Consumer<Cliente> consumer = (Cliente cl) -> {System.out.println(cl.getNome());};

       clientes.forEach(cl -> System.out.println(cl.getNome()));
       
        /** 
      
        //instanciando Conta Corrente
        ContaCorrente cc1 = new ContaCorrente(0001, 3576, "Banco Brasil", 100.00, 1000.00);
        System.out.println();

        // imprimindo conta corrente
        System.out.println(cc1);
        //pegando valor Cheque Especial
        System.out.println("Valor Cheque Especial = " + cc1.getChequeEspecial()); 
        // pegando saldo total Conta-Corrente + cheque especial
        System.out.println("Seu saldo Conta-Corrent + Cheque Especial= " + cc1.getSaldo());
        System.out.println();

        //depositanto valor Conta-Corrente
        cc1.depositar(150.00);
        //pegando valor depositado
        System.out.println("Você Depositou= " + cc1.valorDeposito);
        // pegando saldo total Conta-Corrente + cheque especial
        System.out.println("Seu saldo Conta-Corrent + Cheque Especial= " + cc1.getSaldo());
        System.out.println();

        //Sacando Valor Conta-Corrente
        cc1.sacar(50.00);
        //pegando valor sacado
        System.out.println("Você Sacou= " + cc1.valorSaque);
        // pegando saldo total Conta-Corrente + cheque especial
        System.out.println("Seu saldo Conta-Corrent + Cheque Especial= " + cc1.getSaldo());
        

        // Sacando Valor não permitido
        System.out.println();
        cc1.sacar(3000.00);
        System.out.println("Você tentou sacar = " + cc1.valorSaque);
     

        System.out.println("=================================================================================");


        
        // instanciando Conta-Pupança
        ContaPoupanca p1 =  new ContaPoupanca(0003, 0003, "Itau Unibanco", 95.00, 20, 0.05);
        
        //imprimindo Conta-Poupanca
        System.out.println(p1);
        //Informando Taxa de Juros %
        System.out.println("Taixa de Juros % = " + p1.getTaxaDeJuros());
        //informando Saldo total + taxa juros % se houver
        System.out.println("Saldo total da Conta Poupança + taxa Juros % se Houver= " + p1.getSaldo());
        System.out.println();

        // Depositando Valor 
        p1.depositar(50.00);
        // informando valor deposito
        System.out.println("Você fez Depósito de= " + p1.valorDeposito );
        //informando Saldo total + taxa juros % se houver
        System.out.println("Seu saldo Conta Poupança + Taxa de Juros % se Houver= " + p1.getSaldo());
        System.out.println();

        // Foi alterado valor dia do saque  então nao ha taxad e Juros %  porque não completou aniversário
         //Valor sera retornado sem juros % 0.05
         
        p1.setDiaAniversario(25);
        // sacando valor
        p1.sacar(20.00);
        //pegando valor do saque
        System.out.println("Você fez um Saque de= " + p1.valorSaque);
        //informando Saldo total + taxa juros % se houver
        System.out.println("Seu saldo Conta Poupança + Taxa de Juros % se Houver= " + p1.getSaldo());
        System.out.println();
        // Foi alterado valor dia do saque  para data correta entao ha taxad e Juros %  
         //Valor sera retornado com juros % 0.05
         
        p1.setDiaAniversario(20);
        //informando Saldo total + taxa juros % se houver
          
        System.out.println("Seu saldo Com taxa de Juros %");
        System.out.println("Seu saldo Conta Poupança + Taxa de Juros % se Houver= " + p1.getSaldo());
        
        System.out.println("=================================================================================");
        System.out.println();

        //instanciando  Conta-salario
        ContaSalario cs1 =  new ContaSalario(0004, 12345, "Bradesco", 1250.00);
        //imprimindo conta salario
        System.out.println(cs1);
        System.out.println("Você só tem 03 saques disponiveis!");
        //omprimindo valor total Conta-Salario
        System.out.println("Salto total Conta-Salário= " + cs1.getSaldo());
        System.out.println();

        //sancando valor Conta-Salario
        cs1.sacar(20.00);
        // pegando Valor Sacado
        System.out.println("Você Sacou= " + cs1.valorSaque);
        //imprimindo valor Conta-Salario
        System.out.println("Seu saldo Conta-Salário= " + cs1.getSaldo());
        System.out.println();


        //sancando valor Conta-Salario
        cs1.sacar(20.00);
        // pegando Valor Sacado
        System.out.println("Você Sacou= " + cs1.valorSaque);
        //imprimindo valor Conta-Salario
        System.out.println("Seu saldo Conta-Salário= " + cs1.getSaldo());
        System.out.println();

        //sancando valor Conta-Salario
        cs1.sacar(20.00);
        // pegando Valor Sacado
        System.out.println("Você Sacou= " + cs1.valorSaque);
        //imprimindo valor Conta-Salario
        System.out.println("Seu saldo Conta-Salário= " + cs1.getSaldo());
        System.out.println();

        //sancando valor Conta-Salario
        cs1.sacar(20.00);
        // pegando Valor Sacado
        System.out.println("Você Sacou tentou Sacar = " + cs1.valorSaque);
        //imprimindo valor Conta-Salario
        System.out.println("Seu saldo Conta-Salário= " + cs1.getSaldo());
        System.out.println();
         
        */
     
      

    }

}
