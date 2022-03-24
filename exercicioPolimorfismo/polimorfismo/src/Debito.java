

public class Debito extends Cartao {

    

    @Override

    public void pagamento(){

        System.out.println("Qual é o valor que você deseja pagar?");

        setTotalPagar(teclado.nextFloat());

       if(saldo>=totalPagar){ 
        setSaldo(saldo-=totalPagar);
       }
       else{
           System.out.println("Seu saldo está indisponivel para realizar essa ação.");
    }


    }
}
