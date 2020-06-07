package fr.loulou.plugin;

import fr.loulou.plugin.commands.SBCommand;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("[SuperBan] Loaded.");
        getCommand("sb").setExecutor(new SBCommand());
    }

    @Override
    public void onDisable() {
        System.out.println("[SuperBan] Disabled.");
    }
    public void openGUI(Player player) {

        Inventory ban = Bukkit.createInventory(player, 45, "§7#BanHammer");

        ArrayList<Player> player_list = new ArrayList<>(player.getServer().getOnlinePlayers());
        for (int i = 0; i < player_list.size(); i++) {
            ItemStack playerHead = new ItemStack(Material.SKULL_ITEM, 1);
            ItemMeta meta = playerHead.getItemMeta();
            meta.setDisplayName("§c" + player_list.get(i).getDisplayName());

            playerHead.setItemMeta(meta);
            ban.addItem(playerHead);
        }
        player.openInventory(ban);

    }

}
