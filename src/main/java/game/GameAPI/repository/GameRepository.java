package game.GameAPI.repository;

import com.mongodb.Mongo;
import game.GameAPI.model.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GameRepository extends MongoRepository<Game, Integer> {

    @Query(value="{ 'name' : ?0 }")
    List<Game> getGameByName(String name) ;
}
