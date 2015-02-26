package io.lansing.mcjslib;

import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

	private RunningModule[] modules = {
		// TODO Add Modules Here...	
	};
	private ActiveListener[] listeners = {
		// TODO Add Listeners Here...
	};
	
	@Override
	public void onEnable() {
		for (int i = 0; i < listeners.length; i++) {
			this.getServer().getPluginManager().registerEvents(listeners[i], this);
		}
		for (int i = 0; i < modules.length; i++) {
			modules[i].onEnable(this);
		}
	}
	
	@Override
	public void onLoad() {
		for (int i = 0; i < modules.length; i++) {
			modules[i].onLoad(this);
		}
	}
	
	@Override
	public void onDisable() {
		for (int i = 0; i < modules.length; i++) {
			modules[i].onDisable(this);
		}
	}
	
}
