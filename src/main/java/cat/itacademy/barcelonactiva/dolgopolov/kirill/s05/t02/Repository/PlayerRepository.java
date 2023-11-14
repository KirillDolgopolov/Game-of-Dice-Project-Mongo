package cat.itacademy.barcelonactiva.dolgopolov.kirill.s05.t02.Repository;

import cat.itacademy.barcelonactiva.dolgopolov.kirill.s05.t02.Model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
    Player findByName(String name);


}
