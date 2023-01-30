package de.xnme.riiqz.buildsystemv1.warp;

import de.xnme.riiqz.buildsystemv1.Main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setBuild implements CommandExecutor {

    private Main plugin;

    public setBuild(Main plugin){
        this.plugin = plugin;
        plugin.getCommand("setbuild").setExecutor(this);

    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("Nur für Spieler!");
            return false;

        }

        return false;


    }
}
