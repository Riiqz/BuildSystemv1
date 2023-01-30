package de.xnme.riiqz.buildsystemv1.item;

import de.xnme.riiqz.buildsystemv1.Main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class interact implements Listener {


    public void onInteract(PlayerInteractEvent e){

        Player p = e.getPlayer();

        try{
            if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eTeleporter")){
                if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){

                    Inventory inv = Bukkit.createInventory(null, InventoryType.CHEST, "§eTeleporter");





                }


            }

        }catch (Exception ex){


        }




    }

}
