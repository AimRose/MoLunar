package at.aimrose.neoxsucht.commands;

import at.aimrose.neoxsucht.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Feed implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("neoxsucht.feed") || (player.hasPermission("neoxsucht.*"))) {
                if (args.length == 0) {
                    player.setFoodLevel(20);
                    player.sendMessage(Main.PREFIX + "§7Dein Hunger wurde gestillt.");
                } else if (args.length == 1) {
                    Player target = Bukkit.getPlayer(args[0]);
                    if (target != null) {
                        target.setFoodLevel(20);
                        target.sendMessage(Main.PREFIX + "§7Dein Hunger wurde gestillt.");
                        player.sendMessage(Main.PREFIX + "§7Du hast den Hunger von §e" + target.getName() + " §7gestillt.");
                    } else
                        player.sendMessage(Main.PREFIX + "§7Der Spieler §e" + args[0] + " §7ist nicht online.");
                } else
                    player.sendMessage(Main.PREFIX + "§7Bitte benutze /feed [Spieler].");
            } else
                player.sendMessage(Main.PREFIX + Main.PERMS);
        } else
            sender.sendMessage("§4Du musst ein Spieler sein für diesen Command.");

        return false;
    }

}
