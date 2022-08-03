public class Carro{
    private String nome;
    private String marca;
    private String cor;
    private double preco;
    private int numSerie;

    public Carro(){

    }

    public Carro(String nome, String marca, String cor, double preco, int numSerie){
        this.setNome(nome);
        this.setMarca(marca);
        this.setCor(cor);
        this.mudarPreco(preco);
        this.setNumSerie(numSerie);
    }

    public String getNome() {
        return nome;
    }

    public void mudarPreco(double preco){
        this.setPreco(preco);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumSerie(){
        return this.numSerie;
    }

    public void setNumSerie(int numSerie){
        this.numSerie = numSerie;
    }

    @Override
    public String toString(){
        return "Nome do Carro: " + this.getNome() 
        + "\nMarca : " + this.getMarca() 
        + "\nCor: " + this.getCor() 
        + "\nNumero de Serie: " + this.getNumSerie() 
        + String.format("\nPreço: %.3f", this.getPreco());
    }
}