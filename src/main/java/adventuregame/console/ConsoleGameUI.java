package adventuregame.console;

import adventuregame.structure.GameOption;
import adventuregame.structure.GameScreen;
import adventuregame.structure.GameStructure;
import adventuregame.structure.GameUI;

import java.util.List;

/**
 * Created by arturskowronski on 14/04/15.
 */
public class ConsoleGameUI implements GameUI {

    private final GameStructure game;

    public ConsoleGameUI(GameStructure gameStructure){
        this.game = gameStructure;
        draw();
    }

    private void selectOption(){
        game.selectOption(0);
        draw();
    }

    private void draw() {
        GameScreen currentScreen = game.getCurrentScreen();
        String description = currentScreen.getDescription();
        List<GameOption> options = currentScreen.getOptions();
    }

}
