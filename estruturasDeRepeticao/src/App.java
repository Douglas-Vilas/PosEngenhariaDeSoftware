import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MelhoresFilmesSeries();
    }

    public static void MelhoresFilmesSeries() {
        // Cria um array de String com tamanho 5
        String[] filmesSeries = new String[5];
        Scanner entrada = new Scanner(System.in);

        // Loop para receber os nomes dos filmes ou séries
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do filme ou série #" + (i + 1) + ": ");
            filmesSeries[i] = entrada.nextLine();
        }

        // Mostra os filmes ou séries na tela
        System.out.println("\nOs melhores filmes ou séries que você já assistiu são:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + filmesSeries[i]);
        }
    }
}
