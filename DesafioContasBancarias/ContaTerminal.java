import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // contruir a conta(int numero, string agencia, string cliente, double saldo )
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome :");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o numero da Agência :"); 
        String numeroAgencia = scanner.nextLine();

        System.out.println("Digite o numero da conta :");
        int numeroConta = scanner.nextInt();
        if (numeroConta <= 0){
            do {
                System.out.println("Digite um valor maior que 0 !");
                numeroConta = scanner.nextInt();
            }
            while(numeroConta <= 0 );
        } 
        System.out.println("Digite o sue saldo da conta :");
        double saldoConta = scanner.nextDouble();

        ContaBanco conta = new ContaBanco(numeroConta, numeroAgencia, nomeCliente, saldoConta);

        conta.imprimirInformacoes();
    } 
}

    

