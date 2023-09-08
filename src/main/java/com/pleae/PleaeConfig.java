package com.pleae;


import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("pleae")
public interface PleaeConfig extends Config {
    @ConfigItem(
            keyName = "chatMessageForYou",
            name = "Chat Message For You",
            description = "Whether a Pleae message is shown in chat when you die",
            position = 0
    )
    default boolean chatMessageForYou() {
        return true;
    }

    @ConfigItem(
            keyName = "overheadMessageForYou",
            name = "Overhead Message For You",
            description = "Whether a Pleae message is shown over your head when you die",
            position = 1
    )
    default boolean overheadMessageForYou() {
        return true;
    }

    @ConfigItem(
            keyName = "chatMessageForOthers",
            name = "Chat Message For Others",
            description = "Whether a Pleae message is shown in chat when another player dies",
            position = 2
    )
    default boolean chatMessageForOthers() {
        return true;
    }

    @ConfigItem(
            keyName = "overheadMessageForOthers",
            name = "Overhead Message For Others",
            description = "Whether a Pleae message is shown over other players' heads when they die",
            position = 3
    )
    default boolean overheadMessageForOthers() {
        return true;
    }
}
