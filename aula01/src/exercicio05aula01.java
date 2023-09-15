//Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis,
//depois, determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s
// e a quantidade de segundos que faltam para a meia-noite.

public class exercicio05aula01 {
    public static void main(String[] args) {
        int hora = 7;
        int minuto = 15;
        int segundo = 30;
        int tempo = (((hora * 60) + minuto) * 60) + segundo;
        System.out.print(tempo);
        System.out.print("\n");
        System.out.print(86400 - tempo);
    }
}