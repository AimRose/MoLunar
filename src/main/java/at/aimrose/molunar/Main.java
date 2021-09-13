package at.aimrose.molunar;

import at.aimrose.molunar.commands.*;
import at.aimrose.molunar.listener.*;
import at.aimrose.molunar.menu.ClickListener;
import at.aimrose.molunar.menu.MenuCommand;
import at.aimrose.molunar.perks.InvDeathListener;
import at.aimrose.molunar.perks.InventoryCommand;
import at.aimrose.molunar.perks.PerkClickListener;
import at.aimrose.molunar.perks.XpDeathListener;
import at.aimrose.molunar.socialmedia.*;
import at.aimrose.molunar.stoarge.MySQL.MySQL;
import org.bukkit.Bukkit;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;



public final class Main extends JavaPlugin {

    //Messages
    public static String YouHeal = "";
    //Permissions
    public static String Heal = "";
    public static String Feed = "";
    public static String Fly = "";
    public static String Kick = "";
    public static String Wartung = "";
    public static String Broadcast = "";
    public static String Gamemode = "";
    public static String Mentation = "";
    public static String ChatClear = "";
    //PREFIX
    public static String PREFIX = "";
    //NO PERMS
    public static String PERMS = "§7Diesen Befehl gibt es nicht benutze §e/help§7!";
    //Wartung
    public static boolean wartung;
    //Main
    public static Main INSTANCE;
    public Plugin plugin;

    public Main() {
        INSTANCE = this;
    }


    @Override
    public void onEnable() {
        if (!this.getDataFolder().exists()) {
            this.getDataFolder().mkdir();
        }
        this.saveDefaultConfig();

        //Permissions
        Heal = this.getConfig().getString("Permissions.Heal");
        Feed = this.getConfig().getString("Permissions.Feed");
        Fly = this.getConfig().getString("Permissions.Fly");
        Kick = this.getConfig().getString("Permissions.Kick");
        Wartung = this.getConfig().getString("Permissions.Wartung");
        Broadcast = this.getConfig().getString("Permissions.Broadcast");
        ChatClear = this.getConfig().getString("Permissions.ChatClear");
        Gamemode = this.getConfig().getString("Permissions.Gamemode");
        Mentation = this.getConfig().getString("Permissions.Mentation");
        //Messages
        YouHeal = this.getConfig().getString("Heal.YouHeal");
        //Prefix
        PREFIX = this.getConfig().getString("PluginPrefix.Prefix");
        //MySQL
        MySQL.username = this.getConfig().getString("MySQL.username");
        MySQL.port = this.getConfig().getString("MySQL.port");
        MySQL.host = this.getConfig().getString("MySQL.host");
        MySQL.database = this.getConfig().getString("MySQL.database");
        MySQL.password = this.getConfig().getString("MySQL.password");
        MySQL.connect();
        MySQL.createTable();

        getCommand("kick").setExecutor(new CMD_Kick());
        getCommand("heal").setExecutor(new CMD_Heal());
        getCommand("feed").setExecutor(new CMD_Feed());
        getCommand("fly").setExecutor(new CMD_Fly());
        getCommand("cc").setExecutor(new CMD_ChatClear());
        getCommand("chatclear").setExecutor(new CMD_ChatClear());
        getCommand("gm").setExecutor(new CMD_Gamemode());
        getCommand("gamemode").setExecutor(new CMD_Gamemode());
        getCommand("wartung").setExecutor(new CMD_Wartung());
        getCommand("perks").setExecutor(new InventoryCommand());
        getCommand("bc").setExecutor(new CMD_Broadcast());
        getCommand("broadcast").setExecutor(new CMD_Broadcast());
        getCommand("menu").setExecutor(new MenuCommand());

        //Socialmedia CMD's

        getCommand("ts").setExecutor(new CMD_Teamspeak());
        getCommand("teamspeak").setExecutor(new CMD_Teamspeak());
        getCommand("discord").setExecutor(new CMD_Discord());
        getCommand("dc").setExecutor(new CMD_Discord());
        getCommand("website").setExecutor(new CMD_Website());
        getCommand("twitter").setExecutor(new CMD_Twitter());
        getCommand("instagram").setExecutor(new CMD_Instagram());
        getCommand("insta").setExecutor(new CMD_Instagram());


        log("§7is §2enabled.");

        //Config
        CMD_Wartung.CreateConfig();

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new XpDeathListener(), this);
        pm.registerEvents(new InvDeathListener(), this);
        pm.registerEvents(new PerkClickListener(), this);
        pm.registerEvents(new MentationListener(), this);
        pm.registerEvents(new ClickListener(), this);
        pm.registerEvents(new MenuClickListener(), this);
    }



        @Override
    public void onDisable() {
        MySQL.close();

        log("§7is §4disabled.");
    }

    //ConsoleSender
    public void log(String text) {
        Bukkit.getConsoleSender().sendMessage(PREFIX + text);
    }


}
