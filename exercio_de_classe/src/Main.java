import Models.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa eu = new Pessoa("carlos",19,1.81);
        Pessoa fulano = new Pessoa();
        fulano.setNome("fulano");
        System.out.println(fulano.getNome());
        eu.falar();


    }

}
