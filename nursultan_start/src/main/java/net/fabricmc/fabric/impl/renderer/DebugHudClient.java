/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class06134
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.renderer;

import minecraft.class01285;
import minecraft.class01894;
import minecraft.class06134;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.renderer.DebugHudClient$ActiveRendererDebugHudEntry;

@Environment(value=EnvType.CLIENT)
public class DebugHudClient
implements ClientModInitializer {
    public static class01894 ACTIVE_RENDERER = class06134.N((class01894)class01894.N((String)"fabric", (String)"active_renderer"), (class01285)new DebugHudClient$ActiveRendererDebugHudEntry());

    public void onInitializeClient() {
    }
}

