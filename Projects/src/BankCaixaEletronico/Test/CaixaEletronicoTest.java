package BankCaixaEletronico.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import BankCaixaEletronico.Implementations.CaixaEletronico;
import BankCaixaEletronico.Mocks.MockHardware;
import BankCaixaEletronico.Mocks.MockServicoRemoto;

public class CaixaEletronicoTest {
    private CaixaEletronico caixaEletronico;

    @Before
    public void SetUp() {
        MockServicoRemoto servicoRemoto = new MockServicoRemoto();
        MockHardware hardware = new MockHardware();
        this.caixaEletronico = new CaixaEletronico(servicoRemoto, hardware);

    }

    @Test
    public void logar_QUANDO_o_usuario_nao_informar_dados_validos_ENTAO_retornar_mensagem_de_atencao() {

        //Arrange
        String stringEsperada = "Nao foi possivel autenticar usuario";
        //Act
        String stringAtual = caixaEletronico.logar("");

        //Assert
        assertEquals(stringAtual, stringEsperada);
    }

    @Test
    public void sacar_QUANDO_o_usuario_nao_possui_saldo_suficiente_ENTAO_retornar_mensagem_de_atencao() {

        //Arrange
        String stringEsperada = "Saldo insuficiente";
        String numeroDaConta = "12345";
        Double valor = 124.01;
        
        //Act
        String stringAtual = caixaEletronico.sacar(valor, numeroDaConta);

        //Assert
        assertEquals(stringAtual, stringEsperada);
    }

    @Test
    public void depositar_QUANDO_o_usuario_nao_informar_dados_validos_ENTAO_retornar_null() {

        //Arrange
        String stringEsperada = null;
        String numeroConta = "334556";
        Double valorDoDeposito = 22.09;
        //Act
        String stringAtual = caixaEletronico.depositar(numeroConta, valorDoDeposito);

        //Assert
        assertEquals(stringAtual, stringEsperada);
    }
    @Test
    public void saldo_QUANDO_o_usuario_nao_informar_dados_validos_ENTAO_retornar_null() {

        //Arrange
        String stringEsperada = null;
        String conta = "1234";
         
        //Act
        String stringAtual = caixaEletronico.saldo(conta);

        //Assert
        assertEquals(stringAtual, stringEsperada);
    }
}
