package BankCaixaEletronico.Implementations;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {
    private List<ContaCorrente> contaCorrenteRepository;
    public CaixaEletronico() {
        this.contaCorrenteRepository = new ArrayList<ContaCorrente>();
    }
    public String logar(String cpf) {
        for (ContaCorrente contaCorrente : this.contaCorrenteRepository) {
            if(contaCorrente.cpfTitular == cpf) {
                return "Usuario autenticado";
            }
            else {
                return "Nao foi possivel autenticar usuario";
            }
        }
        return "Nao foi possivel autenticar usuario";
    }

    public String sacar(Double valorParaSaque, String numeroConta) {
        for (ContaCorrente contaParaSaque : this.contaCorrenteRepository) {
            if(contaParaSaque.numero == numeroConta) {
                if(contaParaSaque.saldo < valorParaSaque) {
                    return "Saldo insuficiente";
                }
                else {
                    int index = this.contaCorrenteRepository.indexOf(contaParaSaque);
                    contaParaSaque.saldo = contaParaSaque.saldo - valorParaSaque;
                    this.contaCorrenteRepository.set(index, contaParaSaque);
                    return "Retire seu dinheiro";
                }
            }
        }
        return "Saldo insuficiente";
    }

    public String depositar() {
        return null;
    }

    public String saldo() {
        return null;
    }
}
