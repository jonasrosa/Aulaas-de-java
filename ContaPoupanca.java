public class ContaPoupanca extends ContaCorrente {


    public ContaPoupanca(int agencia , int numero){
        super(agencia,numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
