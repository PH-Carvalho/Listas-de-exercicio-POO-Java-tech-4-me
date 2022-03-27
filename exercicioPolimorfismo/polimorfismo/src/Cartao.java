import java.util.Scanner;

public class Cartao {
    protected float saldo; 
    Scanner teclado = new Scanner(System.in); 

    public void setSaldo(float saldo){
        this.saldo=saldo;
    }

    public float getSaldo(){
        return saldo;
    }

    public float pagamento(float totalPagar){
        return 0;
    }
    

}
