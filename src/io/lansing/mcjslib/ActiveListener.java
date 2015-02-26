package io.lansing.mcjslib;

import org.bukkit.event.Event;
import org.bukkit.event.Listener;

public abstract class ActiveListener implements Listener {
	public abstract void triggered(Event e);
}
