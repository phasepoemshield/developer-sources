/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrays
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 *  net.caffeinemc.mods.sodium.client.render.chunk.TaskQueueType
 *  net.caffeinemc.mods.sodium.client.render.viewport.Viewport
 */
package net.caffeinemc.mods.sodium.client.render.chunk.lists;

import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayDeque;
import java.util.Map;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.TaskQueueType;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderList;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.SortItemsProvider;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.SortedRenderLists;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;

public interface RenderListProvider
extends SortItemsProvider {
    public boolean needsRevisitForPendingUpdates();

    default public SortedRenderLists createRenderLists(Viewport viewport) {
        int n;
        class01296 class012962 = viewport.getChunkCoord();
        ObjectArrayList<ChunkRenderList> objectArrayList = this.getUnsortedRenderLists();
        int n2 = class012962.method_10263() >> RenderRegion.REGION_WIDTH_SH;
        int n3 = class012962.method_10264() >> RenderRegion.REGION_HEIGHT_SH;
        int n4 = class012962.method_10260() >> RenderRegion.REGION_LENGTH_SH;
        int n5 = objectArrayList.size();
        int[] nArray = this.ensureSortItemsOfLength(n5);
        for (int i = 0; i < n5; ++i) {
            RenderRegion renderRegion = ((ChunkRenderList)objectArrayList.get(i)).getRegion();
            n = Math.abs(renderRegion.getX() - n2);
            int n6 = Math.abs(renderRegion.getY() - n3);
            int n7 = Math.abs(renderRegion.getZ() - n4);
            nArray[i] = n + n6 + n7 << 16 | i;
        }
        IntArrays.unstableSort((int[])nArray, (int)0, (int)n5);
        ObjectArrayList objectArrayList2 = new ObjectArrayList(n5);
        for (int i = 0; i < n5; ++i) {
            n = nArray[i];
            ChunkRenderList chunkRenderList = (ChunkRenderList)objectArrayList.get(n & 0xFFFF);
            objectArrayList2.add((Object)chunkRenderList);
        }
        for (ChunkRenderList chunkRenderList : objectArrayList2) {
            chunkRenderList.prepareForRender(class012962, this);
        }
        return new SortedRenderLists((ObjectArrayList<ChunkRenderList>)objectArrayList2);
    }

    public Map<TaskQueueType, ArrayDeque<RenderSection>> getTaskLists();

    public boolean orderIsSorted();

    public ObjectArrayList<ChunkRenderList> getUnsortedRenderLists();
}

