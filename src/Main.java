public class Main {

    public static void main(String[] args) {

        Cliente henrique = new Cliente();
        henrique.setNome("D");

        Conta cc = new ContaCorrente(henrique);
        cc.depositar(9400);

        Conta poupanca = new ContaPoupanca(henrique);

        cc.transferir(600.0, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
