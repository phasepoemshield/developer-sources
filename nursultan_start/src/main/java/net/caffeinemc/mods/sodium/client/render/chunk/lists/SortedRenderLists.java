/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  net.caffeinemc.mods.sodium.client.util.iterator.ReversibleObjectArrayIterator
 */
package net.caffeinemc.mods.sodium.client.render.chunk.lists;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderList;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderListIterable;
import net.caffeinemc.mods.sodium.client.util.iterator.ReversibleObjectArrayIterator;

public class SortedRenderLists
implements ChunkRenderListIterable {
    private static final SortedRenderLists EMPTY = new SortedRenderLists((ObjectArrayList<ChunkRenderList>)ObjectArrayList.of());
    private final ObjectArrayList<ChunkRenderList> lists;

    SortedRenderLists(ObjectArrayList<ChunkRenderList> objectArrayList) {
        this.lists = objectArrayList;
    }

    public ReversibleObjectArrayIterator<ChunkRenderList> iterator(boolean bl) {
        return new ReversibleObjectArrayIterator(this.lists, bl);
    }

    public static SortedRenderLists empty() {
        return EMPTY;
    }
}

