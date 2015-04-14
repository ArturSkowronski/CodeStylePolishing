package adventuregame.console;

import adventuregame.structure.GameOption;
import adventuregame.structure.GameScreen;
import adventuregame.structure.GameStructure;

import java.util.HashMap;
import java.util.List;

/**
 * Created by arturskowronski on 14/04/15.
 */
public class GameStructureImpl implements GameStructure {
    private final HashMap<Integer, GameScreen> gameWorld;

    public GameStructureImpl(HashMap<Integer, GameScreen> gameWorld) {
        this.gameWorld = gameWorld;
    }

    public class Builder {
        HashMap<Integer, GameScreen> gameWorld = new HashMap<>();

        public void addScreen(int position, String description, List<GameOption> gameOptions){
            gameWorld.put(position, new GameScreenImpl(description, gameOptions));
        }

        public GameStructure build(){
            return new GameStructureImpl(gameWorld);
        }
    }
}
