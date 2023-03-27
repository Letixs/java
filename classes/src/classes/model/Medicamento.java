package classes.model;

public class Medicamento extends Farmacia{
	
	private int tarja;
	private int categoria;
	
	public Medicamento(int codigoProduto, String produto, boolean cadastro, int tipo, float preco, int tarja, int categoria) {
		super(codigoProduto, produto, cadastro, tipo, preco);
		this.tarja = tarja;
		this.categoria = categoria;
	}

	public int getTarja() {
		return tarja;
	}

	public void setTarja(int tarja) {
		this.tarja = tarja;
	}
	
	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		
		String tarja = "";
		String tipo = "";
		
		switch(this.tarja) {
		case 1-> tarja= "Medicamento sem tarja";
		case 2-> tarja = "Medicamento tarja amarela";
		case 3-> tarja = "Medicamento tarja vermelha";
		case 4-> tarja = "Medicamento tarja preta";
		default -> System.out.println("Opção inválida!");
		}
		
		switch(this.categoria) {
		case 1-> tipo = "Medicamento referência";
		case 2-> tipo = "Medicamento genérico";
		case 3-> tipo = "Medicamento similar";
		default -> System.out.println("Opção inválida!");
		}
		
		System.out.println(tarja);
		System.out.println(tipo);

	}
	
}
