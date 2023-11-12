package ink.magma.fixkickforspam;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class FixKickForSpam extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler(ignoreCancelled = true)
    public void onKick(PlayerKickEvent event) {
//        getLogger().info("KickEventHappened: " + event.getReason());
        if (event.getReason().equalsIgnoreCase("Kicked for spamming")) {
            event.setCancelled(true);
        }
    }
}
