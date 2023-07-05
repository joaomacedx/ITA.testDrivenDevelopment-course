package BankCaixaEletronico.Test;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;

import BankCaixaEletronico.Implementations.ContaCorrente;

public class ContaCorrenteTest {

    @Test
    public void new_com_sucesso_QUANDO_argumentos_passados_sao_validos_ENTAO_a_conta_experada_deve_serCriada() {
       //Arrange
       UUID idDaContaEsperada = UUID.randomUUID();
       ContaCorrente contaEsperada = new ContaCorrente(idDaContaEsperada,"12345", 200.01, "096755437");

       //Act 
       ContaCorrente contaAtual = new ContaCorrente(contaEsperada.id, "12345", 200.01, "096755437");

      //Assert
      assertEquals(contaAtual.id, contaEsperada.id);
    }  
}
