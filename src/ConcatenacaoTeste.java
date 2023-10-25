
import java.util.Scanner;

public class ConcatenacaoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira string: ");
        String str1 = sc.nextLine();
        System.out.print("Digite a segunda string: ");
        String str2 = sc.nextLine();
        
        try {
            if (str1 == null || str2 == null) {
                throw new IllegalArgumentException("Uma das strings é nula.");
            }
            
            String resultado = str1.concat(str2);
            System.out.println("Resultado da concatenação: " + resultado);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
        
        sc.close();
    }
}

