import java.util.Scanner;

/*Faça um programa em Java para simular uma parte do funcionamento de
uma agenda de contatos. Você deverá ter as opções de incluir uma pessoa
e listar todas as pessoas cadastradas. Cada pessoa terá nome, sobrenome e
telefone de contato. O número máximo de contatos que podem ser salvos é
definido por você. Fique à vontade.*/

public class Agenda {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        Contato[] contatos = new Contato[20];{

            int opcao = 0;

            for(int i=1;i<20;i++){  
                

                    Contato novoContato = new Contato();

                    novoContato.setAtributos();
                    
                    contatos[i]=novoContato;
        
                }

            }

           




        
    }
}
