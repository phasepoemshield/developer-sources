/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBBufferStorage
 */
package net.caffeinemc.mods.sodium.client.gl.functions;

import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferStorageFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferTarget;
import net.caffeinemc.mods.sodium.client.gl.functions.BufferStorageFunctions;
import net.caffeinemc.mods.sodium.client.gl.util.EnumBitField;
import org.lwjgl.opengl.ARBBufferStorage;

final class BufferStorageFunctions$3
extends BufferStorageFunctions {
    @Override
    public void createBufferStorage(GlBufferTarget glBufferTarget, long l, EnumBitField<GlBufferStorageFlags> enumBitField) {
        ARBBufferStorage.glBufferStorage((int)glBufferTarget.getTargetParameter(), (long)l, (int)enumBitField.getBitField());
    }
}

