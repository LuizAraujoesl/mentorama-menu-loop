package exercicioModulo06;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        // instanciando Alunos
        Alunos alunos = new Alunos();
        
        // chamando scanner para receber dados
        Scanner receber = new Scanner(System.in);
        int linha;
        int coluna;
        String valor;

       
        
         
        
        
        // adicionando Alunos
        alunos.addAlunos();

        alunos.mostrarIndice();
        System.out.println();
        System.out.println();

         // Mostrando Indices para Executar chamada
         for (int i = 0; i < 25; i++) {
            
            System.out.println("\t Digite Linha: ");
            linha = receber.nextInt();
   
            System.out.println("\t Digite Coluna: ");
            coluna = receber.nextInt();
   
            System.out.println("\t Digite Present | Ausente : ");
            valor = receber.nextLine();
            valor = receber.nextLine();
            
            if (linha == 0 || coluna == 0 || valor  == "0") {
                alunos.addChamada(linha, coluna, "Present");
            } else {
                alunos.addChamada(linha, coluna, valor);
            }
            
             
         }
         

        

        // imprimindo Diário de Clasee
        alunos.imprimir();
        System.out.println();
        System.out.println();
    }
}
