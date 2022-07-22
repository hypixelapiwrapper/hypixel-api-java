package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

/**
 * Retrieves data about a particular BedWars mode.
 * Use a {@link HypixelBedWarsMode} to specify the mode.
 */
public class HypixelBedWars {

    private final String statsPrefix;
    private final JSONObject stats;
    private final HypixelBedWarsMode mode;

    protected HypixelBedWars(JSONObject stats, HypixelBedWarsMode mode) {
        this.stats = stats;
        this.mode = mode;
        this.statsPrefix = mode.getStatsPrefix();
    }

    /**
     * @return The amount of resources the player has collected.
     */
    public int getResourcesCollected() {
        return stats.getInt(stats + "resources_collected_bedwars");
    }

    /**
     * @return The amount of diamonds the player has collected.
     */
    public int getDiamondsCollected() {
        return stats.getInt(stats + "diamond_resources_collected_bedwars");
    }

    /**
     * @return The amount of emeralds the player has collected.
     */
    public int getEmeraldsCollected() {
        return stats.getInt(stats + "emerald_resources_collected_bedwars");
    }

    /**
     * @return The amount of gold the player has collected.
     */
    public int getGoldCollected() {
        return stats.getInt(stats + "gold_resources_collected_bedwars");
    }

    /**
     * @return The amount of iron the player has collected.
     */
    public int getIronCollected() {
        return stats.getInt(stats + "iron_resources_collected_bedwars");
    }

    public int getKills(BedWarsKillCause cause) {
        return stats.getInt(statsPrefix + cause.getKey() + "kills_bedwars");
    }

    public int getDeaths(BedWarsKillCause cause) {
        return stats.getInt(statsPrefix + cause.getKey() + "deaths_bedwars");
    }

    public double getKillToDeathRatio(BedWarsKillCause cause) {
        return getKills(cause) / Math.max(getDeaths(cause), 1);
    }

    public int getFinalKills(BedWarsKillCause cause) {
        return stats.getInt(statsPrefix + cause.getKey() + "final_kills_bedwars");
    }

    public int getFinalDeaths(BedWarsKillCause cause) {
        return stats.getInt(statsPrefix + cause.getKey() + "final_deaths_bedwars");
    }

    public double getFinalKillToDeathRatio(BedWarsKillCause cause) {
        return getFinalKills(cause) / Math.max(getFinalDeaths(cause), 1);
    }

    /**
     * @return The amount of wins the player has.
     */
    public int getWins() {
        return stats.getInt(statsPrefix + "wins_bedwars");
    }

    /**
     * @return The amount of losses the player has.
     */
    public int getLosses() {
        return stats.getInt(statsPrefix + "losses_bedwars");
    }

    /**
     * @return The player's win to loss ratio.
     */
    public double getWinToLossRatio() {
        return getWins() / Math.max(getLosses(), 1);
    }

    /**
     * @return The amount of beds the player has broken.
     */
    public int getBedsBroken() {
        return stats.getInt(statsPrefix + "beds_broken_bedwars");
    }

    /**
     * @return The amount of items the player has purchased from the shop.
     */

    public int getItemsPurchasedAmount() {
        return stats.getInt(statsPrefix + "items_purchased_bedwars");
    }

    /**
     * @return The amount of games the player has played.
     */
    public int getGamesPlayed() {
        return stats.getInt(statsPrefix + "games_played_bedwars");
    }

    /**
     * @return The player's current winstreak.
     */
    public int getCurrentWinstreak() {
        return stats.getInt(stats + "winstreak");
    }

    /**
     * @return The {@link HypixelBedWarsMode} that the statsPrefix
     * is using. 
     */
    public HypixelBedWarsMode getMode() {
        return mode;
    }
}
