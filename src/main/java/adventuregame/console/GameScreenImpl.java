package adventuregame.console;

import adventuregame.structure.GameOption;
import adventuregame.structure.GameScreen;

import java.util.List;

/**
 * Created by arturskowronski on 14/04/15.
 */
public class GameScreenImpl implements GameScreen {

    private final String description;
    private final List<GameOption> gameOption;

    public GameScreenImpl(String description, List<GameOption> gameOption) {
        this.description = description;
        this.gameOption = gameOption;
    }

    @Override
    public int selectOption(int option) {
        return 0;
    }

}
