package game.GameAPI.api;

import game.GameAPI.model.Game;
import game.GameAPI.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @PostMapping("/addGame")
    public String saveGame(@RequestBody  Game game) {
        gameRepository.save(game);
        return "Created => " + game;
    }

    @GetMapping("/findAllGames")
    public List<Game> getGames() {
        return gameRepository.findAll();
    }

    @GetMapping("/findAllGames/{id}")
    public Optional<Game> getGameById(int id) {
        return gameRepository.findById(id);
    }

    @RequestMapping(value="/Games/{name}", method = RequestMethod.GET)
    public List<Game> getGameByName(@PathVariable("name") String name) {
        System.out.println("Name: " + name);
        return gameRepository.getGameByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteGame(@PathVariable int id) {
        gameRepository.deleteById(id);
        return "Game deleted with id: " + id;
    }
}
