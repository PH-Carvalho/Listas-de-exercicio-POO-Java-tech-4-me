import java.util.Scanner;

public class Produtos {
    public String nome;
    public  int quantidade;
    public float valor;
    public float preco;

    void setUsuario(){
        System.out.println("Qual é o nome do produto");
        Scanner nomeProduto = new Scanner(System.in);
        nome=nomeProduto.nextLine();

        System.out.println("Quantos protudos está levando?");
        Scanner quantidadeProduto = new Scanner(System.in);
        quantidade=quantidadeProduto.nextInt();

        System.out.println("Qual é o valor do produto");
        Scanner valorProduto = new Scanner(System.in);
        valor=valorProduto.nextFloat();
    }


    void status(){

        System.out.println("Protudo.: "+ this.nome+"\n ------------------------");
        System.out.println("Quantidade.: "+ this.quantidade+"\n ------------------------");
        System.out.println("O valor eh de.: "+ (this.preco=this.quantidade*this.valor)+"R$"+"\n ------------------------");
    }

    void metodo(){
        for(int i=0;i<=10;i++){
        setUsuario();
        status();
    }

}
}
