public class ContaPoupanca extends Conta {
    //metodos
    public void reajustar (double percentual) {
        this.saldo += saldo * percentual;
    }
    public ContaPoupanca(int numero, String nome_titular) {
        super(numero, nome_titular);
    }
    @Override
    public void imprimirTipoConta(){
        System.out.println("Conta Poupança");
    }
}
