package org.unito.mc.joinandwhite;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.unito.mc.joinandwhite.command.JAWCommand;

import java.util.List;

public final class JoinAndWhite extends JavaPlugin {

    public static JoinAndWhite instance;
    public boolean RandomMsg;
    public List<String> RandomMsges;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new EventListener(), this);
        instance = this;
        new JAWCommand();
        RandomMsg = getConfig().getBoolean("isRandomMessages");
        RandomMsges = getConfig().getStringList("RandomMessages");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static JoinAndWhite getInstance() { return instance; }
}
