import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) throws Exception {
        
        int contador=0;
        int tamanho=20;
        int opcao = 0;

        Scanner teclado = new Scanner(System.in);

        Contato[] agenda = new Contato[tamanho];{
          

            do {
                System.out.println(" Adicionar contato Digite ==> 1 \n Listar os contatos Digite ==>2 \n Finalizar o processo e listar os contatos digite ==> 3");
                System.out.print("opção.: ");
                
                opcao=teclado.nextInt();
                if (opcao<1 || opcao>3){
                    limparTela();
                    System.out.println("O Número digitado não é valido \n");
                    System.out.println("--------------------------------------------------------------------\n");
                    System.out.println("Digite algum dos numeros abaixo. \n");
                }
                else{
                        switch(opcao){
                            case 1: 
                                limparTela();

                                if(contador<tamanho){
                                 Contato novoContato= new Contato();

                                 novoContato.setAtributos();

                                 agenda[contador]=novoContato;
                                 contador++;
                            
                                 limparTela();
                                 break;
                                }

                            case 2: 
                                 limparTela();
                                 System.out.println("Contatos adicionados até agora.: \n");

                                 for (int i = 0; i < contador; i++){
                                 agenda[i].status();                       
                                 }
                                 break;

                            case 3: 

                                 System.out.println("Esses foram os contatos adicionados.:\n");

                                 for (int i = 0; i < contador; i++) {
                                 agenda[i].status();                       
                                 }                       
                        }
                        
                    }    
            }
             while(opcao!=3);                           
        }
        teclado.close();
        
    }



    public static void limparTela() { // método para limpar a tela, pula linha 20 vezes
        for (int i = 0; i < 20; i++) {
          System.out.println();
        }
      }
}

