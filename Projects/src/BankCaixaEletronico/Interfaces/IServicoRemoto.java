package BankCaixaEletronico.Interfaces;

import BankCaixaEletronico.Implementations.ContaCorrente;

public interface IServicoRemoto {
    public ContaCorrente recuperarConta(String numeroDaConta);

    public void persistirConta(ContaCorrente contaParaPersistir);
}
