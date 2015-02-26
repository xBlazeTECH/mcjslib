package io.lansing.mcjslib;

import org.bukkit.plugin.Plugin;

public abstract class RunningModule {
	public abstract void onEnable(Plugin p);
	public abstract void onDisable(Plugin p);
	public abstract void onLoad(Plugin p);
}
