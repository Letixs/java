package classes2;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String telefone;
	private String cep;
	private int numCadastro;

	public Cliente(String nome, String cpf, String telefone, String cep, int numCadastro) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cep = cep;
		this.numCadastro = numCadastro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumCadastro() {
		return numCadastro;
	}

	public void setNumCadastro(int numCadastro) {
		this.numCadastro = numCadastro;
	}
	
	public void visualizar() {
		
		System.out.println("\n     INFORMAÇÕES CLIENTE\n");
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Nome do cliente: " + this.cpf);
		System.out.println("Nome do cliente: " + this.telefone);
		System.out.println("Nome do cliente: " + this.cep);
		System.out.println("Nome do cliente: " + this.numCadastro);

	}
	
}





