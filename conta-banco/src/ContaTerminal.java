import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroDaConta;
        String agencia;
        String nomeDoCliente;
        double saldo;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("---CONTA BANCARIA---");
        System.out.println("********************");

        System.out.println("\nQual seu nome: ");
        nomeDoCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da agencia: ");
        agencia = scanner.nextLine();
        System.out.println("Agora digite o número da sua conta: ");
        numeroDaConta = scanner.nextInt();
        System.out.println("Qual valor do seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %s e seu saldo %s ja esta disponivel para saque.", nomeDoCliente, agencia, numeroDaConta, saldo);

    }
}
