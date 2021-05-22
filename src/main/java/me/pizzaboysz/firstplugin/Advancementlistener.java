package me.pizzaboysz.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.advancement.Advancement;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.jetbrains.annotations.NotNull;

public class Advancementlistener implements Listener {
    @EventHandler
    public void onAdvancementmade(PlayerAdvancementDoneEvent event) {
        Advancement advancementDone = event.getAdvancement();
        String playerAdvancing = event.getPlayer().getName();
        String command = "lps expgive " + playerAdvancing + "0.1";
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
        System.out.println("giving xp for advancement to " + playerAdvancing + command + advancementDone);
    }
}
