package GamificationComponent.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import GamificationComponent.Enum.PointType;
import GamificationComponent.Implementation.Armazenamento;
import GamificationComponent.Implementation.Point;
import GamificationComponent.Implementation.User;

public class ArmazenamentoTest {
    @Test
    public void salvarPontuacaoDoUsuario_suceedes_WHEN_the_user_is_valid_and_not_saved_in_the_repository_THEN_save_and_the_expected_repository_is_be_equals_actual() {
        //Arrange
        Dictionary<UUID, User> userRepository = new Hashtable<UUID,User>();
                String name = "Macedo";
        User actualUser = new User(name);
        Point validPoint = new Point(PointType.ESTRELA, 40);     
        actualUser.applyPoint(validPoint);
        Armazenamento actualArmazenamento = new Armazenamento(userRepository);
        userRepository.put(actualUser.id, actualUser);
        Armazenamento expectedArmazenamento = new Armazenamento(userRepository);

        //Act
        actualArmazenamento.salvarPontuacaoDoUsuario(actualUser);

        //Assert
        assertSame(actualArmazenamento.userRepository,expectedArmazenamento.userRepository);
    }
}
