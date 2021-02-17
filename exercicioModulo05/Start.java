package exercicioModulo05;

public class Start {
    public static void main(String[] args) {

        /**Váriaveis primitivas recebem uma cópia esta copia não e alterada
         * quando mudamos ou atualizamos valores da variável antiga conf.
         * exemplo abaixo.
         */

         // váriavel Primitiva com valor
         int valorUm = 10;  // Váriavel original
         System.out.println(valorUm); // valor impresso

         /**Váriavel recebe uma copia se for alterada variavel valorUm não vai afetar variavel valorDois */
         int valorDois =  valorUm;  // Cópia da Variavel
         System.out.println(valorDois); // valor impresso

         valorUm += 5;  //valor alterado variavel valorUm 

         System.out.println(valorUm); // valor alterado
         System.out.println(valorDois); // valor impresso obs. não foi alterado.



        
    }
    
}
