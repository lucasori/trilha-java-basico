import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int numero =  sc.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = sc.next();

        System.out.println("Nome do cliente: ");
        String cliente = sc.next();

        System.out.println("Saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s" +
                ", conta %d e seu saldo %.2f", cliente, agencia, numero, saldo));

    }
}
