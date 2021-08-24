package at.aimrose.neoxsucht.listener;

import at.aimrose.neoxsucht.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.ServerListPingEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (!p.hasPlayedBefore()) {
            e.setJoinMessage(" ");
        } else {
            e.setJoinMessage(" ");
        }
        //Wartung

        if (Main.wartung == true) {
            if (!p.hasPermission("neoxsucht.wartung.bypass")) {
                p.kickPlayer("§cDas Netzwerk hat aktuell Wartungarbeiten an ihren Servern \n"
                        + "§3Wir bitten deshalb um euer Verständnis.");
                return;
            }
        }

    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        e.setQuitMessage(" ");
    }

    @EventHandler
    public void ServerPing(ServerListPingEvent e) {
        if (Main.wartung == true) {
            e.setMotd("§f§LNeoxSucht §8» §4Wartungsarbeiten.");
        }

    }
}
