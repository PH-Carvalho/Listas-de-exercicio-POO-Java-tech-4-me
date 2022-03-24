import java.util.Scanner;

public class Steam extends usuario{
    private String nomeJogo;
    private boolean tipoJogo;
    private int qtdJogos;
    private String[] lista;
    
    Scanner teclado=new Scanner(System.in);

    public Steam(String nomeJogo, boolean tipoJogo, int qtdJogos, int[] lista) {
        this.setNomeJogo(nomeJogo);
        this.setTipoJogo(tipoJogo);
        this.setQtdJogos(qtdJogos);
    }
    public Steam(){

    }
    public boolean isTipoJogo() {
        return tipoJogo;
    }
    public void setTipoJogo(boolean tipoJogo) {
        this.tipoJogo = tipoJogo;
    }
    public String getNomeJogo() {
        return nomeJogo;
    }
    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }
    public int getQtdJogos() {
        return qtdJogos;
    }
    public void setQtdJogos(int qtdJogos) {
        this.qtdJogos = qtdJogos;
    }

    public void listarJogos(){
        System.out.println(this.getNome());
    }
    public void cadastrar(){
        System.out.println("Qual o nome do jogo?");
        setNomeJogo(teclado.nextLine());

        lista[1]=this.nomeJogo;

}
