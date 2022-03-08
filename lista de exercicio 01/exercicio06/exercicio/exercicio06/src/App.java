import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite dois numeros eh saiba todos os pares entre o menor e o maior numero.");
        
        System.out.println("Digite o primeiro numero!");
        Scanner teclado1= new Scanner(System.in);
        int primeiroNumero = teclado1.nextInt();

        System.out.println("Digite o segundo numero!");
        Scanner teclado2= new Scanner(System.in);
        int segundoNumero = teclado2.nextInt();

        int maiorNumero = 0;
        int menorNumero = 0;

        if (segundoNumero>primeiroNumero){
            maiorNumero=segundoNumero;
            menorNumero=primeiroNumero;
        }
        else{
            maiorNumero=primeiroNumero;
            menorNumero=segundoNumero;
        }

        if (primeiroNumero==segundoNumero){
            System.out.println("Os numeros digitados foram iguais. \n Tente numeros diferentes para conseguir ter um melhor resultado.\n Como exemplo 1 e 10 .: \n 2 \n 4 \n 6 \n 8.");
        }
        else{

            System.out.println("Os pares entre os numero escolhidos sao.:");
            for(int i=menorNumero;i<maiorNumero;i++){

                if(i%2==0){
                 System.out.println(i);
                }
            }

        }
    }
}