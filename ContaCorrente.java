//New Conta Corrente
public class ContaCorrente extends Conta implements Tributavel {
    // executa agora o contrutor expecifico da class mom
    public ContaCorrente(int agencia , int numero){
        super(agencia,numero);

    }
    // subescrever os metodos da class mom
    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + (0.2) ;
        return super.saca(valorASacar);
    }
    @Override
    public void deposita(double valor){
        super.saldo += valor;

    }

    @Override
    public double getValorImposto() {
        return  super.saldo * 0.01;
    }
}
