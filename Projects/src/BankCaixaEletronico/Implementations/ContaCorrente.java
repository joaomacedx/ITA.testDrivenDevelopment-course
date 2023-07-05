package BankCaixaEletronico.Implementations;

import java.util.UUID;

public class ContaCorrente {
    public UUID id;
    public String numero;
    public Double saldo;
    public String cpfTitular;

    public ContaCorrente(UUID id, String numero, Double saldo, String cpfTitular) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo; 
        this.cpfTitular = cpfTitular;
    }
}
