package BankCaixaEletronico.Mocks;

import BankCaixaEletronico.Implementations.ContaCorrente;
import BankCaixaEletronico.Interfaces.IServicoRemoto;

public class MockServicoRemoto implements IServicoRemoto {

    public MockServicoRemoto() {

    }

    @Override
    public ContaCorrente persistirConta(ContaCorrente contaParaPersistir) {
        return contaParaPersistir;
    }

    @Override
    public ContaCorrente recuperarConta(String numeroDaConta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuperarConta'");
    }
    
}
