package classes2.model;

public class PessoaFisica extends Cliente{
	
	private String cpf;

	public PessoaFisica(String nome, String email, String telefone, String cep, int numCadastro, String cpf) {
		super(nome, email, telefone, cep, numCadastro);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF do cliente: " + this.cpf);
	}
	
}
