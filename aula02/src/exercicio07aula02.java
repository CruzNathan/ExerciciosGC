//Criar um jogo de adivinhação para descobrir quantos soldados os 300 espartanos
// irão enfrentar. Leônidas pede para que seus soldados tentem adivinhar quantos
// inimigos irão combater. O usuário deve digitar seu palpite e se o número for menor
// do que 300.000, Leônidas deve dizer Um pouco mais!, caso o número dito pelo usuário
// seja menor, ele dirá Um pouco menos!".

import java.util.Scanner;

public class exercicio07aula02 {
    public static void main(String[] args) {
        System.out.println("Adivinhe quantos inimigos serão enfrentados! ");
        Scanner scan = new Scanner(System.in);

        while (true) {
            int resposta = 300000;

            System.out.println("\n Digite seu palpite: ");
            int chute = scan.nextInt();

            if (chute < resposta) {
                System.out.println("Um pouco mais!");
            } else if (chute > resposta) {
                System.out.println("Um pouco menos!");
            } else {
                System.out.println("Acertou!");
                break;
            }
        }
    }
}
