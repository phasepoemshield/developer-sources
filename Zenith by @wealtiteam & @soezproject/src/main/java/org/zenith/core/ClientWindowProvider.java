package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Interface;


import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;

public interface ClientWindowProvider extends ClientProvider {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   Window val214 = minecraftClient3.getWindow();
}
