package game.GameAPI.repository;

import game.GameAPI.model.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game, Integer> {
}
