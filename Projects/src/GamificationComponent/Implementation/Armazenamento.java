package GamificationComponent.Implementation;

import java.util.Dictionary;
import java.util.UUID;

import GamificationComponent.Interfaces.IArmazenamento;

public class Armazenamento implements IArmazenamento{

    public Dictionary<UUID,User> userRepository;

    public Armazenamento(Dictionary<UUID,User> userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void salvarPontuacaoDoUsuario(User usuarioParaSalvarPontos) {
        this.userRepository.put(usuarioParaSalvarPontos.id, usuarioParaSalvarPontos);
    }

    @Override
    public int recuperarPontuacaoDoUsuario(User usuarioParaRecuperarPontuacao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuperarPontuacaoDoUsuario'");
    }

    @Override
    public User[] recuperarUsuariosComPontuacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuperarUsuariosComPontuacao'");
    }

    @Override
    public String[] recuperarTiposDePontuacaoCadastradas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuperarTiposDePontuacaoCadastradas'");
    }
}
