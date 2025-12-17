public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(1200);
        conta.setSaldo(180);
        conta.titular = "Maria Clara";

        System.out.println("Titular da conta: " + conta.titular);
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.setSaldo(1500);
        System.out.println("Novo saldo: " + conta.getSaldo());

    }


}
