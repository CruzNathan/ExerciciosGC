package exercicio01aula04;

public class Moto extends Veiculo{
    public Moto(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }
    @Override
    public double calcularCustoViagem(int distancia){
        return distancia * 0.15;
    }
}
