package Models;

public class Carro2 extends Veiculo{

    private int numeroDePortas;

    /**
     * Construtor para iniciar os atributos
     *
     * @param marca  A marca do veiculo
     * @param modelo o modelo do veiculo
     * @param ano    o ano de fabricação do veículo.
     */
    public Carro2(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void display(){
        System.out.println("marca: " +marca+ "\nmodelo: " + modelo + "\nano de fabricação: " + ano+ "\nnumero de portas: " +numeroDePortas);
    }
}
