import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class exercicio01aula05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numeros = new ArrayList<String>();
        int soma = 0;
        int num;

        for(int x = 1; x <= 5; x++) {
            System.out.println("Digite o " + x + "º número");
            num = scanner.nextInt();
            soma = soma + num;
            numeros.add(String.valueOf(num));
        }

        System.out.println(numeros);
        System.out.println(soma);
    }
}
