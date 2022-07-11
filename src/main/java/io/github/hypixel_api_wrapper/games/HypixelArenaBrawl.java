package io.github.hypixel_api_wrapper.games;

public class HypixelArenaBrawl implements HypixelGame {
    @Override
    public String getGameID() {
        return "ARENA";
    }

    @Override
    public String getGameName() {
        return "Arena Brawl";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}