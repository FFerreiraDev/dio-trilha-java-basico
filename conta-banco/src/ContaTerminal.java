public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();

        conta.inputNumeroConta();
        conta.inputNumeroAgencia();
        conta.inputNomeCliente();
        conta.inputSaldoConta();
        conta.exibirMensagem(); 
    }
}
