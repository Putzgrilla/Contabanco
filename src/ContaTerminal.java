import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Integer numero;
        String agendecia;
        String nomeCliente;
        Double saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        agendecia=sc.nextLine();
        System.out.println(" ");
        System.out.println("Por favor, digite o Seu nome !");
        nomeCliente=sc.nextLine();
        System.out.println(" ");
        System.out.println("Por favor, digite o numero da conta !");
       numero=sc.nextInt();
        System.out.println(" ");
        System.out.println("Por favor, digite o saldo !");
        saldo=sc.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",nomeCliente,agendecia,numero,saldo));







    }
}