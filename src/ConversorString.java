import java.util.Scanner;

/* Escreva um programa que leia uma string do usuário e tente convertê-la para um número
 *  inteiro.
 *  Se a conversão falhar, o programa deve imprimir uma mensagem de erro e
 *  pedir ao usuário que insira uma string que possa ser convertida para um número inteiro.
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
