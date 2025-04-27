public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();

        conta.inputNomeCliente();
        conta.inputNumeroConta();
        conta.inputNumeroAgencia();
        conta.inputSaldoConta();
        conta.exibirMensagem(); 
    }
}
