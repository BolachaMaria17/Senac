import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(633.00); //DEFINE VALOR SALMO
        Scanner read = new Scanner(System.in);

        System.out.println("Seja bem vindo ao RiamaInternetBanking");
        System.out.println("Digite seu usuário:");
        String user = read.nextLine();
        System.out.println("Welcome "+user+"! Adoramos te ver por aqui.");
        System.out.println("Agora, digite a sua senha para acessar a sua conta");
        int password = read.nextInt();
        int option = 0;
        if (password == 123456) {
                System.out.println("--------------------------------");
                System.out.println("|1 - Ver meu extrato           |");
                System.out.println("|2 - Realizar um depósito      |");
                System.out.println("|3 - Realizar um saque         |");
                System.out.println("|4 - Sair da conta             |");
                System.out.println("--------------------------------");
                System.out.println("You're in. Escolha uma opção: ");
            while (option != 4) {
                option = read.nextInt();
                if (option == 1) {
                    conta.verificaSaldo();
                    System.out.println("--------------------------------");
                } if (option == 2) {
                System.out.println("Informe o valor que deseja depositar");
                conta.depositar(read.nextDouble()); //AGREGAR VALOR AO SALDO
                conta.verificaSaldo();
                System.out.println("--------------------------------");
                } if (option == 3){
                System.out.println("Informe o valor que deseja depositar");
                conta.saque(read.nextDouble());
                conta.verificaSaldo();
                System.out.println("--------------------------------");
                } if (option == 4) {
                    System.out.println("Volte sempre para verificar sua conta!");} 
            } 
        }
    }
}

