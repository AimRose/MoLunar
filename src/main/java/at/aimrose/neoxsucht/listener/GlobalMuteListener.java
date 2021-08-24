package at.aimrose.neoxsucht.listener;

import at.aimrose.neoxsucht.Main;
import at.aimrose.neoxsucht.commands.CMD_Globalmute;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class GlobalMuteListener implements Listener {


    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        if (CMD_Globalmute.globalmute) {
            if (e.getPlayer().hasPermission("system.globalmute.bypass") || (e.getPlayer().hasPermission("neoxsucht.*"))) {
                return;
            }
            e.getPlayer().sendMessage(Main.PREFIX + "§7Zurzeit ist der Chat leider §4deaktiviert§7.");
            e.setCancelled(true);
        }
    }
}
