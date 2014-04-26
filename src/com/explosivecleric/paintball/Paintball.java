package com.explosivecleric.paintball;

import org.bukkit.plugin.java.JavaPlugin;
import com.explosivecleric.paintball.util.Static;

public class Paintball extends JavaPlugin { 
	
	
	@Override
	public void onEnable() {
		Static.log = this.getLogger();
		Static.log.info("Paintball is now enabled.");
	}
	
	@Override
	public void onDisable() {
		Static.log.info("Paintball is now disabled.");
	}
}