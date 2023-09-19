public class exercicio01aula03 {

    private String nome;
    private int cpf;
    private int identConta;
    private String banco;
    private String endereco;
    private double saldo;
    private String horarioAtual;


    public void saque(double valor){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Erro: Saldo insuficiente");
        }
    }
}

