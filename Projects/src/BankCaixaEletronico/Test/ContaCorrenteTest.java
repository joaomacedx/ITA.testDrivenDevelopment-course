package BankCaixaEletronico.Test;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;

import BankCaixaEletronico.Implementations.ContaCorrente;

public class ContaCorrenteTest {

    @Test
    public void new_com_sucesso_QUANDO_argumentos_passados_sao_validos_ENTAO_a_conta_experada_deve_serCriada() {
       //Arrange
       UUID idDaContaExperada = UUID.randomUUID();
       ContaCorrente contaExperada = new ContaCorrente(idDaContaExperada,"12345", 200.01, "096755437");

       //Act 
       ContaCorrente contaAtual = new ContaCorrente(contaExperada.id, "12345", 200.01, "096755437");

      //Assert
      assertEquals(contaAtual.id, contaExperada.id);
    }  
}
