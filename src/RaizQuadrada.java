/*Escreva um programa que leia um número do usuário e calcule a raiz quadrada desse número.
 *  Se o usuário inserir um número negativo, o programa deve imprimir uma mensagem de erro
 *   e pedir ao usuário que insira um número positivo.
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
