package me.pizzaboysz.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Lekkere plugin hoor");

        getServer().getPluginManager().registerEvents(new Blockbreaklistener(), this);
        getServer().getPluginManager().registerEvents(new Advancementlistener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
