import java.util.Scanner;

/* Escreva um programa que leia uma string do usu�rio e tente convert�-la para um n�mero
 *  inteiro.
 *  Se a convers�o falhar, o programa deve imprimir uma mensagem de erro e
 *  pedir ao usu�rio que insira uma string que possa ser convertida para um n�mero inteiro.
 */
public class ConversorString {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean continuar = false;
		do {
			System.out.println("Digite um numero: ");
			String numS = teclado.next();
		try {
			int num = Integer.parseInt(numS);
			continuar = false;
			System.out.println("Conversao... = "+num);
		}catch(NumberFormatException e) {
			System.out.println("ERRO: "+e.getMessage());
			System.out.println("Digite uma string valida!");
			continuar = true;
		}/*finally {
			teclado.close();
		}*/
	
	}while(continuar);

}}//aqui foi preciso nao fechar o scanner
