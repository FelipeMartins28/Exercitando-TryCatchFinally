import java.util.Scanner;

public class DivisaoDeNumerosTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextDouble();

        do {
            System.out.print("Digite o segundo número (diferente de zero): ");
            num2 = entrada.nextDouble();
            if (num2 == 0) {
                System.out.println("Erro: o segundo número não pode ser zero.");
            }
        } while (num2 == 0);

        try {
            double resultado = num1 / num2;
            System.out.println("A divisão de " + num1 + " por " + num2 + " é igual a: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero. Erro: " + e.getMessage());
        }finally {
        	entrada.close();
        }
    }
}

