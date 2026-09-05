/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GLCapabilities
 */
package net.caffeinemc.mods.sodium.client.gl.device;

import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.device.GLRenderDevice;
import net.caffeinemc.mods.sodium.client.gl.functions.DeviceFunctions;
import org.lwjgl.opengl.GLCapabilities;

public interface RenderDevice {
    public static final RenderDevice INSTANCE = new GLRenderDevice();

    public GLCapabilities getCapabilities();

    public void makeInactive();

    public CommandList createCommandList();

    public static void enterManagedCode() {
        INSTANCE.makeActive();
    }

    public static void exitManagedCode() {
        INSTANCE.makeInactive();
    }

    public int getSubTexelPrecisionBits();

    public void makeActive();

    public DeviceFunctions getDeviceFunctions();
}

