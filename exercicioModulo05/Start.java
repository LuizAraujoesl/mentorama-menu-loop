package exercicioModulo05;



public class Start {
    public static void main(String[] args) {
         
        System.out.println();
        System.out.println("Váriaveis do Tipo Primitivo: ");
        System.out.println();
        /**
         * Váriaveis primitivas recebem uma cópia esta copia não e alterada quando
         * mudamos ou atualizamos valores da variável antiga conf. exemplo abaixo.
         */

        // váriavel Primitiva com valor
        int valorUm = 10; // Váriavel original
        System.out.println("Valor Original Várivel Primitiva: " + valorUm); // valor impresso

        /**
         * Váriavel recebe uma copia se for alterada variavel valorUm não vai afetar
         * variavel valorDois
         */
        int valorDois = valorUm; // Cópia da Variavel
        System.out.println("Cópia do Valor Original (valorUm): " + valorDois); // valor impresso

        valorUm += 5; // valor alterado variavel valorUm

        System.out.println("Valor Original alterado: " + valorUm); // valor alterado
        System.out.println("Cópia do Valor Original: " +valorUm); // valor alterado
        


        System.out.println("============================================================================================================================================================"); 
        System.out.println(); 

        /**
         * ===================================================================================================
         */
        


        System.out.println();
        System.out.println("Váriaveis do Tipo Wrapper: ");
        System.out.println();
         
        /** Foi Criado um Objeto classe Objetos */
        Objetos obj = new Objetos(); // Objeto instânciado

        // Criado váriavel tipo Wrapper
        // referenciando ao endereço de memória obj
        Integer referencia = obj.itemUm;
    

        // Imprimindo valor referênciado na memodia seu atributo através do " . "
        System.out.println("Valor armazenado: " + referencia);


        // segue impressao endereço do Objeto 
        System.out.println("Segue valor endereço de memória obj [@372f7a8d]: " + obj);
        System.out.println("Segue valor endereço de memória obj [@372f7a8d] seu valor armazenado: " + referencia);
         
         

        


    }

}
