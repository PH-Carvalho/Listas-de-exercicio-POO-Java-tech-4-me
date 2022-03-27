import java.util.Scanner;

/*1) Faça um programa para criar N (fornecido pelo usuário) objetos do tipo
Funcionário (matrícula, nome e salário) e solicitar ao usuário que entre com
dados para os N funcionários criados. Ao final imprima os valores fornecidos
para estes funcionários, juntamente com a média salarial.*/



public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado =new Scanner(System.in);
        
        System.out.println("Quantos funcionarios você deseja cadastrar? ");

        int numFuncionario = teclado.nextInt();

        Funcionario[] funcionarios = new Funcionario[numFuncionario];

            for (int i=0;i<numFuncionario;i++){

                Funcionario funcionario = new Funcionario();
                funcionario.setAtributos();

                funcionarios[i]=funcionario;
            }

            for(Funcionario funcionario:funcionarios){
                 funcionario.status();
            }

        teclado.close();
    }
}

   
