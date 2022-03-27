

public class Debito extends Cartao {

    

    @Override

    public float pagamento(float totalPagar){

       if(saldo>=totalPagar){ 
        setSaldo(saldo-=totalPagar);
        System.out.println("Pagamento realizado com sucesso.");
       }
       else{
           System.out.println("Seu saldo está indisponivel para realizar essa ação.");
        }

     return saldo;

    }
}
