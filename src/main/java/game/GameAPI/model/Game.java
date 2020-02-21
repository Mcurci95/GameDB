package game.GameAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Document(collection = "Game")
public class Game {

    @Id
    private  int id;
    private  String name;
    private  String publisher;
    private  String console;

    public Game(int id, String name, String publisher, String console) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.console = console;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getConsole() {
        return console;
    }
}
