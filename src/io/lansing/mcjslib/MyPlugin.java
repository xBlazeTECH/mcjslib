package io.lansing.mcjslib;

import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

	private RunningModule[] modules = {
		// TODO Add Modules Here...	
	};
	
	@Override
	public void onEnable() {
		for (int i = 0; i < modules.length; i++) {
			modules[i].onEnable();
		}
	}
	
	@Override
	public void onLoad() {
		for (int i = 0; i < modules.length; i++) {
			modules[i].onLoad();
		}
	}
	
	@Override
	public void onDisable() {
		for (int i = 0; i < modules.length; i++) {
			modules[i].onDisable();
		}
	}
	
}
