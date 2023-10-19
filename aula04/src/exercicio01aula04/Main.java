package exercicio01aula04;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("BMW", "IX", 2022);
        Veiculo moto = new Moto("Harley", "Sportster", 2023);

        System.out.println(carro.calcularCustoViagem(10));
        System.out.println(moto.calcularCustoViagem(10));
    }
}
