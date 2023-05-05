public class Conta {
    // atributos
    protected int numero;
    protected String nome_titular;
    protected double saldo;

    // metodos
    public Conta(int numero, String nome_titular, double saldo) {
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }

    public Conta(int numero, String nome_titular) {
        this.numero = numero;
        this.nome_titular = nome_titular;
    }

    void depositar(double valor) {
        this.saldo = this.getSaldo() + valor;
    }

    boolean sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public void imprimirTipoConta() {
        System.out.println("Conta Comum");
    }
}