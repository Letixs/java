package classes2.model;

public class PessoaJuridica extends Cliente{

	private String cnpj;

	public PessoaJuridica(String nome, String email, String telefone, String cep, int numCadastro, String cnpj) {
		super(nome, email, telefone, cep, numCadastro);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ do cliente: " + this.cnpj);
	}
	
}
