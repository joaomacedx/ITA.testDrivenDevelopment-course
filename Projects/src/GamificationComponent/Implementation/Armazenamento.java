package GamificationComponent.Implementation;

import java.util.Dictionary;
import java.util.UUID;

public class Armazenamento {

    private Dictionary<UUID,User> userRepository;

    public Armazenamento(Dictionary<UUID,User> userRepository) {
        this.userRepository = userRepository;
    }
}
