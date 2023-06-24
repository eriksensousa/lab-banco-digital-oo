import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        
        System.out.println("Por favor, digite o número da conta:");
        numeroConta= sc.nextInt();
        
        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.next();

        System.out.println("Por favor, digite seu nome:");
        nomeCliente = sc.next();

        System.out.println("Por favor digite seu saldo:");
        saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", " + "conta " + numeroConta + " e seu saldo " + saldo + " e já está disponível para saque");
    }
}
