package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

/**
 * Different types of kills / deaths that are tracked in BedWars.
 */
public enum BedWarsKillCause {

    /**
     * Normal kill causes.
     */

    // Kill caused from a projectile.
    PROJECTILE("projectile_"),

    // Kill caused from falling a distance more than 3 blocks.
    FALL("fall_"),

    // Kill caused from falling into the void.
    VOID("void_"),

    // Kill caused from an entity attack.
    ENTITY_ATTACK("entity_attack_"),

    // Kill caused from all kill causes combined.
    OVERALL(""),


    /**
     * Other types of kill causes.
     */

    // Kill caused from being in the area where a block explodes.
    BLOCK_EXPLOSION("block_explosion_"),

    // Kill caused when an entity comes in contact with a block such as a Cactus.
    CONTACT("contact_"),

    // Custom kill.
    CUSTOM("custom_"),

    // Kill caused from running out of air while being in water.
    DROWNING("drowning_"),

    // Kill caused while being in the area where an entity explodes, such as a Creeper.
    ENTITY_EXPLOSION("entity_explosion_"),

    // Kill caused from being hit by a falling block that deals damage.
    FALLING_BLOCK("falling_block_"),

    // Kill caused from direct exposure to fire.
    FIRE("fire_"),

    // Kill caused due to burns caused by fire.
    FIRE_TICK("fire_tick_"),

    // Kill caused by direct exposure to lava.
    LAVA("lava_")  ,

    // Kill caused by being struck by lightning.
    LIGHTNING("lightning_"),

    // Kill caused by being hit by a damage potion or spell.
    MAGIC("magic_"),

    // Kill caused due to a snowman melting
    MELTING("melting_"),

    // Kill caused due to an ongoing poison effect.
    POSION("poison_"),

    // Kill caused by starving due to having an empty hunger bar.
    STARVATION("starvation_"),

    // Kill caused by being put in a block
    SUFFOCATION("succination_"),

    // Kill caused by committing suicide using the command "/kill".
    SUICIDE("suicide_"),

    // Kill caused in retalitation to another attack by the Thorns enchantment.
    THORNS("thorns_"),

    // Kill caused by the whither potion effect
    WITHER("wither_");

    private final String key;

    BedWarsKillCause(String key) {
        this.key = key;
    }

    String getKey() {
        return key;
    }

    }