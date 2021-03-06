public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int numeroContas;

    //CONSTRUTOR
    public Conta (int agencia, int numero){
        numeroContas++;
        //System.out.println("O total de contas é :"+ numeroContas);
        this.agencia= agencia;
        this.numero = numero;
        //System.out.println("estou criando uma conta :"  + this.numero);
    }


    public abstract void deposita(double valor);


    public boolean saca(double valor){
        if (this.saldo>= valor){
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
    public boolean transfere(double valor,Conta destino){
        if(this.saca(valor)){
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }

    }
    public double getSaldo(){
        return this.saldo;

    };

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        if(numero <=0 ){
            System.out.println("Não pode valor <=o");
            return;
        }
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <=0){
            System.out.println("Não pode valor menor  ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getNumeroContas() {
        return numeroContas;
    }

    public static void setNumeroContas(int numeroContas) {
        Conta.numeroContas = numeroContas;
    }

}
