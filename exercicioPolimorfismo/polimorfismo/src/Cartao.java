import java.util.Scanner;

public abstract class Cartao {
    protected float saldo; 
    protected float totalPagar;
    
    Scanner teclado = new Scanner(System.in); 

    public void setTotalPagar(float totalPagar){

        this.totalPagar=totalPagar;

    }
    public float getTotalPagar(){
        return totalPagar;
    }

    public void setSaldo(float saldo){
        this.saldo=saldo;
    }

    public float getSaldo(){
        return saldo;
    }

    public abstract void pagamento();
    

}
