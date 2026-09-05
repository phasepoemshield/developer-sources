/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL44C
 */
package net.caffeinemc.mods.sodium.client.gl.functions;

import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferStorageFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferTarget;
import net.caffeinemc.mods.sodium.client.gl.functions.BufferStorageFunctions;
import net.caffeinemc.mods.sodium.client.gl.util.EnumBitField;
import org.lwjgl.opengl.GL44C;

final class BufferStorageFunctions$2
extends BufferStorageFunctions {
    @Override
    public void createBufferStorage(GlBufferTarget glBufferTarget, long l, EnumBitField<GlBufferStorageFlags> enumBitField) {
        GL44C.glBufferStorage((int)glBufferTarget.getTargetParameter(), (long)l, (int)enumBitField.getBitField());
    }
}

