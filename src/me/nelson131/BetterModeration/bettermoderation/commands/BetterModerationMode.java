package me.nelson131.BetterModeration.bettermoderation.commands;

import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.List;

public class BetterModerationMode implements CommandExecutor {
    public List<Player> PlayersOnModeration;
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("This command can use only player");
            return false;
        }
        Player player = (Player) commandSender;
        if (commandSender.getName().equalsIgnoreCase("ModerationMode") && commandSender.hasPermission("moderator")) {
            commandSender.sendMessage(Color.RED + "Better Moderation mode has been enabled!");
            System.out.println(commandSender + "enable Better Moderation mode");
            PlayersOnModeration.add(player);

            return true;
        }
        else {
            commandSender.sendMessage(Color.RED + "You don`t have permission.");
            return false;
        }


    }
}


