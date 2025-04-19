//Classe Conta
public class Conta {
    protected static int AGENCIA_PADRAO = 1;

    protected int agencia; //Atributos
    protected int numeroDaConta; //Atributos
    protected double saldo; //Atributos
    protected String tipoConta; //Atributos
    protected Cliente cliente; //Atributos


    private static int SEQUENCIAL = 1; //Atributos


    public Conta(TipoConta tipoConta, Cliente cliente) { //Construtor
        this.agencia = 1; //Atributos
        this.numeroDaConta = SEQUENCIAL++; //Atributos
        this.tipoConta = tipoConta.name(); //Atributos
        this.cliente = cliente; //Atributos
    }


    public void sacar( double valor) { //Metodo
        saldo -= valor;

    }


    public void depositar (double valor) { //Metodo
        saldo += valor;

    }

    public void transferir( double valor, Conta contaDestino){ //Metodo
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    public void imprimirExtrato() { //Metodo
        System.out.println("===== Extrato da Conta =====");
        System.out.printf("Cliente: %s\n", cliente.getNome());
        System.out.printf("Agencia: %d\n", agencia);
        System.out.printf("Numero da conta: %d\n", numeroDaConta);
        System.out.printf("Saldo: %.2f\n", saldo);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("============================");
    }

    public int getAgencia() {
        return agencia;
    } //Metodo

    public int getNumeroDaConta() {
        return numeroDaConta;
    } //Metodo

    public double getSaldo() {
        return saldo;
    } //Metodo


}
