package BankCaixaEletronico.Mocks;

import BankCaixaEletronico.Interfaces.IHardware;

public class MockHardware implements IHardware {

    public String pegarNumeroDaContaDoCartao(String numeroConta) {
        return numeroConta;
    }

    public void entregarDinheiro() {
        String dinheiroEntregue = "ok";
    }

    public void lerEnvelope(Double valorParaDeposito) {
       Double valor = valorParaDeposito;
    }
    
} 
