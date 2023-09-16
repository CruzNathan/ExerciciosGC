//Crie um programa que determine e escreva os números primos compreendidos entre um
// intervalo fornecido pelo usuário.

import java.util.Scanner;

public class exercicio01aula02 {
    public static void main(String[] args) {
        System.out.print("Digite o início do inetrvalo: ");
        Scanner inputIn = new Scanner(System.in);
        int inicio = inputIn.nextInt();
        System.out.print("Digite o fim do inetrvalo: ");
        Scanner inputFim = new Scanner(System.in);
        int fim = inputFim.nextInt();

        if (inicio == 1) {inicio++;}


        for (int i = inicio; i <= fim; i++) {
            if( ehPrimo(i) )
                System.out.println(i + " é primo.");
        }
    }

    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}
