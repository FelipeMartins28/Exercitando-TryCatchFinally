
import java.util.Scanner;

public class CalculadoraRaizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();

            if (numero < 0) {
                throw new IllegalArgumentException("Erro: o número deve ser positivo.");
            } else {
                double raizQuadrada = Math.sqrt(numero);
                System.out.printf("A raiz quadrada de %.2f é %.2f.\n", numero, raizQuadrada);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }finally {
        	scanner.close();
        }

        scanner.close();
    }
}
