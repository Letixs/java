package classes.model;

public class Perfumaria extends Farmacia{
	
	private String marca;

	public Perfumaria(int codigoProduto, String produto, boolean cadastro, int tipo, float preco, String marca) {
		super(codigoProduto, produto, cadastro, tipo, preco);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Perfume da marca: " + this.marca);
	}
	
}
