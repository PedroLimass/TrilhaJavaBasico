//import java.util.Scanner;
//
//public class ContaTerminal {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite o número da agência:");
//        String agencia = scanner.nextLine();
//
//        System.out.println("Digite o Nome Cliente:");
//        String nomeCliente = scanner.nextLine();
//
//        System.out.println("Digite o Número da conta:");
//        Number numeroConta = scanner.nextInt();
//
//        System.out.println("Digite o saldo:");
//        Double saldoConta = scanner.nextDouble();
//
//        String mensage = String.format("Olá %s, Obrigada por criar uma conta em nosso banco, sua agência é %s, conta %d e seu  saldo %.2f já está disponivél para saque.",nomeCliente,agencia,numeroConta,saldoConta);
//
//        System.out.println(mensage);
//
//        scanner.close();
//
//    }
//}
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            // Entrada da agência (Texto)
            System.out.println("Digite o número da agência (ex: 067-8):");
            String agencia = scanner.nextLine();

            // Entrada do nome do cliente (Texto)
            System.out.println("Digite o Nome do Cliente (ex: MARIO ANDRADE):");
            String nomeCliente = scanner.nextLine();

            // Entrada do número da conta (Inteiro)
            System.out.println("Digite o Número da conta (ex: 1021):");
            int numeroConta = scanner.nextInt();

            // Entrada do saldo (Decimal)
            System.out.println("Digite o saldo (use ponto para decimais, ex: 237.48):");
            double saldoConta = scanner.nextDouble();

            // Formatação da mensagem de saída
            String mensagem = String.format("Olá %s, obrigada por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldoConta);

            // Exibição da mensagem
            System.out.println(mensagem);

        } catch (InputMismatchException e) {
            // Tratamento de erro para entrada inválida
            System.out.println("Erro: formato de entrada inválido. Por favor, certifique-se de digitar os números corretamente.");
        } finally {
            // Fechamento do scanner para evitar vazamento de recursos
            scanner.close();
        }
    }
}

