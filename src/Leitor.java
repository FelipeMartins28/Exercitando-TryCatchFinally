import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
/*Escreva um programa que leia um arquivo do usu�rio e imprima o seu conte�do na tela. 
 * Se o arquivo n�o existir, o programa deve imprimir uma mensagem de erro.
 */
public class Leitor {
	public static void main(String[] args) {
		try { Scanner scanner = new Scanner(new File("/Users/Felipe/OneDrive/Documentos/aeroporto.txt"));
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}
				
		}catch(FileNotFoundException e) {
			System.out.println("Nao foi possivel ler o arquivo!");
			System.out.println("ERRO: "+e.getMessage());
		}finally {
			System.out.println("Fim da execu�ao!");
		}
	}

}
