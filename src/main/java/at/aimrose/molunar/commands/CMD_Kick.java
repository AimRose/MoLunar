package at.aimrose.molunar.commands;

import at.aimrose.molunar.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Kick implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission(Main.Kick)) {
                if (args.length == 0) {
                    player.sendMessage(Main.PREFIX + "§7Bitte benutze /kick [Name] [Grund]");
                } else if (args.length == 1) {
                    player.sendMessage(Main.PREFIX + "§7Bitte benutze /kick [Name] [Grund]");
                } else {
                    Player t = Bukkit.getPlayer(args[0]);
                    if (t != null) {
                        StringBuilder sb = new StringBuilder();
                        for(int i = 1; i < args.length; i++) {
                            if(i != 0) {
                                sb.append(' ');
                            }
                            sb.append(args[i]);
                        }
                        String grund = sb.toString();
                        t.kickPlayer("§cDu wurdest vom Netzwerk gekickt! \n"
                                + "§eGrund §8» §7" +grund);

                        player.sendMessage(Main.PREFIX + "§7Der Spieler §e" + t.getName() + " §7wurde gekickt mit dem Grund: §e" +grund);
                    } else {
                        player.sendMessage(Main.PREFIX + "§7Der Spieler §e" + args[0] + " §7ist nicht online.");
                    }
                }


            } else {
                player.sendMessage(Main.PREFIX + Main.PERMS);
            }
        } else {
            Player t = Bukkit.getPlayer(args[0]);
            if (t != null) {
                StringBuilder sb = new StringBuilder();
                for(int i = 1; i < args.length; i++) {
                    if(i != 0) {
                        sb.append(' ');
                    }
                    sb.append(args[i]);
                }
                String grund = sb.toString();
                t.kickPlayer("§cDu wurdest vom Netzwerk gekickt \n"
                        + "§eGrund§8:§7" +grund);
                sender.sendMessage(Main.PREFIX + "§7Der Spieler §e" + t.getName() + " §7wurde gekickt mit dem Grund: §e" +grund);
            } else {
                sender.sendMessage(Main.PREFIX + "§7Der Spieler §e" + args[0] + " §7ist nicht online.");
            }
        }

        return false;
    }
}