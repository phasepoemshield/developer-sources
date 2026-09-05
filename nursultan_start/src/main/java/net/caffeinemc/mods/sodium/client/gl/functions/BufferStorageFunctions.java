/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GLCapabilities
 */
package net.caffeinemc.mods.sodium.client.gl.functions;

import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferStorageFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferTarget;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.gl.functions.BufferStorageFunctions$1;
import net.caffeinemc.mods.sodium.client.gl.functions.BufferStorageFunctions$2;
import net.caffeinemc.mods.sodium.client.gl.functions.BufferStorageFunctions$3;
import net.caffeinemc.mods.sodium.client.gl.util.EnumBitField;
import org.lwjgl.opengl.GLCapabilities;

public abstract sealed class BufferStorageFunctions
extends Enum<BufferStorageFunctions>
permits BufferStorageFunctions$1, BufferStorageFunctions$2, BufferStorageFunctions$3 {
    public static final /* enum */ BufferStorageFunctions NONE = new BufferStorageFunctions$1();
    public static final /* enum */ BufferStorageFunctions CORE = new BufferStorageFunctions$2();
    public static final /* enum */ BufferStorageFunctions ARB = new BufferStorageFunctions$3();
    private static final /* synthetic */ BufferStorageFunctions[] $VALUES;

    public static BufferStorageFunctions[] values() {
        return (BufferStorageFunctions[])$VALUES.clone();
    }

    public static BufferStorageFunctions valueOf(String string) {
        return Enum.valueOf(BufferStorageFunctions.class, string);
    }

    private static /* synthetic */ BufferStorageFunctions[] $values() {
        return new BufferStorageFunctions[]{NONE, CORE, ARB};
    }

    public abstract void createBufferStorage(GlBufferTarget var1, long var2, EnumBitField<GlBufferStorageFlags> var4);

    public static BufferStorageFunctions pickBest(RenderDevice renderDevice) {
        GLCapabilities gLCapabilities = renderDevice.getCapabilities();
        if (gLCapabilities.OpenGL44) {
            return CORE;
        }
        if (gLCapabilities.GL_ARB_buffer_storage) {
            return ARB;
        }
        return NONE;
    }

    static {
        $VALUES = BufferStorageFunctions.$values();
    }
}

