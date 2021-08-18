package com.william.plugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Note;
import org.bukkit.World;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		System.out.println("Hologram plugin has worked (sorta)");
		
		//Add HologramListener:
		Bukkit.getPluginManager().registerEvents(new HologramListener(this), this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("Hologram plugin disabled");
	}
	
	//Create Hologram using invisible armor stand:
	public void spawnHologram(Player player) {
		World world = player.getWorld();
		ArmorStand stand = (ArmorStand) world.spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
		
		stand.setVisible(false);
		stand.setGravity(false);
		stand.setInvulnerable(false);
		
		stand.setCustomNameVisible(true);
		stand.setCustomName(ChatColor.RED + "Bucket placed");
		
		stand.setSmall(true);
	}
	
}
