package classes;

import classes.model.Farmacia;
import classes.model.Medicamento;
import classes.model.Perfumaria;

public class TesteFarmacia {

	public static void main(String[] args) {

		Farmacia m1 = new Farmacia(723,"Nimesulida",false,1,8f);
		Farmacia m2 = new Farmacia(23,"Cerave",true,3,60f);
		Medicamento m3 = new Medicamento(34,"Dorflex",false,1,7f,1,1);
		Medicamento m4 = new Medicamento(72,"Neosoro",true,1,6f,3,1);
		Perfumaria m5 = new Perfumaria(98,"Ilía",true,3,154f,"Natura");
		Perfumaria m6 = new Perfumaria(14,"Egeo Choc",false,3,124f,"Boticário");
		
		m1.visualizar();
		m2.visualizar();
		m3.visualizar();
		m4.visualizar();
		m5.visualizar();
		m6.visualizar();
		
	}

}
