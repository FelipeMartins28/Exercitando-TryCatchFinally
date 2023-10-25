import java.util.Scanner;

/*Escreva um programa que leia duas strings do usuário e concatene-as em uma única string.
 *  Se uma das strings for nula,
 *  o programa deve imprimir uma mensagem de erro e sair do programa com um código de erro.
 */
public class Concatenacao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Digite uma palavra: ");
			String input1 = teclado.nextLine();
			String palavra1 = input1.isEmpty()? null: input1;
			System.out.println("Digite outra palavra: ");
			String input2 = teclado.nextLine();
			String palavra2 = input2.isEmpty()? null: input2;
			if(palavra1 == null || palavra2 == null) {
				throw new IllegalArgumentException("Uma das palavras e nula.");
			} System.out.println(palavra1.concat(palavra2));
		}catch(IllegalArgumentException e) {
			System.out.println("ERRO: "+e.getMessage());
		}finally {
			System.out.println("Fim do programa!");
			teclado.close();
		}
	}

}
//so foi possivel resolver graças ao operador ternário!!!