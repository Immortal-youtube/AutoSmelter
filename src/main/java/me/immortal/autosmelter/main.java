package me.immortal.autosmelter;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BreakBlockEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
