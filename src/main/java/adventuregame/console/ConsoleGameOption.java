package adventuregame.console;

import adventuregame.structure.GameOption;

/**
 * Created by arturskowronski on 14/04/15.
 */
public class ConsoleGameOption implements GameOption {

    private final String description;
    private final int destination;

    private ConsoleGameOption(String description, int destination){

        this.description = description;
        this.destination = destination;
    }

    @Override
    public int selectOption() {
        return destination;
    }

    public String getDescription() {
        return description;
    }


}
