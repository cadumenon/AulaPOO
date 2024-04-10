package Models;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(){

    }

    public Pessoa(String nome,int idade, double altura){

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void serAltura(double altura){
        this.altura = altura;
    }

    public void falar(){
        System.out.println("Olá, meu nome é: " + nome +
                " e eu tenho: "+idade+ " anos de idade.");
    }




}
