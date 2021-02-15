package exercicioModulo04;

public class Carro {
    

    // Variaveis Staticas  OPICIONAIS
    public static final String RED = "Vermelho";
    public static final String WHITE = "Branco";
    public static final String BLACK = "Preto";

    //Variaveis Privadas  OBRIGATÓRIO
    private Integer quantidadePneus;
	private Integer quantidadeCalotas;
	private Integer quantidadeDeParafusos;

    private Integer numeroDePortas;
    private Integer numeroDoChassi;
    private String anoFabricacao;
    private String combustivel;
    
    //Construtor 
	public Carro(Integer numeroDePortas, Integer numeroDoChassi, String anoFabricacao, String combustivel) {
		setNumeroDePortas(numeroDePortas);
		setNumeroDoChassi(numeroDoChassi);
		setAnoFabricacao(anoFabricacao);
		setCombustivel(combustivel);
        
		/**
		 * todo Carro deve te 04 RODAS mais 01 ESTEPE
		 * por este motivo já intanciei no contrutor este valor
		 * junto com os demais que necessitam dete valor
		 * 
		 * Obs. Se houver algum carro com mais de 05 rodas será possivel adicionar atraves 
		 * do methodo Setter.
		 */
		setQuantidadePneus(4);
		setQuantidadeCalotas(getQuantidadePneus());
		setQuantidadeDeParafusos(getQuantidadePneus());
		
	}

	/**
	 * Segue methodos Getters e Setters  
	 * Pneus
	 * Calotas
	 * Parafusos
	 * 
	 */

	//Sett Gett Quantidade de Pneus
	public Integer getQuantidadePneus(){
		return quantidadePneus;
	}
	public Integer setQuantidadePneus(Integer quantidadePneus){
		quantidadePneus = 5;
		return this.quantidadePneus = quantidadePneus;
	}

	//Sett Gett Quantidade de Calotas
	public Integer getQuantidadeCalotas(){
		return quantidadeCalotas;
	}
	public Integer setQuantidadeCalotas(Integer quantidadeCalotas){
		quantidadeCalotas = quantidadePneus;
		return this.quantidadeCalotas = quantidadeCalotas;
	}

	//Sett Gett Quantidade de Parafusos
	public Integer getQuantidadeDeParafusos(){
		return this.quantidadeDeParafusos;
	}
	public Integer setQuantidadeDeParafusos(Integer quantidadeDeParafusos){
		quantidadeDeParafusos = this.quantidadeCalotas * 4;
		return this.quantidadeDeParafusos = quantidadeDeParafusos;
	}

	/**
	 * 
	 * ==========================================================================
	 */

	
	/**
	 * Segue methodos Getters e Setters  
	 * Numero de Portas
	 * Numero de Chassi
	 * Ano de Fabricação
	 * Combustão
	 * 
	 */
	
	//Sett Gett Numero de Portas
	public Integer getNumeroDePortas() {
		return numeroDePortas;
	}
	public void setNumeroDePortas(Integer numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}


    // Sett Gett Numero do Chassi
	public Integer getNumeroDoChassi() {
		return numeroDoChassi;
	}
	public void setNumeroDoChassi(Integer numeroDoChassi) {
		this.numeroDoChassi = numeroDoChassi;
	}

	//Sett Gett  Ano de Fanricação
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

    // Sett Gett Combustivel
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	// Sett Gett Variáveis Staticas
	public static String getRed() {
		System.out.println("Cor do Carro escolhida: " + RED);
		return RED;
	}
	public static String getWhite() {
		System.out.println("Cor do Carro escolhida: " + WHITE);
		return WHITE;
	}
	public static String getBlack() {
		System.out.println("Cor do Carro escolhida: " + BLACK);
		return BLACK;
	}

	/**
	 * 
	 * ==========================================================================
	 */


	 

	//Imprimir
	public void imprimirValores(){
		System.out.println("Qaunidade de Pneus: " + getQuantidadePneus());
		System.out.println("Qaunidade de Calotas: " + getQuantidadeCalotas());
		System.out.println("Qaunidade de Pneus: " + getQuantidadeDeParafusos());
	}
    
    
    
    
    
}
