import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    List<Pessoa> listaDeColaboradores = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);
        int opcao=0;
        do{
            menu();
            opcao=teclado.nextInt();
            teclado.nextLine();

            switch(opcao) {

                case 1: Pessoa pessoa = new Pessoa();
                System.out.print("Digite o nome completo do colaborador.: ");
                pessoa.setNomeCompleto(teclado.nextLine());
    
                System.out.print("OBS.: Digite nesse padrão para evitar erro no cadastro.: 111.111.111-11 \n Digite o CPF do Colaborador.: ");

                pessoa.setCpf(teclado.nextLine());

                System.out.println("Qual a data de nascimento do colaborador");
                


            }


        }while(opcao!=0);

        teclado.close();
    }

    public static void menu(){
        System.out.println("*-------------MENU-------------*");
        System.out.println("1==> Cadastrar Colaborador");
        System.out.println("2==> Listar Colaboradores cadastrados");
        System.out.println("3==> Gerar arquivo da Lista de Cadastro");
        System.out.println("0==> Finalizar Cadastros");
        System.out.println("Opção.: ");
    }
}
