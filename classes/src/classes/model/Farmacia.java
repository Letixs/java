package classes.model;

public class Farmacia {
	
	private int codigoProduto;
	private String produto;
	private boolean cadastro;
	private int tipo;
	private float preco;

	public Farmacia(int codigoProduto, String produto, boolean cadastro, int tipo, float preco) {
		this.codigoProduto = codigoProduto;
		this.produto = produto;
		this.cadastro = cadastro;
		this.tipo = tipo;
		this.preco = preco;
	}

	public int getcodigoProduto() {
		return codigoProduto;
	}

	public void setcodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public boolean isCadastro() {
		return cadastro;
	}

	public void setCadastro(boolean cadastro) {
		this.cadastro = cadastro;
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
		
		String tipo = "";
		
		switch(this.tipo) {
		case 1-> tipo = "Setor de Medicamentos";
		case 2-> tipo = "Setor Infantil";
		case 3-> tipo = "Setor de cosméticos";
		case 4-> tipo = "Setor de Higiene";
		default -> System.out.println("Opção inválida!");
		}
		
		System.out.println("\n   INFORMAÇÕES DO MEDICAMENTO\n");
		
		if(cadastro) {
			preco = preco - (preco * 0.1f);
			System.out.println("Desconto de 10% aplicado!\n");
		}
		
		System.out.println("Código do produto: " + this.codigoProduto);
		System.out.println("Nome do produto: " + this.produto);
		System.out.println(tipo);
		System.out.println("Preço do medicamento: " + this.preco);

	}
}















