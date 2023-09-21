package exercicio01aula03;

public class exercicio01aula03 {
    public static void main(String[] args) {
        ContaBancaria clienteMD = new ContaBancaria("Michael Douglas", "000.000.000-00", 0327, "Inter", "Rua dos Magos", 2000);
        ContaBancaria clienteJB = new ContaBancaria("Jonas Brother", "111.111.111-11", 4526, "Next", "Av. dos Patos", 70000);


        clienteMD.verificarHorario();
        clienteMD.saque(2);
        clienteJB.saque(2);
        clienteMD.verificarSaldo();
        clienteJB.verificarSaldo();
        clienteMD.deposito(3);
        clienteJB.deposito(3);
        clienteMD.verificarSaldo();
        clienteJB.verificarSaldo();
        clienteJB.pix(clienteMD, 5);
        clienteMD.verificarSaldo();
        clienteJB.verificarSaldo();
        clienteMD.verificarInfo(clienteMD);
    }

}

