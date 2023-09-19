//Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.

import java.util.Arrays;

public class exercicio03aula01 {
    public static void main(String[] args) {
        int[] num = {5, 7, 3};
        System.out.println(Arrays.stream(num).max().getAsInt());
        System.out.println(Arrays.stream(num).min().getAsInt());
        System.out.println((num[0] + num[1] + num[2]) / 3);
    }
}