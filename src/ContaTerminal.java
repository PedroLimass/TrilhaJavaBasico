import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Limpa o buffer do scanner
        scanner.nextLine();

        // Solicita e lê o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.print("Por favor, digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo da conta
        System.out.print("Por favor, digite o seu Saldo: ");
        double saldo = scanner.nextDouble();


        String saldoFormatado = String.format("%.2f", saldo);


        // Exibe a mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    }
}

