package io.lansing.mcjslib.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;

import io.lansing.mcjslib.ActiveListener;

public class PlayerListener extends ActiveListener {

	@Override
	public void triggered(Event e) {
		Bukkit.broadcastMessage(e.getEventName());
		/*
		switch (e.getEventName()) {
		case value:
			
			break;

		default:
			break;
		}
		*/
	}
	
}
