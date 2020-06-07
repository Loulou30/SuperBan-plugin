package fr.loulou.plugin.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class BanInvEvent  implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        if (event.getClickedInventory().getTitle().equalsIgnoreCase("§7#BanHammer")) {

            if(event.getCurrentItem().getType() == Material.SKULL_ITEM) {
                Player whoToBan = player.getServer().getPlayer(event.getCurrentItem().getItemMeta().getDisplayName());




            }

        }

    }
}
