package com.explosivecleric.paintball;

import org.bukkit.event.Listener;

public class MainEventListener implements Listener {
	public Paintball plugin;
	
	public MainEventListener(Paintball instance) {
		this.plugin = instance;
	}
}