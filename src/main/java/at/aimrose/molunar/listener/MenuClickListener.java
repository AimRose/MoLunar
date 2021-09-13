package at.aimrose.molunar.listener;

import at.aimrose.molunar.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuClickListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getTitle() == "§c§lMenu") {
            if (e.getCurrentItem().getItemMeta().getDisplayName() == "§eTeamspeak") {
                p.sendMessage(Main.PREFIX + "§7Unser Teamspeak Server ist akutell in §4Wartungen§7.");
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName() == "§eDiscord") {
                p.sendMessage(Main.PREFIX + "§7Unser Discord Server ist akutell in §4Wartungen§7.");
            }
            e.setCancelled(true);
        }
    }


}
