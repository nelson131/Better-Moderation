package me.nelson131.BetterModeration.bettermoderation.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import java.util.List;

public class BlockPlaceListener implements Listener {
    List<Player> PlayersOnModeration = null;

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlockPlaced();
        Material material = block.getType();

        if (block.getType() == Material.TNT) {
                sendModerationMessage(player + "place" + block);


        }
    }



    private void sendModerationMessage(String component) {
        Bukkit.getOnlinePlayers().forEach(it -> {
            if (it.hasPermission("moderator")) {
                it.sendMessage(component);
            }
        });
}
    }
