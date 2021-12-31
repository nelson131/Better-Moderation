package me.nelson131.BetterModeration.bettermoderation;

import me.nelson131.BetterModeration.bettermoderation.commands.BetterModerationMode;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Logger;

public class Plugin extends JavaPlugin {
    Logger log = getLogger();
    public static Plugin plugin;

    @Override
    public void onEnable(){
        this.plugin = plugin;
        log.info("Enabled BetterModeration!");
        getCommand("ModerationMode").setExecutor(new BetterModerationMode());



    }
    @Override
    public void onDisable(){

        log.info("Disabled BetterModeration!");
    }

}
