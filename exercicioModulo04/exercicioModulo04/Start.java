package exercicioModulo04;

public class Start {
     public static void main(String[] args) {

        /**
         * Instanciando Objeto Carro
         * Integer Numero de Protas, Integer Numero de Chassi, String Ano de Fabricação, String Combustivel
         */

        Carro carro  = new Carro( 4,  123456,  "01/02/2020",  "Gasolina"); // itens obrigatórios

        // Escolhendo cor do Carro
        System.out.println("Cor do Carro: " + Carro.BLACK);
        
        // Imprimindo Valores
        carro.imprimirValores();

         
     }
}
