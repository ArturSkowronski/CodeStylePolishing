package adventuregame.structure;

import java.util.List;

/**
 * Created by arturskowronski on 14/04/15.
 */
public interface GameScreen {
    int selectOption(int option);
    List<GameOption> getOptions();
    String getDescription();
}
