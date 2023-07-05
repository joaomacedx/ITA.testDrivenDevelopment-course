package BankCaixaEletronico.Implementations;

import java.util.ArrayList;
import java.util.List;

import BankCaixaEletronico.Interfaces.IHardware;
import BankCaixaEletronico.Interfaces.IServicoRemoto;

public class CaixaEletronico {
    private List<ContaCorrente> contaCorrenteRepository;
    private IServicoRemoto servicoRemoto;
    private IHardware hardware;
    public CaixaEletronico(IServicoRemoto servicoRemoto, IHardware hardware) {
        this.contaCorrenteRepository = new ArrayList<ContaCorrente>();
        this.servicoRemoto = servicoRemoto;
        this.hardware = hardware;
    }
    public String logar(String cpf) {
        for (ContaCorrente contaCorrente : this.contaCorrenteRepository) {
            if(contaCorrente.cpfTitular == cpf) {
                this.hardware.pegarNumeroDaContaDoCartao(contaCorrente.numero);
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
                    this.servicoRemoto.persistirConta(contaParaSaque);
                    this.hardware.entregarDinheiro();
                    return "Retire seu dinheiro";
                }
            }
        }
        return "Saldo insuficiente";
    }

    public String depositar(String numeroConta, Double valorParaDeposito) {
        for(ContaCorrente contaParaDepositar : this.contaCorrenteRepository) {
            if(contaParaDepositar.numero == numeroConta) {
                this.hardware.lerEnvelope(valorParaDeposito);
                contaParaDepositar.saldo = contaParaDepositar.saldo + valorParaDeposito;
                int index = this.contaCorrenteRepository.indexOf(contaParaDepositar);
                this.contaCorrenteRepository.set(index, contaParaDepositar);
                this.servicoRemoto.persistirConta(contaParaDepositar);
                return "Deposito recebido com sucesso";
            }
        }
        return null;
    }

    public String saldo(String numeroConta) {
        for(ContaCorrente conta : this.contaCorrenteRepository) {
            if(conta.numero == numeroConta) {
                return  "O saldo e R$" + conta.saldo;
            }
        }
        return null;
    }
}
