package adventuregame;

import adventuregame.console.ConsoleGameUI;
import adventuregame.console.ConsoleGame.CreateGame;
import adventuregame.console.JSONSourceParser;
import adventuregame.structure.GameUI;
import adventuregame.structure.GameStructure;
import adventuregame.structure.MainGameEngine;
import adventuregame.structure.SourceParser;

/**
 * Created by arturskowronski on 14/04/15.
 */
public class MainGameEngineImpl implements MainGameEngine {

    GameUI gameRenderer;
    SourceParser sourceParser = new JSONSourceParser();
    GameStructure game;

    @Override
    public void start() {
        game = new CreateGame().withSource(sourceParser).build();
        gameRenderer = new ConsoleGameUI(game);
    }
}
