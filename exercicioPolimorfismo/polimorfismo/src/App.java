import java.util.Scanner;

public class App {

public static void main(String[] args) throws Exception {
    Scanner teclado=new Scanner(System.in);

    CartaoCredito usarCredito = new CartaoCredito();
    Debito usarDebito = new Debito();

    System.out.println("Qual é o seu saldo em conta?");
    
    float divida=teclado.nextFloat();

    System.out.println("Você deseja utilizar o cartão de credito ou o de debito?");
    System.out.println("1==> Credito\n2==>Débito");
    System.out.print("Opção.:");
    int opcao=teclado.nextInt();

        if(opcao==1){

            usarCredito.setSaldo(divida);

            usarCredito.setLimiteCredito(usarCredito.getSaldo()/2);
            System.out.println("Seu limite de compra no cartao de credito é de:"+ usarCredito.getLimiteCredito());
            
            usarCredito.pagamento();

            System.out.println( usarCredito.getSaldo());
        }
        else if(opcao==2){

            usarDebito.setSaldo(divida);
            usarDebito.pagamento();
            System.out.println(usarDebito.getSaldo());
            
        }else {
            System.out.println("Opção invalida!");
        }

        teclado.close();


}
}
