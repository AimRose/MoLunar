package at.aimrose.neoxsucht.menu;

import at.aimrose.neoxsucht.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class MenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) return false;

        Player p = (Player) sender;
        Inventory menuinv = Bukkit.createInventory(null, 5*9, "§c§lMenu");
        menuinv.setItem(0, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(1, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(2, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(3, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(4, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(5, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(6, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(7, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(8, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(9, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(10, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(11, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(12, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(13, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(14, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(15, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(16, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(17, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(18, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(19, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(20, new ItemBuilder(Material.REDSTONE_COMPARATOR).setDisplayname("§4Wartungen").setLore("§7Klicke hier").build());
        menuinv.setItem(21, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(22, new ItemBuilder(Material.REDSTONE_TORCH_ON).setDisplayname("§4Wartungen").setLore("§7Klicke hier").build());
        menuinv.setItem(23, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(24, new ItemBuilder(Material.REDSTONE_LAMP_OFF).setDisplayname("§4Wartungen").setLore("§7Klicke hier").build());
        menuinv.setItem(25, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(26, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(27, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(28, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(29, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(30, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(31, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(31, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(32, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(33, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(34, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(35, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(36, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(37, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(38, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(39, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(40, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(41, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(42, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(43, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
        menuinv.setItem(44, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());


        p.openInventory(menuinv);
        return false;
    }
}
