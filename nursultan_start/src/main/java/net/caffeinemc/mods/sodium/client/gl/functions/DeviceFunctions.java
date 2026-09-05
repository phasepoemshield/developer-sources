/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.functions;

import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.gl.functions.BufferStorageFunctions;

public class DeviceFunctions {
    private final BufferStorageFunctions bufferStorageFunctions;

    public DeviceFunctions(RenderDevice renderDevice) {
        this.bufferStorageFunctions = BufferStorageFunctions.pickBest(renderDevice);
    }

    public BufferStorageFunctions getBufferStorageFunctions() {
        return this.bufferStorageFunctions;
    }
}

