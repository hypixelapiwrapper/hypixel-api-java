package io.github.hypixel_api_wrapper.wrapper.games.crazy_walls;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelCrazyWalls extends HypixelGame {

    protected HypixelCrazyWalls(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "TRUE_COMBAT";
    }

    @Override
    public String getGameName() {
        return "TrueCombat";
    }

    @Override
    public boolean isRemoved() {
        return true;
    }
}
