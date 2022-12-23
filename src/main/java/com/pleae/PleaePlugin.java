package com.pleae;

import javax.inject.Inject;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.ScriptID;
import net.runelite.api.events.ActorDeath;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(name = "Pleae")
public class PleaePlugin extends Plugin {
    @Inject
    private Client client;

    @Subscribe
    public void onActorDeath(ActorDeath actorDeath) {
        if (actorDeath.getActor() == client.getLocalPlayer()) {
            client.runScript(ScriptID.CHAT_SEND, "Pleae", 0, 0, 0, -1);
        }
    }
}
