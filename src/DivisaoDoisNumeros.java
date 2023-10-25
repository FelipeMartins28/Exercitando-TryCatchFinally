import java.util.Scanner;


public class DivisaoDoisNumeros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2=0, resultado;
		System.out.println("Digite o prmeiro numero: ");
		num1 = teclado.nextInt();
		do {
			System.out.println("Digite o segundo numero: ");
			num2 = teclado.nextInt();
			try {
				resultado = num1/num2;
				System.out.println(num1 +" dividido por "+num2+" = "+resultado);
			}catch(Exception e) {
				e.printStackTrace();
				e.getMessage();
				System.out.println("Num2 ==0");
			}
		}while(num2 ==0);
		teclado.close();
		}
	}
		    	//é preciso iniciar a variável com erro, para que o loop aconteça
		 
		    		
		    	

