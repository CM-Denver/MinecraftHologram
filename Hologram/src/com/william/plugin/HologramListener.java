package com.william.plugin;

import org.bukkit.Note;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.NotePlayEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class HologramListener implements Listener {

	private Main main;
	
	public HologramListener(Main main) {
		this.main = main;
	}
	
	@EventHandler
	public void onBuketEmpty(PlayerBucketEmptyEvent e) {
		
		Player player = e.getPlayer();
		
		main.spawnHologram(player);
		
	}
	
}
