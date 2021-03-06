package io.github.hypixel_api_wrapper.wrapper.player;

import io.github.hypixel_api_wrapper.http.RequestFactory;
import java.time.Instant;

/**
 * This class is used to link two {@link HypixelPlayer}'s as friends on the Hypixel network.
 *
 * @author sam & insert
 */
public class HypixelFriend {

    //TODO This field will help the #getDateAdded() method retrieve information about
    // when the player and the friend added each other as friends. 
    private final HypixelPlayer player;
    private final HypixelPlayer friend;
    private final RequestFactory requestFactory;

    public HypixelFriend(HypixelPlayer player, HypixelPlayer friend,
        RequestFactory requestFactory) {
        this.player = player;
        this.friend = friend;
        this.requestFactory = requestFactory;
    }

    public HypixelPlayer asPlayer() {
        return friend;
    }

    /**
     * @return The date the {@player} added the {@friend} as a friend on the network.
     */
    public Instant getDateAdded() {
        throw new UnsupportedOperationException();
    }
}
