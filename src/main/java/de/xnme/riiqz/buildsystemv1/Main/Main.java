package de.xnme.riiqz.buildsystemv1.Main;

import de.xnme.riiqz.buildsystemv1.item.interact;
import de.xnme.riiqz.buildsystemv1.listener.JoinItems;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static String prefix = "§7[§eBuildSystem§7] ";
    public static String noperms = "§7[§eBuildSystem§7] §cDazu hast du leider keine Rechte!";


    @Override
    public void onEnable() {

        loadConfig();

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new JoinItems(), this);
        pm.registerEvents(new interact(), this);





    }


    private void loadConfig(){
        getConfig().options().copyDefaults(false);
        saveConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
