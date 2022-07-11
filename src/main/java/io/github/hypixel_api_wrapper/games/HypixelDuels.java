package io.github.hypixel_api_wrapper.games;

public class HypixelDuels implements HypixelGame {
    @Override
    public String getGameID() {
        return "DUELS";
    }

    @Override
    public String getGameName() {
        return "Duels";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}