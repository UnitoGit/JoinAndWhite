package org.unito.mc.joinandwhite;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {

    @EventHandler
    public void OnJoin(PlayerJoinEvent e) {
        e.setJoinMessage(JoinAndWhite.getInstance().getConfig().getString("JoinMessage"));
    }
}
