package exercicioModulo09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.Box.Filler;

import exercicioModulo08.integer;

public class Start {

    public static void main(String[] args) {

        /**
         * ContaCorrente cc1 = new ContaCorrente(001, 123, "C6 Bank", 100.00, 1000.0);
         * ContaCorrente cc2 = new ContaCorrente(002, 456, "C6 Bank", 100.00, 150.0);
         * ContaCorrente cc3 = new ContaCorrente(003, 789, "C6 Bank", 100.00, 999.0);
         * 
         * List<ContaCorrente>contas = Arrays.asList(cc1, cc2, cc3);
         * 
         * System.out.println();
         * 
         * for (ContaCorrente conta : contas) { System.out.println("\t" + conta + "\n");
         * }
         * 
         */
        System.out.println();// pular linha
        System.out.println("\t ============ Procurando Valores Maiores que 10 utilizando Stream API ===========");
        System.out.println();// pular linha

        Cliente cl1 = new Cliente("Fabiano", true, "abc", 10);
        Cliente cl2 = new Cliente("Mentorama", true, "iop", 30);
        Cliente cl3 = new Cliente("Alex", false, "123", 50);
        Cliente cl4 = new Cliente("Brasil", true, "456", 35);
        Cliente cl5 = new Cliente("Luiz", true, "789", 8);
        Cliente cl6 = new Cliente("Marcos", true, "987", 89);
        Cliente cl7 = new Cliente("Luan", true, "654", 55);
        Cliente cl8 = new Cliente("Fanni", true, "321", 2);
        Cliente cl9 = new Cliente("Bruna", true, "369", 65);
        Cliente cl10 = new Cliente("Lorrane", true, "963", 12);

        List<Cliente> clientes = Arrays.asList(cl1, cl2, cl3, cl4, cl5, cl6, cl7, cl8, cl9, cl10);

        Consumer<Cliente> consumer = (Cliente cl) -> {
            System.out.println(cl.getNome());
        };
        // clientes.forEach(cl -> System.out.println(cl.getNome()));

        Stream<Cliente> stream = clientes.stream().filter(cliente -> cliente.getCompras() > 10);
        List<Cliente> seleciionados = stream.collect(Collectors.toList());
        seleciionados.forEach(c -> System.out.println("\t " + c.getCompras() + " É maior que 10"));

        System.out.println();// pular linha

         // ===============================================================================
         System.out.println("\t =============== Procurando Cliente que Comprou Mais Stream API ==============");
         System.out.println(); // pular linha
         Comparator<Cliente> comprouMais = (comprador1, comprador2) -> {
             if(comprador1.getCompras() > comprador2.getCompras()) return 1;
             if(comprador1.getCompras() < comprador2.getCompras()) return -1;
             return 0;

         };
         Consumer<Cliente> maisCompra = clientes.stream().max(comprouMais).get();
         System.out.println("\t Cliente que Fez Mais Compra:\n\t " + maisCompra );
 
         System.out.println();// pular linha
         // ===============================================================================


         System.out.println();// pular linha

         // ===============================================================================
         System.out.println("\t =============== Procurando Cliente que Comprou Menos Stream API ==============");
         System.out.println(); // pular linha
         Comparator<Cliente> comprouMenos = (comprador1, comprador2) -> {
             if(comprador1.getCompras() > comprador2.getCompras()) return -1;
             if(comprador1.getCompras() < comprador2.getCompras()) return 1;
             return 0;

         };
         Consumer<Cliente> menosCompra = clientes.stream().max(comprouMenos).get();
         System.out.println("\t Cliente que Fez Menos Compra:\n\t " + menosCompra);
 
         System.out.println();// pular linha
         // ===============================================================================



        // ===============================================================================
        System.out.println("\t =============== Procurando Primeiro Cliente Utilizando Stream API ==============");
        System.out.println(); // pular linha

        Consumer<Cliente> firistItem = clientes.stream().findFirst().get();
        System.out.println("\t Primeiro Cliente :\n\t " + firistItem );

        System.out.println();// pular linha
        // ===============================================================================


        // ===============================================================================
        System.out.println("\t =============== Procurando Ultimo Cliente Utilizando Stream API ================");
        System.out.println(); // pular linha

        Consumer<Cliente> lastItem = clientes.stream().reduce((first, second) -> second).get();
        System.out.println("\t Ultimo Cliente :\n\t " + lastItem );

        System.out.println();// pular linha
        // ===============================================================================
        System.out.println("\t =============== Media de compras Cliente Utilizando Stream API =================");
        System.out.println(); // pular linha

        // Calulo Media Utlizando Stram API
        // mapeando todos as compras e pegando media .average()
        System.out.println("\t Utilizando Stream Calculando Media de Compras dos Clientes: ");
        double meida = clientes.stream().mapToDouble(cl -> cl.getCompras()).average().orElse(0.0);
        System.out.println("\t Media e: " + meida);

        /**
         * 
         * //instanciando Conta Corrente ContaCorrente cc1 = new ContaCorrente(0001,
         * 3576, "Banco Brasil", 100.00, 1000.00); System.out.println();
         * 
         * // imprimindo conta corrente System.out.println(cc1); //pegando valor Cheque
         * Especial System.out.println("Valor Cheque Especial = " +
         * cc1.getChequeEspecial()); // pegando saldo total Conta-Corrente + cheque
         * especial System.out.println("Seu saldo Conta-Corrent + Cheque Especial= " +
         * cc1.getSaldo()); System.out.println();
         * 
         * //depositanto valor Conta-Corrente cc1.depositar(150.00); //pegando valor
         * depositado System.out.println("Você Depositou= " + cc1.valorDeposito); //
         * pegando saldo total Conta-Corrente + cheque especial System.out.println("Seu
         * saldo Conta-Corrent + Cheque Especial= " + cc1.getSaldo());
         * System.out.println();
         * 
         * //Sacando Valor Conta-Corrente cc1.sacar(50.00); //pegando valor sacado
         * System.out.println("Você Sacou= " + cc1.valorSaque); // pegando saldo total
         * Conta-Corrente + cheque especial System.out.println("Seu saldo Conta-Corrent
         * + Cheque Especial= " + cc1.getSaldo());
         * 
         * 
         * // Sacando Valor não permitido System.out.println(); cc1.sacar(3000.00);
         * System.out.println("Você tentou sacar = " + cc1.valorSaque);
         * 
         * 
         * System.out.println("=================================================================================");
         * 
         * 
         * 
         * // instanciando Conta-Pupança ContaPoupanca p1 = new ContaPoupanca(0003,
         * 0003, "Itau Unibanco", 95.00, 20, 0.05);
         * 
         * //imprimindo Conta-Poupanca System.out.println(p1); //Informando Taxa de
         * Juros % System.out.println("Taixa de Juros % = " + p1.getTaxaDeJuros());
         * //informando Saldo total + taxa juros % se houver System.out.println("Saldo
         * total da Conta Poupança + taxa Juros % se Houver= " + p1.getSaldo());
         * System.out.println();
         * 
         * // Depositando Valor p1.depositar(50.00); // informando valor deposito
         * System.out.println("Você fez Depósito de= " + p1.valorDeposito );
         * //informando Saldo total + taxa juros % se houver System.out.println("Seu
         * saldo Conta Poupança + Taxa de Juros % se Houver= " + p1.getSaldo());
         * System.out.println();
         * 
         * // Foi alterado valor dia do saque então nao ha taxad e Juros % porque não
         * completou aniversário //Valor sera retornado sem juros % 0.05
         * 
         * p1.setDiaAniversario(25); // sacando valor p1.sacar(20.00); //pegando valor
         * do saque System.out.println("Você fez um Saque de= " + p1.valorSaque);
         * //informando Saldo total + taxa juros % se houver System.out.println("Seu
         * saldo Conta Poupança + Taxa de Juros % se Houver= " + p1.getSaldo());
         * System.out.println(); // Foi alterado valor dia do saque para data correta
         * entao ha taxad e Juros % //Valor sera retornado com juros % 0.05
         * 
         * p1.setDiaAniversario(20); //informando Saldo total + taxa juros % se houver
         * 
         * System.out.println("Seu saldo Com taxa de Juros %"); System.out.println("Seu
         * saldo Conta Poupança + Taxa de Juros % se Houver= " + p1.getSaldo());
         * 
         * System.out.println("=================================================================================");
         * System.out.println();
         * 
         * //instanciando Conta-salario ContaSalario cs1 = new ContaSalario(0004, 12345,
         * "Bradesco", 1250.00); //imprimindo conta salario System.out.println(cs1);
         * System.out.println("Você só tem 03 saques disponiveis!"); //omprimindo valor
         * total Conta-Salario System.out.println("Salto total Conta-Salário= " +
         * cs1.getSaldo()); System.out.println();
         * 
         * //sancando valor Conta-Salario cs1.sacar(20.00); // pegando Valor Sacado
         * System.out.println("Você Sacou= " + cs1.valorSaque); //imprimindo valor
         * Conta-Salario System.out.println("Seu saldo Conta-Salário= " +
         * cs1.getSaldo()); System.out.println();
         * 
         * 
         * //sancando valor Conta-Salario cs1.sacar(20.00); // pegando Valor Sacado
         * System.out.println("Você Sacou= " + cs1.valorSaque); //imprimindo valor
         * Conta-Salario System.out.println("Seu saldo Conta-Salário= " +
         * cs1.getSaldo()); System.out.println();
         * 
         * //sancando valor Conta-Salario cs1.sacar(20.00); // pegando Valor Sacado
         * System.out.println("Você Sacou= " + cs1.valorSaque); //imprimindo valor
         * Conta-Salario System.out.println("Seu saldo Conta-Salário= " +
         * cs1.getSaldo()); System.out.println();
         * 
         * //sancando valor Conta-Salario cs1.sacar(20.00); // pegando Valor Sacado
         * System.out.println("Você Sacou tentou Sacar = " + cs1.valorSaque);
         * //imprimindo valor Conta-Salario System.out.println("Seu saldo Conta-Salário=
         * " + cs1.getSaldo()); System.out.println();
         * 
         */

    }

}
