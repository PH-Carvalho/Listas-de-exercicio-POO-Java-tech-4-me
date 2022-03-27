import java.util.Scanner;

public class Contato{

    public String nome;
    public String sobreNome;
    private int numeroTelefone;

    public Contato(String nome, String sobreNome,int numeroTelefone){
        
        this.nome=nome; 
        this.sobreNome=sobreNome;  
        this.numeroTelefone=numeroTelefone;
    }
    public Contato(){
    }

    public void setNome(String Nome){
        nome=Nome;
    }

    public String getNome(){
        return nome;
    }

    public void set_sobre_nome(String sobre_nome){
        sobreNome=sobre_nome;
    }

    public String get_sobre_nome(){
        return sobreNome;
    }

    public void set_numero_telefone(int numero_telefone){
        numeroTelefone=numero_telefone;
    }

    public int get_numero_telefone(){
        return numeroTelefone;
    }

    public void setAtributos(){

        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Digite o nome do contato.: \n");
            String setNome = teclado.next();

        System.out.print("Digite o sobre nome do contato.: \n");
            String set_sobreNome=teclado.next();
    
        System.out.print("Digite o numero do contato.: \n");
            int set_numeroTelefone=teclado.nextInt();
    
            this.nome=setNome;
            this.sobreNome=set_sobreNome;
            this.numeroTelefone=set_numeroTelefone;
       }

       public void status(){
           System.out.print("NOME.:" + this.nome + this.sobreNome);
           System.out.print("TELEFONE.: "+ this.numeroTelefone+"\n"); 
           System.out.println("-------------------------------------------");

       }
       }

