import java.util.Scanner;

public class Conta {
    //variaveis da classe ContaTerminal
    int numeroConta = 0;
    String numeroAgencia = "";
    String nomeCliente = "";
    double saldoConta = 0.0;

    Scanner sc = new Scanner(System.in);

    public void inputNumeroConta() {
        System.out.println("Informe o número da Conta: ");
        numeroConta = sc.nextInt();
    }

    public void inputNumeroAgencia() {
        System.out.println("Informe o número da Agência: ");
        numeroAgencia = sc.next();
    }
   
    public void inputNomeCliente() {
        System.out.println("Informe o nome do Cliente: ");
        nomeCliente = sc.nextLine();
    }

    public void inputSaldoConta() {
        System.out.println("Informe o Saldo da Conta: ");
        saldoConta = sc.nextDouble();
    }
    
    public void exibirMensagem() {
        System.out.print("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+
                                numeroAgencia+", conta "+
                                numeroConta+ " e seu saldo "+
                                saldoConta+" já está disponível para saque.");
    }
}
