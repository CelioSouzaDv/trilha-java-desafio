
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int numeroConta;
        String agenciaBancaria;
        String nomeCliente;
        final double saldo;

        System.out.println("Olá seja bem vindo ao nosso banco, vamos iniciar a sua abertura de conta.");
        System.out.println("#---------------------------------------------------#");

        System.out.println("Por favor digite o numero da sua Conta Bancaria");
        numeroConta = input.nextInt();

        System.out.println("---------------------------------------------------");

        System.out.println("Agora digite o numero da Agencia");
        agenciaBancaria = input2.nextLine();

        System.out.println("---------------------------------------------------");

        System.out.println("Digite o seu nome completo");
        nomeCliente = input2.nextLine();

        System.out.println("---------------------------------------------------");

        System.out.println("E agora por ultimo o valor que será depositado em sua conta");
        saldo = input.nextDouble();

        System.out.println("#---------------------------------------------------#");

        System.out.println("Conta criada com sucesso!");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBancaria +", conta " + numeroConta +" e seu saldo " + saldo + " disponivel para saque e transações.");
        

        input.close();
        input2.close();
    }
}
