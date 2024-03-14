import java.util.Scanner;

public class ContaTerminal {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroConta = 1021;
        double saldo = 237.48;
        String agencia;
        String nomeClinte;

        System.out.println("Digite seu Nome: ");
        nomeClinte = sc.nextLine();

        System.out.println("Digite o numero da sua Agencia  : ");
        agencia = sc.nextLine();

        System.out.println(" Olá  "  + nomeClinte +  " Obrigador por criar uma conta em nosso banco,  sua agência é: " + agencia +"."+  " Este é o número da sua conta:  " +numeroConta+ "." + " Você tem um saldo de: "+saldo+ " Já está disponivel para saque.");

    }
}