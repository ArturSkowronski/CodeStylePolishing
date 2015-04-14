package adventuregame.console;

import adventuregame.structure.GameStructure;
import adventuregame.structure.SourceParser;

/**
 * Created by arturskowronski on 14/04/15.
 */
public class JSONSourceParser implements SourceParser {
    @Override
    public GameStructure createGameStructure() {
        return new GameStructureImpl();
    }
}
