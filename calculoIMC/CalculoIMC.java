package exercicios;

import java.util.Scanner;

public class CalculoIMC {


    public static void main(String[] args) {

        // intanciando classe Scanner
        Scanner entrada = new Scanner(System.in);

        // Espacos resernvados na memoria
        String name;
        char sexo;
        int idade;
        double peso;
        double altura;
        double resultado;
        
        // valores para comparacao
        double abaixoPeso = 18.5;
        double pesoNormal = 25.0;
        double acimaPeso = 30.0;
    

        // laco while infinito
        while (true) {
            
            // apresenta menu ao Usuario
            System.out.println("\t ---------------------------");
            System.out.println("\t            Menu            ");
            System.out.println();
            System.out.println("\t        1- Calculo IMC      ");
            System.out.println("\t        2- Sair             ");
            System.out.println("\t ---------------------------");
            System.out.println();

            // recebe entreda do Usuario tipo interio
            int user = entrada.nextInt();

            // Exibe informacao de acordo com escolha do Usuario
            switch (user) {
                case 1:
                   
                    System.out.println("\t **** IMC ****");
                    
                    // entrada nome
                    System.out.println("\t Nome completo: ");

                    /**Hove um erro pulou Scanner p/ resolver erro
                     * foi colocado para ler duas entredas
                     */
                    name = entrada.nextLine();
                    name = entrada.nextLine(); //Houve erro aqui
                    
                    
                    System.out.println();
                

                    // entrada sexo
                    System.out.println("\t Sexo M - Masculino | F - Feminido: ");
                    sexo = entrada.nextLine().charAt(0);
                    
                    // entrada idade
                    System.out.println("\t idade: ");
                    idade = entrada.nextInt();
                    
                    // entrada peso
                    System.out.println("\t Peso: ");
                    peso = entrada.nextDouble();

                    // entrada altura
                    System.out.println("\t Altura: ");
                    altura =  entrada.nextDouble();
                    
                    //exibe resultado e dados do participante
                    resultado =  peso / (altura * altura);
                    System.out.println("\t " + "Seu nome: " + name);
                    System.out.println();
                    System.out.println("\t " + "Sexo: " + sexo);
                    System.out.println();
                    System.out.println("\t " + "Sua idade: " + idade);
                    System.out.println();
                    System.out.println("\t " + "Seu peso atual: " + peso);
                    System.out.println();

                    if (resultado <= abaixoPeso) {
                        System.out.println("\t Você esta abaixo do peso!");
                        System.out.println();
                        
                    } else if(resultado <= pesoNormal) {
                        System.out.println("\t Você esta com peso normal");
                        System.out.println("\t **** Parabéns ****");
                        System.out.println();
                    }
                    else if(resultado <= acimaPeso) {
                        System.out.println("\t Você esta acima do peso");
                        System.out.println("\t **** Esta na hora de se exercitar ****");
                        System.out.println();
                    }
                    else if(resultado > acimaPeso) {
                        System.out.println("\t Você esta Obeso!!");
                        System.out.println("\t **** Cuidado pratique exercicios físicos  tenha uma dieta balanceada ****");
                        System.out.println();
                        
                    }



                    break;
                case 2:
                    System.out.println();
                    System.out.println("\t Você escolheu a segunda opção");
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
            if (user == 2) {
                break;
            } // fim if

        } // fim while1

        entrada.close();
        
    }
    
}
