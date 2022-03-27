import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
           
           
            System.out.println("Digite um número:");
            Scanner teclado = new Scanner( System.in );
            
            int numero = teclado.nextInt();

            System.out.println("O antecessor do numero digitado eh "+ (numero-1) + "\ne o sucessor eh "+(numero+1));

        }
    
    

}
