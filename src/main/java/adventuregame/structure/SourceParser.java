package adventuregame.structure;

import java.util.Map;

/**
 * Created by arturskowronski on 14/04/15.
 */
public interface SourceParser {
    public Map<Integer, GameScreen> parseForGameScreens();
    public GameScreen getBeginning();
}
