package at.aimrose.molunar.commands;

import at.aimrose.molunar.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CMD_Broadcast implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission("neoxsucht.broadcast") || (sender.hasPermission("neoxsucht.*"))) {

            if (args.length >= 1) {
                String msg = "";
                for(int i = 0; i< args.length;i++){
                    msg = msg + args[i] + " ";
                }

                Bukkit.broadcastMessage("§f§LNeoxSucht §8» §7 " + msg.replaceAll("&", "§"));


            } else {
                sender.sendMessage(Main.PREFIX + "§7Benutze /broadcast <Message>");
            }
        } else {
            sender.sendMessage(Main.PERMS);
        }


        return false;
    }
}
