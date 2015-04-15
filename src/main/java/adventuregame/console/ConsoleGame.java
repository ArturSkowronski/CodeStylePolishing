package adventuregame.console;

import adventuregame.structure.GameScreen;
import adventuregame.structure.GameStructure;
import adventuregame.structure.SourceParser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by arturskowronski on 14/04/15.
 */
public class ConsoleGame implements GameStructure {

    private final Map<Integer, GameScreen> gameWorld;
    private GameScreen currentScreen;

    private ConsoleGame(Map<Integer, GameScreen> gameWorld, GameScreen gameBeginning) {
        this.gameWorld = gameWorld;
        this.currentScreen = gameBeginning;
    }

    @Override
    public GameScreen getCurrentScreen() {
        return currentScreen;
    }

    @Override
    public void selectOption(int option){
        int transition = currentScreen.selectOption(option);
        currentScreen = gameWorld.get(transition);
    }

    public static class CreateGame {
        Map<Integer, GameScreen> gameWorld = new HashMap<>();
        GameScreen beginningGameScreen;

        public CreateGame withSource(SourceParser sourceParser){
            gameWorld.putAll(sourceParser.parseForGameScreens());
            beginningGameScreen = sourceParser.getBeginning();
            return this;
        }

        public GameStructure build(){
            return new ConsoleGame(gameWorld, beginningGameScreen);
        }
    }
}
