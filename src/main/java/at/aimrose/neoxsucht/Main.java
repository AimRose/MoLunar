package at.aimrose.neoxsucht;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    //PREFIX
    public static String PREFIX = "§6§lNEOXSUCHT§8» ";
    public static String PERMS = "§7Du bist nicht dazu berechtigt diesen Command auszuführen.";
    //Wartung

    //Main
    public static Main INSTANCE;
    public Plugin plugin;

    public Main() {
        INSTANCE = this;
    }


    @Override
    public void onEnable() {
        // Plugin startup logic

        log("§7is §2enabled.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        log("§7is §4disabled.");
    }

    //ConsoleSender
    public void log(String text) {
        Bukkit.getConsoleSender().sendMessage(PREFIX + text);
    }

}
