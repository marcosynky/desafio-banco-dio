public class ContaCorrente extends Conta { //extends Conta

    public ContaCorrente(Cliente cliente) { //ContaCorrente(Cliente cliente)
        super(TipoConta.CORRENTE, cliente); //super(TipoConta.CORRENTE, cliente)
    }
}
