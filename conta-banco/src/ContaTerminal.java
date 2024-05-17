import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        System.out.println("Por favor, informe seu nome completo: ");
        String nomeCliente = read.nextLine();

        System.out.print("Por favor, informe a sua agência: ");
        String agencia = read.nextLine();

        System.out.print("Por favor, informe o número da sua conta: ");
        int numeroConta = read.nextInt();

        System.out.print("Por favor, informe seu saldo: ");
        double saldo = read.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        read.close();
    }
}
