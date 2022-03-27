public class App {
    public static void main(String[] args) throws Exception {
       
        Aviao aviao =new Aviao();
        Navio navio =new Navio();


        aviao.setTipoCombustivel("gasolina");
        aviao.setVelocidadeMaxima(400);
        aviao.setNumeroPassageiro(50);

        navio.setNumeroPassageiro(45);
        navio.setVelocidadeMaxima(80);
        navio.setTipoCombustivel("Alcool");



        System.out.println( aviao.getNumeroPassageiro() + "\n" + aviao.getVelocidadeMaxima() +"\n" + aviao.getTipoCombustivel() );
        aviao.transportar();
        
        System.out.println( navio.getNumeroPassageiro() + "\n" + navio.getVelocidadeMaxima() + "\n" +navio.getTipoCombustivel() );
        navio.transportar();
        
    }
}
