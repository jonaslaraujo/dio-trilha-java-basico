import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, informe seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Por favor, informe a agencia: ");
        String agencia = scan.nextLine();

        System.out.println("Por favor, informe a conta: ");
        int conta = scan.nextInt();

        System.out.println("Por favor, informe o deposito inicial: ");
        double saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2.2f já está disponível para saque", nome, agencia, conta, saldo);
    }
}
