package at.aimrose.molunar.socialmedia;

import at.aimrose.molunar.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Twitter implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        p.sendMessage(Main.PREFIX + "§7Unser Twitter Account ist akutell in §4Wartungen§7.");

        return false;
    }
}
