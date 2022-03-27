public class CartaoCredito extends Cartao {
    private float limiteCredito;
    private int parcelas;



    public CartaoCredito(float limiteCredito, int parcelas){
        this.limiteCredito=limiteCredito;
        this.parcelas=parcelas;
    }
    public CartaoCredito(){

    }

    public void setParcela(int parcelas){
        
        if(parcelas>1 && parcelas<=10){
        this.parcelas=parcelas;
        }
        else{System.out.println("Numero de parcelas invalido ");}
    }

    public int getParcelas(){
        return parcelas;
    }
    public void setLimiteCredito(float limiteCredito){
        this.limiteCredito=limiteCredito;
        
    }
    public float getLimiteCredito(){
        return limiteCredito;
    }

    @Override
    public float pagamento (float totalPagar){

        if(limiteCredito>totalPagar){
             setLimiteCredito(this.limiteCredito-=totalPagar);

             System.out.println("Você pode parcelar até 10x.");
             System.out.println("Por quantas vezes você deseja parcelar sua compra?");
             setParcela(teclado.nextInt());

             totalPagar/=this.getParcelas();
            
            for (int i = 1; i <= parcelas; i++) {
                System.out.println(i+"° mês.: " + getSaldo() + "R$");
                System.out.println("Limite Caratão.: "+ getLimiteCredito() + "R$");
                System.out.println("-----------------------------------------------------------------");
                setSaldo(super.saldo-=totalPagar);
                setLimiteCredito(limiteCredito+=totalPagar);
            }
        }
        else{System.out.println("Limite indisponível.");
        }
        return saldo;
    }
}
