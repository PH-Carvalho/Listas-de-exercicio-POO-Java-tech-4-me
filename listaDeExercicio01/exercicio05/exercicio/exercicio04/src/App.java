import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um numero para saber os impares existente entre 1 e o seu numero.");
        Scanner teclado =new Scanner(System.in);
        int numero = teclado.nextInt();

        for(int i=1;i<=numero;i++){
            if(i%2!=0){
                System.out.println( i );
            }
        }
    }
}
