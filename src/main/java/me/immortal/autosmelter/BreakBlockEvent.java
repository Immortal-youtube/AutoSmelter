package me.immortal.autosmelter;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakBlockEvent implements Listener {

    @EventHandler
    public void onBreakBlock(BlockBreakEvent event) {
        if(event.getBlock().getType().equals(Material.IRON_ORE) || event.getBlock().getType().equals(Material.DEEPSLATE_IRON_ORE)) {
            event.setExpToDrop(100);
            Player p = event.getPlayer();
            event.getPlayer().getWorld().dropItemNaturally(p.getLocation(), new ItemStack(Material.IRON_INGOT, event.getBlock().getDrops().size()));
        }
        if(event.getBlock().getType().equals(Material.GOLD_ORE) || event.getBlock().getType().equals(Material.DEEPSLATE_GOLD_ORE) || event.getBlock().getType().equals(Material.NETHER_GOLD_ORE)) {
            event.setExpToDrop(100);
            Player p = event.getPlayer();
            event.getPlayer().getWorld().dropItemNaturally(p.getLocation(), new ItemStack(Material.GOLD_INGOT, event.getBlock().getDrops().size()));
        }
        if(event.getBlock().getType().equals(Material.ANCIENT_DEBRIS)){
            event.setExpToDrop(100);
            Player p = event.getPlayer();
            event.getPlayer().getWorld().dropItemNaturally(p.getLocation(), new ItemStack(Material.NETHERITE_INGOT, event.getBlock().getDrops().size()));
        }
    }

}
