/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.lists;

import java.util.Iterator;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderList;

public interface ChunkRenderListIterable {
    public Iterator<ChunkRenderList> iterator(boolean var1);

    default public Iterator<ChunkRenderList> iterator() {
        return this.iterator(false);
    }
}

