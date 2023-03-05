import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeticoes = 4;
        int contador = 0;

        String[] nomes = new String[repeticoes];
        int[] idades = new int[repeticoes];

        while (contador < repeticoes) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            scanner.nextLine();

            nomes[contador] = nome;
            idades[contador] = idade;

            contador++;
        }

        scanner.close();

        int indiceMaisNovo = 0;
        int indiceMaisVelho = 0;

        for (int i = 1; i < repeticoes; i++) {
            if (idades[i] < idades[indiceMaisNovo]) {
                indiceMaisNovo = i;
            }
            if (idades[i] > idades[indiceMaisVelho]) {
                indiceMaisVelho = i;
            }
        }

        System.out.println("A pessoa mais nova é " + nomes[indiceMaisNovo] + " com "
         + idades[indiceMaisNovo] + " anos.");
        System.out.println("A pessoa mais velha é " + nomes[indiceMaisVelho] + " com "
         + idades[indiceMaisVelho] + " anos.");
    }
}
