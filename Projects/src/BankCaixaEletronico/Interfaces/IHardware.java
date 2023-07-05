package BankCaixaEletronico.Interfaces;

public interface IHardware {

    public String pegarNumeroDaContaDoCartao(String numero);

    public void entregarDinheiro();

    public void lerEnvelope(Double valorParaDeposito);
}
