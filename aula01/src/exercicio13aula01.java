//Escreva um programa que calcule o fatorial de um número inteiro não negativo
// fornecido pelo usuário. O fatorial de um número N é o produto de todos os
// inteiros de 1 até N.

import java.util.Scanner;

public class exercicio13aula01 {
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner inputN = new Scanner(System.in);
        int n = inputN.nextInt();

        int f = 1;
        int c = n;
        String s = "";

        while (c > 1) {
            f *= c;
            s += c + " x " ;
            c--;
        }
        s += c;

        System.out.print(s +" = "+ f);
    }
}