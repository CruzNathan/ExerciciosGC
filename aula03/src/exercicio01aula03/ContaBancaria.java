package exercicio01aula03;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ContaBancaria {
    private String nome;
    private String cpf;
    private int identConta;
    private String banco;
    private String endereco;
    private double saldo;


    public ContaBancaria(String nome, String cpf, int identConta, String banco, String endereco, double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.identConta = identConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
    }


    public void saque(double valor){
        if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Erro: Saldo insuficiente");
        }
    }

    public void deposito(double valor){
        saldo = saldo + valor;
        System.out.println("Deposito efetuado com sucesso");
    }

    public void pix(ContaBancaria destino, double valor){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
            System.out.println("Pix efetuado com sucesso");
        } else {
            System.out.println("Erro: Saldo insuficiente");
        }
    }

    public void transferencia(ContaBancaria destino, double valor){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
            System.out.println("Transferência efetuada para " + destino.nome + "com sucesso");
        } else {
            System.out.println("Erro: Saldo insuficiente");
        }
    }

    public void verificarSaldo() {
        System.out.println("Seu saldo é de: R$" + saldo);
    }

    public void verificarHorario(){
        java.time.format.DateTimeFormatter dtf2 = java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(dtf2.format(LocalDateTime.now()));
    }

    public void verificarInfo(ContaBancaria destino){
        System.out.println("Nome: " + destino.nome);
        System.out.println("CPF: " + destino.cpf);
        System.out.println("Núm. da conta: " + destino.identConta);
        System.out.println("Banco: " + destino.banco);
        System.out.println("Endereço: " + destino.endereco);
        System.out.println("Saldo: " + destino.saldo);
    }
}
