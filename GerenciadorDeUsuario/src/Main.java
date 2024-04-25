import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();
        {
            int escolha;
            do {
                System.out.println("Menu");
                System.out.println("1-Adicionar Usuarios");
                System.out.println("2-Listar Usuario");
                System.out.println("3-Buscar Usuario por id");
                System.out.println("4-Atualizar Usuario");
                System.out.println("5-Remover Usuario");
                System.out.println("0-Sair");
            }
            switch (escolha){

                case 1:
                    System.out.println("Digite o id do usuario");
                    String id = scanner.nextLine();
                    System.out.println("digite o nome do usuario");
                    String nome = scanner.nextLine();
                    System.out.println("digite o email do usuario");
                    String email = scanner.nextLine();
                    gerenciadorUsuario.adicionarUsuario(new Usuario(id,nome,email));
                    System.out.println("Usuario adicionado com sucesso!");
                    break;
            }







        }
    }
}