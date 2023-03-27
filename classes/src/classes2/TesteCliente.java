package classes2;

import classes2.model.Cliente;
import classes2.model.PessoaFisica;
import classes2.model.PessoaJuridica;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Maria Rita","maria@gmail.com","9865-8283","12345-098",34);
		Cliente c2 = new Cliente("Antonio Brito","antonio@gmail.com","93273-2387","09652-827",85);
		PessoaFisica c3 = new PessoaFisica("Amanda Silva","amanda@gmail.com","97326-2344","13862-056",06,"825307245");
		PessoaFisica c4 = new PessoaFisica("Gabriel Gomes","gabriel@gmail.com","92677-0815","09252-624",339,"047205639");
		PessoaJuridica c5 = new PessoaJuridica("Fátima Sales","fatima@gmail.com","93263-0162","18254-454",826,"19272098000123");
		PessoaJuridica c6 = new PessoaJuridica("Alessandro Farias","alessando@gmail.com","94701-2736","03453-098",82,"12098456000375");
		
		c1.visualizar();
		c2.visualizar();
		c3.visualizar();
		c4.visualizar();
		c5.visualizar();
		c6.visualizar();
		
	}

}
