package modulo04;

public class Carro {

    // Variaveis Staticas
    public static final String VERMELHO = "Vermelho";
    public static final String PRETO = "Preto";

    // variaveis comuns
    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusos;

    // construtors

    // construtor padão
    public Carro() {

    }

    // Sobrecarga de Construtores
    public Carro(Integer quantidadePneus) {
        setQuantidadedePneus(quantidadePneus);
    }

    // Setter
    public void setCor(String cor) {
        System.out.println(cor);

    }
    public Integer setQuantidadedeCalotas( Integer quantidadedeCalotas){
        return this.quantidadeCalotas = quantidadedeCalotas;
    }

    public void setQuantidadedePneus(Integer quantdadePneus) {
        setQuantidadedeCalotas(quantdadePneus);
        quantidadeParafusos = quantdadePneus * 4;
        this.quantidadePneus = quantdadePneus;

    }

    // Getter
    public Integer getQuantidadePneus() {
        return quantidadePneus + 1;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public Integer quantidadeParafusos() {
        return quantidadeParafusos;
    }

    // metodos imprimir
    public void imprimirValores() {
        System.out.println("Quantidade de Pneus: " + getQuantidadePneus());
        System.out.println("Quantidade de Calotas: " + getQuantidadeCalotas());
        System.out.println("Quantidade de Parafusos: " + quantidadeParafusos());
    }
}
