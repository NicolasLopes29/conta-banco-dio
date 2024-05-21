import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Por favor digite seu nome");
        String nome = scn.nextLine();

        System.out.println("Por favor digite o número da agência");
        String numAgencia = scn.nextLine();

        System.out.println("Por favor digite o número da conta");
        String numConta = scn.nextLine();

        System.out.println("Por favor digite o saldo");
        float saldo = scn.nextFloat();

        System.out.println("Olá " + nome + ",obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + numConta +" e seu saldo " + saldo + " já está disponível para saque.");
    }
}