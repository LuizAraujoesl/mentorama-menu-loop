package modulo04;

public class Start {
    
    public static void main(String[] args) {
        //Instanciando obejeto carro
        Carro carro = new Carro(4);
        
        //setando cor do carro
        carro.setCor(Carro.VERMELHO);

        //imprimir valores
        carro.imprimirValores();
        

    }
}
