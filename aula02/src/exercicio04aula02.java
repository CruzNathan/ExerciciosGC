//Implemente uma calculadora, onde o usuário deve entrar com 2 números e escolher a
// operação que deseja realizar. Durante a execução o programa deve perguntar ao usuário
// se ele deseja continuar, se ele não quiser, deve digitar ‘n’ para o programa encerrar.

import java.util.Scanner;

public class exercicio04aula02 {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número: ");
        Scanner input1 = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        Scanner input2 = new Scanner(System.in);
        int num1 = input1.nextInt();
        int num2 = input2.nextInt();


        System.out.print("##--Qual operação deseja realizar?--##\n");
        System.out.print("|------------------------------------|\n");
        System.out.print("| 1 - Adição ------------------------|\n");
        System.out.print("| 2 - Subtração ---------------------|\n");
        System.out.print("| 3 - Multiplicação -----------------|\n");
        System.out.print("| 4 - Divisão -----------------------|\n");
        System.out.print("| 5 - Cancelar -----------------------|\n");
        System.out.print("##----------------------------------##\n\n");

        Scanner menu = new Scanner(System.in);

        int opcao = menu.nextInt();

        double result = switch (opcao) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> num1 / num2;
            default -> 0;
        };
    }
}
