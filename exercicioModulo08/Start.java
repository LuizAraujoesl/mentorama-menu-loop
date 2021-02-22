package exercicioModulo08;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        // intanciando classe Scanner
        Scanner entrada = new Scanner(System.in);
        Conta c = new Conta();




            // laco while infinito
            while (true) {
                // apresenta menu ao Usuario
                System.out.println("\t ---------------------------");
                System.out.println("\t            Menu            ");
                System.out.println();
                System.out.println("\t   1- Abrir Conta-Corrente  ");
                System.out.println("\t   2- Abrir Conta-Salario   ");
                System.out.println("\t   3- Abrir Conta-Poupanca  ");
                System.out.println("\t   4- Listar Contas         ");
                System.out.println("\t   5- Transferir Pix        ");
                System.out.println("\t   6- Saldo Total Banco     ");
                System.out.println("\t   7- Sair                  ");
                System.out.println("\t ---------------------------");
                System.out.println();

                // recebe entreda do Usuario tipo interio
                int user = entrada.nextInt();

                // Exibe informacao de acordo com escolha do Usuario
                switch (user) {
                    case 1:
                        System.out.println();
                        System.out.println("\t Criar Conta-Corrente");
                        c.createContaCC();
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("\t Criar Conta-Salário");
                        c.createSalario();
                        break;
                    case 3:
                        System.out.println();
                        System.out.println("\t Criar Conta-Poupança");
                        c.createPoupanca();
                        break;
                    case 4:
                        System.out.println();
                        System.out.println("\t Listar Todas as Contas");
                        c.listarContas();
                        break;
                    case 5:
                        System.out.println();
                        System.out.println("\t Fazer uma transferência Pix");
                        break;
                    case 6:
                        System.out.println();
                        System.out.println("\t Saldo Total do Banco");
                        c.valorTotalBanco();
                        break;

                    case 7:
                        System.out.println();
                        System.out.println("\t O programa foi encerrado");
                        break;

                    default:
                        System.out.println();
                        System.out.println("\t Opção incorreta!");
                        break;

                }// fim switch

                /*
                 * controle laco while infinito utilizando if pra sair do laco apos opcao
                 * selecionada
                 */
                if (user == 7) {
                    break;
                } // fim if

            } // fim while1
        }
    }
