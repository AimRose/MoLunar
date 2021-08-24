package at.aimrose.neoxsucht.socialmedia;

import at.aimrose.neoxsucht.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Website implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        p.sendMessage(Main.PREFIX + "§7Unsere Website ist akutell in §4Wartungen§7.");

        return false;
    }
}
