import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuario {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> obterTodosUsuarios() {
        return usuarios;
    }

    public Usuario obterUsuarioPorId(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    public void atualizarUsuario(String id, String novoNome, String novoEmail) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                usuario.setNome(novoNome);
                usuario.setEmail(novoEmail);
                return;
            }
        }
    }

    public void removerUsuario(String id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
    }
}
