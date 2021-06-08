public class TestaMetodo {

    public static void main(String[] args){
        Conta contaDoJonas = new Conta();
        contaDoJonas.saldo = 100;
        contaDoJonas.deposita(50);
        System.out.println(contaDoJonas.saldo);

        contaDoJonas.saca(20);
        System.out.println(contaDoJonas.saldo);

        boolean conseguiuRetirar = contaDoJonas.saca(20);
        System.out.println(conseguiuRetirar);

        Conta contaErika = new Conta();
        contaErika.deposita(1000);

        boolean sucessoTransferencia = contaErika.transfere(300, contaDoJonas);
        if(sucessoTransferencia){
            System.out.println("transferência realizada com sucesso");
        }else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println(contaErika.saldo);
        System.out.println(contaDoJonas.saldo);
    }
}
