//Escreva um programa que leia a idade do usuário e imprima respostas diferentes
// dependendo do número colocado:

//Se for menor de 16 anos, avisar que não pode votar;
//Se tiver 16 ou 17, avisar que o voto é facultativo;
//Se tiver mais de 65, avisar que também é facultativo o voto;
//De 18 até 65, é obrigatório votar.

import java.util.Scanner;public class exercicio06aula01 {
    public static void main(String[] args) {
        int idade = 18;

        if (idade < 16){
            System.out.print("Não pode votar");
        } else if (idade == 16 || idade == 17 || idade > 65) {
            System.out.print("O voto é facultativo");
        } else {
            System.out.print("Voto obrigatório");
        }
    }
}