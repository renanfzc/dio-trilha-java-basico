import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //TODO: Exibir as mensagens para nosso usuário
        System.out.println("Por favor digite o numero da conta!");
        System.out.print("Usuário: ");
        //TODO: Obter pela classe Scanner os valores digitados no terminal
        int numero = scanner.nextInt();

        System.out.println();

        System.out.println("Por favor digite o numero da Agência!");
        System.out.print("Usuário: ");
        String agencia = scanner.next();

        System.out.println();

        System.out.println("Por favor digite o nome do Cliente!");
        System.out.print("Usuário: ");
        String nomeCliente = scanner.next();

        System.out.println();

        System.out.println("Por favor digite o Saldo!");
        System.out.print("Usuário: ");
        double saldo = scanner.nextDouble();

        //TODO: Exibir a mensagem da conta criada

        System.out.println("Olá " + nomeCliente +" obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +
        " conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
