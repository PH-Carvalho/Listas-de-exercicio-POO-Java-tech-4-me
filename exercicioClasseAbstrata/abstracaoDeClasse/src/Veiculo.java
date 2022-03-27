public abstract class Veiculo {
    public String tipoCombustivel;
    public int numeroPassageiro;
    public float velocidadeMaxima;

    public void setTipoCombustivel(String tipoCombustivel){

        this.tipoCombustivel=tipoCombustivel;
    }

    public String getTipoCombustivel(){
        return tipoCombustivel;
    }

    public void setNumeroPassageiro(int numeroPassageiro){
        this.numeroPassageiro=numeroPassageiro;
    }

    public int getNumeroPassageiro(){
        return numeroPassageiro;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima){
        this.velocidadeMaxima=velocidadeMaxima;
    }

    public float getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public  abstract void transportar();
    
}
