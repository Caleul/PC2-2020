import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class tradutor {

	public static void main(String[] args) {
		String texto = "";
		String linha = "";

		Scanner leitor = new Scanner(System.in);

	    System.out.println ("Nome do arquivo e sua extensão:");
	    String entrada = leitor.next();
	    
	    String nomeArq = entrada;
		
	    BufferedReader arquivo = null;
		try {
		arquivo = new BufferedReader(new FileReader(nomeArq));
		while (arquivo.ready()) {
		linha = arquivo.readLine();
		System.out.println(linha);
		texto = texto + linha;
		}
				texto = texto.replace("r", "");
				texto = texto.replace("L", "u");
				System.out.println(texto);
		
		} catch (NullPointerException e) {
		System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		} catch (IOException e) {
		System.out.println(e.getMessage());
		} finally {
		try {
		arquivo.close();
		} catch (NullPointerException e) {
		System.out.println(e.getMessage());
		} catch (IOException e) {
		System.out.println(e.getMessage());
		}
		}

	}

}
