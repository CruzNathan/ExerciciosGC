//Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir
// um menu de opções, perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das
// alternativas. Se ela for PCD, Idosa ou Gestante, tem direito a fila
// prioritária. Se não, não tem direito."

import java.util.Scanner;

public class exercicio08aula01 {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        System.out.print("##--Você necessita de prioridade?--##\n");
        System.out.print("|-----------------------------------|\n");
        System.out.print("| 1 - Sim, sou gestante ------------|\n");
        System.out.print("| 2 - Sim, sou idoso ---------------|\n");
        System.out.print("| 3 - Sim, sou PCD -----------------|\n");
        System.out.print("| 4 - Não --------------------------|\n");
        System.out.print("##---------------------------------##\n\n");

        int opcao = menu.nextInt();

        if (opcao == 4) {
            System.out.print("Você não tem direito a fila prioritária");
        } else { System.out.print("Você tem direito a fila priritária");}
    }
}