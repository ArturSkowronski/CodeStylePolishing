package adventuregame;

import adventuregame.console.ConsoleGameRenderer;
import adventuregame.structure.GameRenderer;
import adventuregame.structure.MainGameEngine;

/**
 * Created by arturskowronski on 14/04/15.
 */
public class MainGameEngineImpl implements MainGameEngine {

    GameRenderer gameRenderer = new ConsoleGameRenderer();

    @Override
    public void start() {

    }
}
