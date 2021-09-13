package at.aimrose.molunar.commands;

import at.aimrose.molunar.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission(Main.Fly)) {
                if (args.length == 0) {
                    if (player.getAllowFlight()) {
                        player.sendMessage(Main.PREFIX + "§7Dein Flugmodus wurde deaktiviert.");
                        player.setAllowFlight(false);
                        player.setFlying(false);
                    } else {
                        player.sendMessage(Main.PREFIX + "§7Dein Flugmodus wurde aktiviert.");
                        player.setAllowFlight(true);
                        player.setFlying(true);
                    }

                } else
                    player.sendMessage(Main.PREFIX + "§7Bitte benutze /fly.");
            } else
                player.sendMessage(Main.PREFIX + Main.PERMS);
        } else
            sender.sendMessage("§4Du musst ein Spieler sein für diesen Command.");


        return false;
    }
}
