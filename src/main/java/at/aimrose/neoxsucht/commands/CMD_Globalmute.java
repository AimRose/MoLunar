package at.aimrose.neoxsucht.commands;

import at.aimrose.neoxsucht.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Globalmute implements CommandExecutor {
    public static boolean globalmute = true;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) {
            sender.sendMessage("§4Dazu musst du ein Spieler sein.");
        }else{
            Player p = (Player) sender;

            if(!(p.hasPermission("neoxsucht.globalmute") || (p.hasPermission("neoxsucht.*")))) {
                p.sendMessage(Main.PREFIX + Main.PERMS);
                return true;
            }
            for (Player all : Bukkit.getOnlinePlayers()) {
                if (globalmute) {
                    globalmute = false;
                    all.sendMessage(Main.PREFIX + "§7Der Chat wurde von §e " + sender.getName() + "§7 aktiviert");
                } else {
                    globalmute = true;
                    all.sendMessage(Main.PREFIX + "§7Der Chat wurde von §e " + sender.getName() + "§7 deaktiviert");
                }
            }

        }



        return false;
    }
}