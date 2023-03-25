package classes2;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Maria Rita","123456789","9865-8283","12345-098",34);
		Cliente c2 = new Cliente("Antonio Brito","098765432","93273-2387","09652-827",85);
		
		c1.visualizar();
		c2.visualizar();
		
	}

}
