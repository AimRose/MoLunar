package at.aimrose.neoxsucht.commands;

import at.aimrose.neoxsucht.Main;
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

            if(!(p.hasPermission("system.globalmute") || (p.hasPermission("system.*")))) {
                p.sendMessage(Main.PREFIX + Main.PERMS);
                return true;
            }
            if(globalmute) {
                globalmute = false;
                p.sendMessage(Main.PREFIX + "§7Der Chat wurde von §e " + sender.getName() + "§7 aktiviert");
            }else{
                globalmute =  true;
                p.sendMessage(Main.PREFIX + "§7Der Chat wurde von §e " + sender.getName() + "§7 deaktiviert");
            }

        }



        return false;
    }
}