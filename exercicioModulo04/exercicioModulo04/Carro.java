package exercicioModulo04;

public class Carro {
    

    // Variaveis Staticas  OPICIONAIS
    public static final String RED = "Vermelho";
    public static final String WHITE = "Branco";
    public static final String BLACK = "Preto";

    //Variaveis Privadas  OBRIGATÓRIO
    private Integer numeroDePortas;
    private Integer numeroDoChassi;
    private String anoFabricacao;
    private String combustivel;
    
    //Construtor 
	public Carro(Integer numeroDePortas, Integer numeroDoChassi, String anoFabricacao, String combustivel) {
		super();
		this.numeroDePortas = numeroDePortas;
		this.numeroDoChassi = numeroDoChassi;
		this.anoFabricacao = anoFabricacao;
		this.combustivel = combustivel;
	}
	
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
		return RED;
	}
	public static String getWhite() {
		return WHITE;
	}
	public static String getBlack() {
		return BLACK;
	}
    
    
    
    
    
}
