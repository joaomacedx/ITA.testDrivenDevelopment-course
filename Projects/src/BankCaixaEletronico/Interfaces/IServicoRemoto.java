package BankCaixaEletronico.Interfaces;

import BankCaixaEletronico.Implementations.ContaCorrente;

public interface IServicoRemoto {
    public ContaCorrente recuperarConta(String numeroDaConta);

    public ContaCorrente persistirConta(ContaCorrente contaParaPersistir);
}
