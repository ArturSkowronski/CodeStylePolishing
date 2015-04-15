package adventuregame.console;

import adventuregame.structure.GameScreen;
import adventuregame.structure.SourceParser;
import java.util.Map;

/**
 * Created by arturskowronski on 14/04/15.
 */
public class JSONSourceParser implements SourceParser {

    @Override
    public Map<Integer,GameScreen> parseForGameScreens() {
        return null;
    }

    @Override
    public GameScreen getBeginning() {
        return null;
    }
}
