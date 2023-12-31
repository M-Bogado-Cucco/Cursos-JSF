package devMedia_05_jsf._7_dados;

public class ProdutoBean {
	
	private String nome;
	private float valor;
	private int totalVendas;
	
	// construtor
	public ProdutoBean(String nome, float valor, int totalVendas) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.totalVendas = totalVendas;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public int getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
}
