/*Escreva um programa que leia um n�mero do usu�rio e calcule a raiz quadrada desse n�mero.
 *  Se o usu�rio inserir um n�mero negativo, o programa deve imprimir uma mensagem de erro
 *   e pedir ao usu�rio que insira um n�mero positivo.
 */

import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num = -1;
		do {
		try {
				System.out.println("Digite um numero: ");
				 num = teclado.nextDouble();
				double raiz = Math.sqrt(num);
				System.out.println("Resultado: "+raiz);
		}catch(Exception e) {
			System.out.println("ERRO: "+e.getMessage());
		}/*finally {
			teclado.close();
		}*/
	}while(num<0);

}}
