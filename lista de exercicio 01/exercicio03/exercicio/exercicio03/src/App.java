import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o comprimento do lote");
        Scanner comprimento = new Scanner(System.in);
        float valorComprimento=comprimento.nextFloat();

        System.out.println("Digite a largura  do lote");
        Scanner largura = new Scanner(System.in);
        float valorLargura=largura.nextFloat();

        float valorArea = valorComprimento*valorLargura;
        
        System.out.println("O valor da area eh de.: "+ valorArea +"Metros quadrados");
    }
}
