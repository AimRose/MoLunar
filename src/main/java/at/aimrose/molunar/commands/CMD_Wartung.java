package at.aimrose.molunar.commands;

import at.aimrose.molunar.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class CMD_Wartung implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission(Main.Wartung)) {
                if (Main.wartung == true) {
                    setWartung(false);
                    Main.wartung = false;
                    p.sendMessage(Main.PREFIX + "§7Du hast nun Wartungen am Netzwerk deaktiviert. ");
                } else {
                    setWartung(true);
                    Main.wartung = true;
                    p.sendMessage(Main.PREFIX + "§7Du hast nun Wartungen am Netzwerk aktiviert.");
                }
            } else {
                p.sendMessage(Main.PREFIX + Main.PERMS);
            }
        } else {
            //Console
            if (Main.wartung == true) {
                setWartung(false);
                Main.wartung = false;
                sender.sendMessage(Main.PREFIX + "§7Du hast nun Wartungen am Netzwerk deaktiviert. ");
            } else {
                setWartung(true);
                Main.wartung = true;
                sender.sendMessage(Main.PREFIX + "§7Du hast nun Wartungen am Netzwerk aktiviert.");
            }
        }

        return false;
    }

    public static void CreateConfig() {
        File f = new File("plugins/NEOXSUCHTSYSTEMV1/wartung.yml");
        YamlConfiguration cfg = new YamlConfiguration().loadConfiguration(f);
        if (f.exists()) {
            Main.wartung = cfg.getBoolean("neoxsucht.wartung");
        } else {
            cfg.set("neoxsucht.wartung", false);
            try {
                cfg.save(f);
            } catch (IOException e) {

                e.printStackTrace();
            }
            Main.wartung = false;
        }
    }

    public static void setWartung(boolean wartung) {
        File f = new File("plugins/NEOXSUCHTSYSTEMV1/wartung.yml");
        YamlConfiguration cfg = new YamlConfiguration().loadConfiguration(f);
        cfg.set("neoxsucht.wartung", wartung);

        try {
            cfg.save(f);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}