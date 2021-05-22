package me.pizzaboysz.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Blockbreaklistener implements Listener {
    public int blokkenGebroken;
    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {
        String playerBreaking = event.getPlayer().getName();
        String command = "lps expgive " + playerBreaking + " 1";
        blokkenGebroken += 1;
        if (blokkenGebroken >= 100) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
            System.out.println("XP geven!!!" + playerBreaking + command);
            blokkenGebroken = 0;
        }

    }
}
