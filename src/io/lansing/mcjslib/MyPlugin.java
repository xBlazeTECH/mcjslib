package io.lansing.mcjslib;

import io.lansing.mcjslib.module.EventModule;

import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

	private RunningModule[] modules = {
		new EventModule()
	};
	
	@Override
	public void onEnable() {
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
