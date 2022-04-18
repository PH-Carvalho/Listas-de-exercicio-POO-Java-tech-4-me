package execao;
public class nomeInvalidoException extends Exception{
    
    public nomeInvalidoException(){
        super("Nome Invalido!");
    }

    public nomeInvalidoException(String mensagem){

        super(mensagem);
    }
}
