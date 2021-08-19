package at.aimrose.neoxsucht.commands;

import at.aimrose.neoxsucht.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_ChatClear implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            Main.INSTANCE.log("§4Dazu musst du ein Spieler sein.");
            return true;
        }

        Player p = (Player) sender;

        if (p.hasPermission("neoxsucht.chatclear") || p.hasPermission("neoxsucht.*")) {
            for (int i = 0; i < 105; ++i) {
                for (Player all : Bukkit.getOnlinePlayers()) {
                    if (!all.hasPermission("neoxsucht.teamchatclear")) {
                        all.sendMessage("");
                    }
                }
            }
            Bukkit.broadcastMessage(Main.PREFIX + "§7 Der Chat wurde zur Sicherheit der Spieler von §e " + p.getName() + "§7 geleert.");
            return true;

        } else {
            p.sendMessage(Main.PREFIX + Main.PERMS);
        }


        return false;
    }
}
