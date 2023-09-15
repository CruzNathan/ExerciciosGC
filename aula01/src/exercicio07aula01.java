//Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para
// o usuário a idade dele e o seu salário. A pessoa sópode comprar um automóvel se
// for de maior e ganhar mais de R$ 2.000,00.

import java.util.Scanner;

public class exercicio07aula01 {
    public static void main(String[] args) {
        System.out.print("Digite sua idade:");
        Scanner inputIdade = new Scanner(System.in);
        int idade = inputIdade.nextInt();

        System.out.print("Digite seu salário");
        Scanner inputSalario = new Scanner(System.in);
        int salario = inputSalario.nextInt();

        if (idade < 18 || salario < 2000){
            System.out.print("Compra negada");
        } else {System.out.print("Compra aprovada");}
    }
}