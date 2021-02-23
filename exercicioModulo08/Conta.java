package exercicioModulo08;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Conta extends Banco implements Tributavel {
    Scanner entrada = new Scanner(System.in);
    // methodos
    protected String conta;
    protected int agencia;
    protected int numeroConta;
    protected String name;
    protected Double saldo;

    // construtor
    public Conta() {
    }

    public Conta(String conta, int agencia, int numeroConta, String name, Double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.name = name;
        this.saldo = saldo;
    }

    // Soma total de todos os saldos da Conta
    public void valorTotalBanco() {
        double cc = 0;
        for (Conta itens : contaCorrente) {
            cc = cc + itens.saldo;
        }
        double cs = 0;
        for (Conta itens : contaSalario) {
            cs = cs + itens.saldo;
        }
        double cp = 0;
        for (Conta itens : contaPoupanca) {
            cp = cp + itens.saldo;
        }
        double total = cc + cs + cp;
        System.out.println("\tValor total de Todas as Contas: " + total);
    }// fim somar

    // listar contas
    public void listarContas() {
        for (Conta itens : contaCorrente) {
            System.out.println(itens);
        }
        for (Conta itens : contaSalario) {
            System.out.print(itens);
        }

        for (Conta itens : contaPoupanca) {
            System.out.print(itens);
        }

    }// fin listar Contas;

    // criação da conta CC
    public void createContaCC() {

        String conta = "Conta-Corrente ->>>";
        System.out.println("\t Contrato + Tributo: " + tributo + " % ");
        System.out.println("\t Digite a Agência CC: ");
        int agencia = entrada.nextInt();

        System.out.println("\t Digite o Numero CC: ");
        int numeroConta = entrada.nextInt();


        System.out.println("\t Digite Seu Nome Titular CC: ");
        String name = entrada.nextLine();
        name = entrada.nextLine();

        System.out.println("\t Digite a Saldo CC: ");
        double saldo = entrada.nextDouble();
        saldo -= (saldo * tributo);
        contaCorrente.add(new Conta(conta, agencia, numeroConta, name, saldo));

    }// fim Conta CC

    // criação da conta Poupanca
    public void createPoupanca() {

        String conta = "Conta-Poupança ->>>";
        System.out.println("\t Contrato + Rendimento: " + taxaJuros + " % ");
        System.out.println("\t Digite a Agência CP: ");
        int agencia = entrada.nextInt();

        System.out.println("\t Digite o Numero CP : ");
        int numeroConta = entrada.nextInt();

        System.out.println("\t Digite Seu Nome Titular CP: ");
        String name = entrada.nextLine();
        name = entrada.nextLine();

        System.out.println("\t Digite a Saldo CP: ");
        double saldo = entrada.nextDouble();
        saldo += (saldo * taxaJuros);
        contaCorrente.add(new Conta(conta, agencia, numeroConta, name, saldo));

    }// fim Conta Poupanca

    // criação da conta Salario
    public void createSalario() {

        String conta = "Conta-Salario ->>>";

        System.out.println("\t Digite a Agência CS: ");
        int agencia = entrada.nextInt();

        System.out.println("\t Digite o Numero CS: ");
        int numeroConta = entrada.nextInt();

        System.out.println("\t Digite Seu Nome Titular CS: ");
        String name = entrada.nextLine();
        name = entrada.nextLine();

        System.out.println("\t Digite a Saldo CS : ");
        double saldo = entrada.nextDouble();

        contaCorrente.add(new Conta(conta, agencia, numeroConta, name, saldo));

    }// fim Conta Poupanca

    public void tranferirPix() {

        System.out.println("\t De Qual Agência: ");
        int agencia1 = entrada.nextInt();

        System.out.println("\t De Qual Conta: ");
        int conta1 = entrada.nextInt();

        System.out.println("\t Qual Valor Deseja Transferir: ");
        double valorTranferencia = entrada.nextDouble();

        System.out.println("\t Para Qual Agência: ");
        int agencia2 = entrada.nextInt();

        System.out.println("\t Para Qual Conta: ");
        int conta2 = entrada.nextInt();

        for (Conta itens : contaCorrente) {
            if (itens.agencia == agencia1 & itens.numeroConta == conta1) {
                itens.saldo -= valorTranferencia;
            } 
        }//fim for

        for (Conta itens : contaSalario) {
            if (itens.agencia == agencia1 & itens.numeroConta == conta1) {
                itens.saldo -= valorTranferencia;
            } 
        }//fim for

        for (Conta itens : contaPoupanca) {
            if (itens.agencia == agencia1 & itens.numeroConta == conta1) {
                itens.saldo -= valorTranferencia;
            } 
        }//fim for

         //// transfêrencia PIX

        for (Conta itens : contaCorrente) {
            if (itens.agencia == agencia2 & itens.numeroConta == conta2) {
                itens.saldo += valorTranferencia;
                System.out.println("\t Transferencia Executada com Sucesso: ");
            } 
        }//fim for

        for (Conta itens : contaSalario) {
            if (itens.agencia == agencia2 & itens.numeroConta == conta2) {
                itens.saldo += valorTranferencia;
                System.out.println("\t Transferencia Executada com Sucesso: ");
            } 
        }//fim for

        for (Conta itens : contaPoupanca) {
            if (itens.agencia == agencia2 & itens.numeroConta == conta2) {
                itens.saldo += valorTranferencia;
                System.out.println("\t Transferencia Executada com Sucesso: ");
            } 
        }//fim for
       
        
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return " " + "{ " + conta + ", agencia: " + agencia + ", numeroConta: " + numeroConta + ", name:  "
                + name + ", saldo: " + saldo + "}  \n";

    }

}
