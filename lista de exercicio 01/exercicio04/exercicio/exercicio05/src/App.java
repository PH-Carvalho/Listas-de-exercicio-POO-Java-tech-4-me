package exercicio.exercicio05.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Escreva tres valores e saiba qual eh o tipo de triangulo.: ");
        System.out.println("Escreva o valor do lado A!");
        Scanner a =new Scanner(System.in);
        float ladoA= a.nextFloat();

        System.out.println("Escreva o valor do lado B!");
        Scanner b =new Scanner(System.in);
        float ladoB= b.nextFloat();

        System.out.println("Escreva o valor do lado C!");
        Scanner c =new Scanner(System.in);
        float ladoC=c.nextFloat();

            if(ladoA==ladoB && ladoA==ladoC && ladoB==ladoC){

             System.out.println("Esse eh um triangulo equilatero");

            }

            else if(ladoA==ladoB || ladoA==ladoC || ladoB==ladoC){

             System.out.println("Esse eh um triangulo isosceles");
            }
       
            else{
             System.out.println("Esse eh um triangulo escaleno");
            }
    }
}
