import java.util.Scanner;

/*1) Faça um programa para criar N (fornecido pelo usuário) objetos do tipo
Funcionário (matrícula, nome e salário) e solicitar ao usuário que entre com
dados para os N funcionários criados. Ao final imprima os valores fornecidos
para estes funcionários, juntamente com a média salarial.*/

public class Funcionario {

    private String nome;
    private int matricula;
    private Float salario;
    public int quantFuncionario;

    Scanner teclado = new Scanner (System.in);

    
 public Funcionario(String nome,int matricula,Float salario) {
    this.nome = nome;
    this.matricula = matricula;
    this.salario = salario;
}

public Funcionario(){
    
}

    public void setNome(String Nome){
        this.nome=Nome;
    }
   public  String getNome(){

        return nome;
    }

   public void setMatricula(int Matricula){
        this.matricula = Matricula;
    }
   public int getMatricula(){

        return matricula;
    }
    
    public void setSalario(Float Salario){
        this.salario=Salario;
    }
    public Float getSalario(){

        return salario;
    }
/*----------------------------------------------------------------------------*/

    public void setAtributos(){

        System.out.println("Qual é o nome do funcionario? ");

        nome=teclado.nextLine();

        System.out.println("Qual a matricula do "+ this.nome);
        matricula=teclado.nextInt();

        System.out.println("Qual o salario do(a) "+this.nome);
        salario=teclado.nextFloat();       
}
    public void status(){


        System.out.println("FUNCIONARIO.: "+this.nome);
        System.out.println("MATRICULA.: "+this.matricula);
        System.out.println("SALARIO.: "+this.salario+"R$");
        System.out.println("-------------------------------------");


teclado.close();
}

}










/* Scanner teclado = new Scanner(System.in);

   public void setAtributos(){

            System.out.println("Qual é o nome do funcionario? ");

            nome=teclado.nextLine();

            System.out.println("Qual a matricula do "+ this.nome);
            matricula=teclado.nextInt();

            System.out.println("Qual o salario do(a) "+this.nome);
            salario=teclado.nextFloat();       
    }

   public void status(){


            System.out.println("FUNCIONARIO.: "+this.nome);
            System.out.println("MATRICULA.: "+this.matricula);
            System.out.println("SALARIO.: "+this.salario);

        teclado.close();
    }
    */