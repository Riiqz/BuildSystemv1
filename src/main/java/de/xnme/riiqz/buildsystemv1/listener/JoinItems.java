package de.xnme.riiqz.buildsystemv1.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinItems implements Listener {

    @EventHandler

    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        ItemStack i1 = new ItemStack(Material.RECOVERY_COMPASS);
        ItemMeta i1meta = i1.getItemMeta();
        i1meta.setDisplayName("§eTeleporter");
        i1.setItemMeta(i1meta);

        ItemStack i2= new ItemStack(Material.GOLDEN_PICKAXE);
        ItemMeta i2meta = i2.getItemMeta();
        i2meta.setDisplayName("§eBuild");
        i2.setItemMeta(i2meta);


        ItemStack i3 = new ItemStack(Material.MAGMA_CREAM);
        ItemMeta i3meta = i3.getItemMeta();
        i3meta.setDisplayName("§eLeave");
        i3.setItemMeta(i3meta);


        p.getInventory().clear();

        p.getInventory().setItem(8, i3);

        if(p.hasPermission("build.team")){
            p.getInventory().clear();

            p.getInventory().setItem(0, i1);
            p.getInventory().setItem(8, i3);

        }

        if(p.hasPermission("build.admin")){
            p.getInventory().clear();


            p.getInventory().setItem(0, i1);
            p.getInventory().setItem(4, i2);
            p.getInventory().setItem(8, i3);

        }









    }

}
