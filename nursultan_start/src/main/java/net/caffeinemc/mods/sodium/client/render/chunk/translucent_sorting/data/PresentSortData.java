/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import java.nio.IntBuffer;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;

public interface PresentSortData {
    default public IntBuffer getIntBuffer() {
        return this.getIndexBuffer().getDirectBuffer().asIntBuffer();
    }

    public NativeBuffer getIndexBuffer();
}

