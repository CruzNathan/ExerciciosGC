//Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento e,
// em seguida, calcule e exiba a idade.

import java.util.Scanner;

public class exercicio09aula01 {
    public static void main(String[] args) {
        Scanner anoNasc = new Scanner(System.in);
        System.out.print("Digite o ano que você nasceu:");
        int idade = 2023 - anoNasc.nextInt();
        System.out.print("Você tem " + idade + " anos");
    }
}