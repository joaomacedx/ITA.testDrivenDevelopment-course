package BankCaixaEletronico.Test;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

import BankCaixaEletronico.Implementations.CaixaEletronico;
import BankCaixaEletronico.Implementations.ContaCorrente;
import BankCaixaEletronico.Mocks.MockServicoRemoto;

public class CaixaEletronicoTest {
    private CaixaEletronico caixaEletronico;

    @Before
    public void SetUp(){
        this.caixaEletronico = new CaixaEletronico();
    }

    @Test
    public void logar_QUANDO_o_usuario_nao_informar_dados_validos_ENTAO_retornar_null() {

        //Arrange
        String stringEsperada = null;
        
        //Act
        String stringAtual = caixaEletronico.logar();

        //Assert
        assertEquals(stringAtual, stringEsperada);
    }

    @Test
    public void sacar_QUANDO_o_usuario_nao_informar_dados_validos_ENTAO_retornar_null() {

        //Arrange
        String stringEsperada = null;
        
        //Act
        String stringAtual = caixaEletronico.logar();

        //Assert
        assertEquals(stringAtual, stringEsperada);
    }

    @Test
    public void depositar_QUANDO_o_usuario_nao_informar_dados_validos_ENTAO_retornar_null() {

        //Arrange
        String stringEsperada = null;
        
        //Act
        String stringAtual = caixaEletronico.logar();

        //Assert
        assertEquals(stringAtual, stringEsperada);
    }
    @Test
    public void saldo_QUANDO_o_usuario_nao_informar_dados_validos_ENTAO_retornar_null() {

        //Arrange
        String stringEsperada = null;
        
        //Act
        String stringAtual = caixaEletronico.logar();

        //Assert
        assertEquals(stringAtual, stringEsperada);
    }

    @Test
    public void persistirConta_QUANDO_o_saldo_alterado_ENTAO_retornar_a_conta_com_o_saldo_atualizado() {

        //Arrange
        ContaCorrente contaEsperada = new ContaCorrente(UUID.randomUUID(),"9876", 2022.1, "987654312");
        MockServicoRemoto servicoRemoto = new MockServicoRemoto();
        //Act
        ContaCorrente contaAtual = servicoRemoto.persistirConta(contaEsperada);

        //Assert
        assertEquals(contaAtual, contaEsperada);
    }
}
