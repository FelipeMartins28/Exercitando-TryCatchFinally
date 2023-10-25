
import java.util.Scanner;

public class RaizQuadradaTeste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Digite um numero: ");
            double num = teclado.nextDouble();
            while (num < 0) {
                System.out.println("O numero nao pode ser negativo, digite outro: ");
                num = teclado.nextDouble();
            }
            double potencia = num * num;
            System.out.println("Resultado: " + potencia);
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
