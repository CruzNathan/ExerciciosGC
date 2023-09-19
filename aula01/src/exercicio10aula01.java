//Crie um programa em Java que peça ao usuário para inserir uma temperatura em graus
// Celsius e, em seguida, converta essa temperatura em graus Fahrenheit usando a
// fórmula: Fahrenheit = (Celsius * 9/5) + 32. Exiba o resultado na tela.

import java.util.Scanner;

public class exercicio10aula01 {
    public static void main(String[] args) {
        Scanner celsius = new Scanner(System.in);
        System.out.print("Digite uma temperatura em Celsius");
        int fahren = (celsius.nextInt() * 9 / 5) + 32;
        System.out.print(fahren);
    }
}