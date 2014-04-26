package com.explosivecleric.paintball;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.explosivecleric.paintball.util.Static;

public class Paintball extends JavaPlugin { 
	public final MainEventListener eventListener = new MainEventListener(this);
	
	@Override
	public void onEnable() {
		Static.log = this.getLogger();	
		Static.log.info("Paintball is now enabled.");
		
		PluginManager pluginManager = this.getServer().getPluginManager();
		pluginManager.registerEvents(eventListener, this);
	}
	
	@Override
	public void onDisable() {
		Static.log.info("Paintball is now disabled.");
	}
}