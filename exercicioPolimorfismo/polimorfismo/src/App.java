import java.util.Scanner;

public class App {

public static void main(String[] args) throws Exception {
    Scanner teclado=new Scanner(System.in);

    CartaoCredito usarCredito = new CartaoCredito();
    Debito usarDebito = new Debito();

    System.out.println("Qual é o seu saldo em conta?");
    
    float saldo=teclado.nextFloat();

    System.out.println("Você deseja utilizar o cartão de credito ou o de debito?");
    System.out.println("1==> Credito\n 2==>Débito");
    System.out.print("Opção.:");
    int opcao=teclado.nextInt();

        if(opcao==1){

            usarCredito.setSaldo(saldo);

            usarCredito.setLimiteCredito(usarCredito.getSaldo()/2);
            System.out.println("Seu limite de compra no cartao de credito é de: "+ usarCredito.getLimiteCredito());
            
            System.out.println("Quanto você tem de pagar?");
            usarCredito.pagamento(teclado.nextFloat());
            
            System.out.println("Saldo ao Final dos 10 mêses.: " + usarCredito.getSaldo() + "R$");
        }
        else if(opcao==2){

            usarDebito.setSaldo(saldo);

            System.out.println("Quanto você tem que pagar?");

            usarDebito.pagamento(teclado.nextFloat());

            System.out.println("Saldo.:" + usarDebito.getSaldo());
            
        }else {
            System.out.println("Opção invalida!");
        }

        teclado.close();


}
}
