package execao;

public class cpfInvalidoException extends Exception{
    
    public cpfInvalidoException(){
        super("CPF invalido.");
    }
    public cpfInvalidoException(String mensagemErro){
        super(mensagemErro);
    }
}


