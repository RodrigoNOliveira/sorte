import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double valor;
        Valores trocaValor = new Valores();

        System.out.print("Digite o valor do produto: ");
        valor = scanner.nextDouble();
        valor = trocaValor.novoValor(valor);
        System.out.println("O novo valor é de: " + valor);
        
        scanner.close();
    }
}
