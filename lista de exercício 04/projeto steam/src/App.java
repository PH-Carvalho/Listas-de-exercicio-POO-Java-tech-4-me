import java.util.Scanner;

/*Tema: Steam
Construir um software para cadastrar, listar, buscar, remover um jogo da maior plataforma de jogos digitais do mundo - Steam.

POO - Herança! (digitais ou físicos)
POO - Encapsulamento (get e set)
POO - Construtores 
POO - Associação entre Classes (um jogo pode ter versões)

Java - Menu
Java - Scanner
Java - Limpar Tela

Dica: Utilizar vetores!*/

public class App{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quntos jogos você queer cadastrar?");
        int tamanho = teclado.nextInt();

        Steam [] listas= new Steam[tamanho]; 

          int i =0;
        do{
            Steam teste =new Steam();

           teste.cadastrar();

            listas[i]=teste;
           
            i++;
        }while(i<tamanho);

        for (int j = 0; j < tamanho; j++) {
           System.out.print( listas[j].getNomeJogo());
           listas[];
           
        }
        
        
        
        
    }
}
 
