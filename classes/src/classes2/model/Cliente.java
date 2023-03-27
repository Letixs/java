package classes2.model;

public class Cliente {
	
	private String nome;
	private String email;
	private String telefone;
	private String cep;
	private int numCadastro;

	public Cliente(String nome, String email, String telefone, String cep, int numCadastro) {
		this.nome = nome;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		System.out.println("Email do cliente: " + this.email);
		System.out.println("Telefone do cliente: " + this.telefone);
		System.out.println("CEP do cliente: " + this.cep);
		System.out.println("Número de cadastro do cliente: " + this.numCadastro);

	}
	
}





