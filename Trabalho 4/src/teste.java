package trabalho4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;




public class teste {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Livro a = new Livro("1", "Clean code", "Ricardo Oliveira Silva", "010101", 56.99, "2");
		
		Cliente lulu = new Cliente("0", "Luis Felipe","Nucleo Bandeirante", "Brasilia" , "DF" , "71745612", "83281138", "1234");
		 
		Balconista davi = new Balconista("O Dragao Negro" , "1234", "5");
		
		ArrayList<Livro> livros = new ArrayList<>();
		livros.add(a);
		
		PedidoCliente tur = new PedidoCliente(davi, 1 , sdf.parse("24/09/2020") , livros, 5,
				35.90, lulu , sdf.parse("28/05/2020"));
		
		System.out.println(tur);
	}

}
