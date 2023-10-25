import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploTryCatch {

    public static void main(String[] args) {

        try {
            FileReader arquivo = new FileReader("caminho/do/arquivo.txt");
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha = leitor.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
