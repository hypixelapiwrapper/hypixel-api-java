package io.github.hypixel_api_wrapper;

import io.github.hypixel_api_wrapper.http.cache.CachingStrategy;
import io.github.hypixel_api_wrapper.http.cache.NoCachingStrategy;
import io.github.hypixel_api_wrapper.http.RequestFactory;
import io.github.hypixel_api_wrapper.wrapper.guild.HypixelGuild;
import io.github.hypixel_api_wrapper.wrapper.player.HypixelPlayer;
import java.io.IOException;
import java.util.UUID;

public class HypixelAPI {

    private RequestFactory requestFactory;

    private HypixelAPI(UUID key, CachingStrategy cachingStrategy) {
        requestFactory = new RequestFactory(key);
        requestFactory.start(cachingStrategy);
    }

    /**
     * Creates a new instance of the HypixelAPI object with caching disabled.
     *
     * @param key the api key to use for authentication
     * @return the newly created instance
     */
    public static HypixelAPI create(UUID key) {
        return create(key, new NoCachingStrategy());
    }

    /**
     * Creates a new instance of the HypixelAPI object
     *
     * @param key             the api key to use for authentication
     * @param cachingStrategy the caching strategy to use. If null is passed the NoCachingStrategy
     *                        will be used to disable caching
     * @return the newly created instance
     */
    public static HypixelAPI create(UUID key, CachingStrategy cachingStrategy) {
        return new HypixelAPI(key, cachingStrategy);
    }

    public void shutdown() throws IOException {
        requestFactory.close();
    }

    public HypixelPlayer getPlayerByName(String username) {
        return new HypixelPlayer(username, requestFactory);
    }

    public HypixelGuild getGuildByName(String name) {
        return new HypixelGuild(name, requestFactory);
    }
}