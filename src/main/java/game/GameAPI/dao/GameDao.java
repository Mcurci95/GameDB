package game.GameAPI.dao;

import game.GameAPI.model.Game;

import java.util.List;
import java.util.UUID;

public interface GameDao {

    int insertGame(UUID id, Game game);

    default int insetGame(Game game) {
        UUID id = UUID.randomUUID();
        return insertGame(id, game);
    }

    List<Game> selectAllGames();
}
