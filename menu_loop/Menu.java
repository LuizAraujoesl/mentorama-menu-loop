package menu_loop;


import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        // intanciando classe Scanner
        Scanner entrada = new Scanner(System.in);

        // laco while infinito
        while (true) {
            // apresenta menu ao Usuario
            System.out.println("\t ---------------------------");
            System.out.println("\t            Menu            ");
            System.out.println();
            System.out.println("\t        1- Opção 1          ");
            System.out.println("\t        2- Opção 2          ");
            System.out.println("\t        3- Sair             ");
            System.out.println("\t ---------------------------");
            System.out.println();

            // recebe entreda do Usuario tipo interio
            int user = entrada.nextInt();

            // Exibe informacao de acordo com escolha do Usuario
            switch (user) {
                case 1:
                    System.out.println();
                    System.out.println("\t Você escolheu a primeira opção");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("\t Você escolheu a segunda opção");
                    break;
                case 3:
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
            if (user == 3) {
                break;
            } // fim if

        } // fim while1

    }// fim main

}// fim class
