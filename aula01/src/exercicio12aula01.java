//Crie um programa que converta uma quantia em dólares para outra moeda, como
// euros ou reais. Peça ao usuário para inserir a quantia em dólares e a taxa
// de câmbio atual. Em seguida, calcule e exiba o valor convertido.

import java.util.*;

public class exercicio12aula01 {
    public static void main(String[] args) {
        System.out.print("Digite uma quantia em dólares (use ',' e não '.'): ");
        Scanner inputDol = new Scanner(System.in);
        float dolar = inputDol.nextFloat();

        System.out.print("Digite a taxa de câmbio atual: ");
        Scanner inputTaxa = new Scanner(System.in);
        float taxa = inputTaxa.nextFloat();

        float cambio = dolar * taxa;

        System.out.print(cambio);
    }
}