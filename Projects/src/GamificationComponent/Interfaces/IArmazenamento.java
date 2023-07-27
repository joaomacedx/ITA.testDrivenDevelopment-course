package GamificationComponent.Interfaces;

import GamificationComponent.Implementation.User;

public interface IArmazenamento {
    public void salvarPontuacaoDoUsuario(User usuarioParaSalvarPontos);
    public int recuperarPontuacaoDoUsuario(User usuarioParaRecuperarPontuacao);
    public User[] recuperarUsuariosComPontuacao();
    public String[] recuperarTiposDePontuacaoCadastradas();
}
