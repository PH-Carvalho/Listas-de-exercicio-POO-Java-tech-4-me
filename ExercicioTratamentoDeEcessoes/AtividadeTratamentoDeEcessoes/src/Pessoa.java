import java.time.LocalDate;
import java.util.zip.DataFormatException;

import execao.*;

public class Pessoa  {
    private String nomeCompleto;
    private String cpf;
    private LocalDate dataNascimento;
    private double salario;
    private boolean nomeComposto=false; 

    public Pessoa(String nomeCompleto, String cpf, LocalDate dataNascimento, double salario) throws nomeInvalidoException,cpfInvalidoException, DataFormatException{
        setNomeCompleto(nomeCompleto);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
        setSalario(salario);

    }
    public Pessoa(){

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) throws nomeInvalidoException  {

       if (nomeCompleto==null){
            throw new nomeInvalidoException("Adicione algum nome, espaço vazio!");
        }
        if(nomeCompleto.isEmpty()){
            throw new nomeInvalidoException("Nome esta vazio");
        }
        if(nomeCompleto.matches("\\d{0,9}")){
            throw new nomeInvalidoException();
        }

        
        this.nomeCompleto = nomeCompleto.toUpperCase();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws cpfInvalidoException {
        if(!cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")){
            throw new cpfInvalidoException();
        }
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento)  {
         
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {

    
        this.salario = salario;
    }

 
    public String getNome(){

        String[] nomeDividido = getNomeCompleto().split("\\s"); 

        if(nomeComposto==false){
            
        String nomeSimples = nomeDividido[0];

        return nomeSimples;

        }else{

        String nomeComposto= nomeDividido[0] +" "+ nomeDividido[1];

        return nomeComposto;

        }

    }

    public String getSobrenome(){

        String[] nomeDividido = getNomeCompleto().split("\\s"); 
        
        String ultimosobreNome = nomeDividido[nomeDividido.length-1];
        
        return ultimosobreNome;
        
    }

    public int getDiaNacsimento(){
        return 0 ;
    }

    public int getMesNascimento(){

        return 0;

    }

    public int getAnoNascimento(){
        return 0;
    }
    
    public int getIdade(){

        return 0;
    }
    @Override
    public String toString() {
        return "CPF.: " + cpf +  "\nPrimeiro nome " + getNome() + "\nUltimo nome "+getSobrenome() +" \nDataNascimento.: " + dataNascimento + "\nNomeCompleto.: " + nomeCompleto
                 + "\nSalario=" + salario ;
    }

    


    
}
