package at.aimrose.neoxsucht.commands;

import at.aimrose.neoxsucht.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("neoxsucht.gamemode") || p.hasPermission("neoxsucht.*")) {
                if (args.length == 0) {
                    p.sendMessage(Main.PREFIX + "§7Bentuze bitte /gm 0 | 1 | 2 | 3 [Spieler]");
                } else if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("0")) {

                        p.setGameMode(GameMode.SURVIVAL);
                        p.sendMessage(Main.PREFIX + "§7Spielmodus §eÜberlebenmodus §7für §e" + p.getName() + "§7 gesetzt.");
                    } else if (args[0].equalsIgnoreCase("1")) {

                        p.setGameMode(GameMode.CREATIVE);
                        p.sendMessage(Main.PREFIX + "§7Spielmodus §eKreativmodus §7für §e" + p.getName() + "§7 gesetzt.");
                    } else if (args[0].equalsIgnoreCase("2")) {

                        p.setGameMode(GameMode.ADVENTURE);
                        p.sendMessage(Main.PREFIX + "§7Spielmodus §eAbenteuermodus §7für §e" + p.getName() + "§7 gesetzt.");
                    } else if (args[0].equalsIgnoreCase("3")) {

                        p.setGameMode(GameMode.SPECTATOR);
                        p.sendMessage(Main.PREFIX + "§7Spielmodus §eZuschauermodus §7für §e" + p.getName() + "§7 gesetzt.");
                    } else if (args.length == 2) {
                        Player target = Bukkit.getPlayer(args[1]);
                        if (target != null) {
                            if (args[0].equalsIgnoreCase("0")) {

                                p.sendMessage(Main.PREFIX + "§7Du hast den Spieler §e" + target.getName() + " §7in den §eÜberlebenmodus §7 gesetzt.");
                                target.setGameMode(GameMode.SURVIVAL);
                                target.sendMessage(Main.PREFIX + "§7Spielmodus §eÜberlebenmodus §7für §e" + target.getName() + "§7 gesetzt.");

                            } else if (args[0].equalsIgnoreCase("1")) {

                                p.sendMessage(Main.PREFIX + "§7Du hast den Spieler §e" + target.getName() + " §7in den §eKreativmodus §7 gesetzt.");
                                target.setGameMode(GameMode.CREATIVE);
                                target.sendMessage(Main.PREFIX + "§7Spielmodus §eKreativmodus §7für §e" + target.getName() + "§7 gesetzt.");

                            } else if (args[0].equalsIgnoreCase("2")) {

                                p.sendMessage(Main.PREFIX + "§7Du hast den Spieler §e" + target.getName() + " §7in den §eAbenteuermodus §7 gesetzt.");
                                target.setGameMode(GameMode.ADVENTURE);
                                target.sendMessage(Main.PREFIX + "§7Spielmodus §eAbenteuermodus §7für §e" + target.getName() + "§7 gesetzt.");

                            } else if (args[0].equalsIgnoreCase("3")) {

                                p.sendMessage(Main.PREFIX + "§7Du hast den Spieler §e" + target.getName() + " §7in den §eZuschauermodus §7 gesetzt.");
                                target.setGameMode(GameMode.SPECTATOR);
                                target.sendMessage(Main.PREFIX + "§7Spielmodus §eZuschauermodus §7für §e" + target.getName() + "§7 gesetzt.");
                            }
                        } else {
                            p.sendMessage(Main.PREFIX + "§7Bentuze bitte /gm 0 | 1 | 2 | 3 [Spieler]");
                        }
                    } else {
                        p.sendMessage(Main.PREFIX + "§7Der Spieler §e" + args[1] + " §7ist nicht online.");
                    }

                } else {
                    p.sendMessage(Main.PREFIX + "§7Bentuze bitte /gm 0 | 1 | 2 | 3 [Spieler]");
                }

            } else {
                p.sendMessage(Main.PREFIX + Main.PERMS);
            }
        }


        return false;
    }
}