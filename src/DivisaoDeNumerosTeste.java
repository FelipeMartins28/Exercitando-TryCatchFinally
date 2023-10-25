import java.util.Scanner;

public class DivisaoDeNumerosTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;

        System.out.print("Digite o primeiro n�mero: ");
        num1 = entrada.nextDouble();

        do {
            System.out.print("Digite o segundo n�mero (diferente de zero): ");
            num2 = entrada.nextDouble();
            if (num2 == 0) {
                System.out.println("Erro: o segundo n�mero n�o pode ser zero.");
            }
        } while (num2 == 0);

        try {
            double resultado = num1 / num2;
            System.out.println("A divis�o de " + num1 + " por " + num2 + " � igual a: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("N�o � poss�vel dividir por zero. Erro: " + e.getMessage());
        }finally {
        	entrada.close();
        }
    }
}

