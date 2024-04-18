package Models;


/**
 * Classe abstrata que representa um veículo genérico
 */
public abstract class Veiculo {

    protected String marca;

    protected String modelo;

    protected int ano;

    /**
     * Construtor para iniciar os atributos
     *
     * @param marca A marca do veiculo
     * @param modelo o modelo do veiculo
     * @param ano o ano de fabricação do veículo.
     */

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    /**
     * método abstrato para exibir informações do veículo.
     */

    public abstract void display();

    /**
     * construtor para inicializar
     */

}

