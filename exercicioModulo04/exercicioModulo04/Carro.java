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

	/**
	 * 
	 * ==========================================================================
	 */




	//Imprimir
	public void imprimirValores(){

		System.out.println("\t ******* Dados Veículo *******");
		
	
		System.out.println("\t Qaunidade de Pneus: " + getQuantidadePneus());
		System.out.println("\t Qaunidade de Calotas: " + getQuantidadeCalotas());
		System.out.println("\t Qaunidade de Parafusos: " + getQuantidadeDeParafusos());
		System.out.println();

		/**
         * Integer Numero de Protas, Integer Numero de Chassi, String Ano de Fabricação, String Combustivel
         */

		System.out.println("\t Qaunidade de Portas: " + getNumeroDePortas());
		System.out.println("\t Numero do Chassi: " + getNumeroDoChassi());
		System.out.println("\t Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("\t Combustivel utilizado:  " + getCombustivel());

	}
    
    
    
    
    
}
