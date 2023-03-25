package classes;

public class Farmacia {
	
	private int codigoProduto;
	private String remedio;
	private int tarja;
	private int tipo;
	private float preco;

	public Farmacia(int codigoProduto, String remedio, int tarja, int tipo, float preco) {
		this.codigoProduto = codigoProduto;
		this.remedio = remedio;
		this.tarja = tarja;
		this.tipo = tipo;
		this.preco = preco;
	}

	public int getcodigoProduto() {
		return codigoProduto;
	}

	public void setcodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getRemedio() {
		return remedio;
	}

	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}

	public int getTarja() {
		return tarja;
	}

	public void setTarja(int tarja) {
		this.tarja = tarja;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		
		String tarja = "";
		String tipo = "";
		
		switch(this.tarja) {
		case 1-> tarja= "Medicamento sem tarja";
		case 2-> tarja = "Medicamento tarja amarela";
		case 3-> tarja = "Medicamento tarja vermelha";
		case 4-> tarja = "Medicamento tarja preta";
		default -> System.out.println("Opção inválida!");
		}
		
		switch(this.tipo) {
		case 1-> tipo = "Medicamento referência";
		case 2-> tipo = "Medicamento genérico";
		case 3-> tipo = "Medicamento similar";
		default -> System.out.println("Opção inválida!");
		}
		
		System.out.println("\n   INFORMAÇÕES DO MEDICAMENTO         \n");
		System.out.println("Código do medicamento: " + this.codigoProduto);
		System.out.println("Nome do medicamento: " + this.remedio);
		System.out.println(tarja);
		System.out.println(tipo);
		System.out.println("Preço do medicamento: " + this.preco);

	}
}















