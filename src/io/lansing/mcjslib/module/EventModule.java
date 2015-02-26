package io.lansing.mcjslib.module;

import org.bukkit.plugin.Plugin;

import io.lansing.mcjslib.ActiveListener;
import io.lansing.mcjslib.RunningModule;

public class EventModule extends RunningModule {

	private ActiveListener[] listeners = {
			// TODO Add Listeners Here...
		};
	
	@Override
	public void onEnable(Plugin p) {
		for (int i = 0; i < listeners.length; i++) {
			p.getServer().getPluginManager().registerEvents(listeners[i], p);
		}
	}

	@Override
	public void onDisable(Plugin p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLoad(Plugin p) {
		// TODO Auto-generated method stub
		
	}
	
}
