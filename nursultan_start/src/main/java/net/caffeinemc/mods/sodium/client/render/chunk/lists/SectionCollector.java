/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  net.caffeinemc.mods.sodium.client.render.chunk.ChunkUpdateTypes
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 *  net.caffeinemc.mods.sodium.client.render.chunk.TaskQueueType
 */
package net.caffeinemc.mods.sodium.client.render.chunk.lists;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayDeque;
import java.util.EnumMap;
import java.util.Map;
import java.util.Queue;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkUpdateTypes;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.TaskQueueType;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderList;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.RenderListProvider;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.RenderSectionVisitor;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion;

public abstract class SectionCollector
implements RenderListProvider,
RenderSectionVisitor {
    private final int frame;
    private final TaskQueueType importantRebuildQueueType;
    private final TaskQueueType importantSortQueueType;
    private final ObjectArrayList<ChunkRenderList> renderLists;
    private final EnumMap<TaskQueueType, ArrayDeque<RenderSection>> sortedTaskLists;
    private boolean needsRevisitForPendingUpdates = false;
    private static int[] sortItems = new int[256];

    @Override
    public void visit(RenderSection renderSection) {
        this.visit(renderSection, renderSection.getFlags());
    }

    private void visit(RenderSection renderSection, int n) {
        int n2;
        ChunkRenderList chunkRenderList;
        if (n != 0) {
            RenderRegion renderRegion = renderSection.getRegion();
            chunkRenderList = renderRegion.getRenderList();
            if (chunkRenderList.getLastVisibleFrame() != this.frame) {
                chunkRenderList.reset(this.frame, this.orderIsSorted());
                this.renderLists.add((Object)chunkRenderList);
            }
            chunkRenderList.add(renderSection.getSectionIndex(), n);
        }
        if ((n2 = renderSection.getPendingUpdate()) != 0) {
            if (renderSection.getRunningJob() != null) {
                this.needsRevisitForPendingUpdates = true;
                return;
            }
            chunkRenderList = ChunkUpdateTypes.getQueueType((int)n2, (TaskQueueType)this.importantRebuildQueueType, (TaskQueueType)this.importantSortQueueType);
            Queue queue = this.sortedTaskLists.get(chunkRenderList);
            if (queue.size() < chunkRenderList.queueSizeLimit()) {
                queue.add(renderSection);
            }
        }
    }

    public SectionCollector(int n, TaskQueueType taskQueueType, TaskQueueType taskQueueType2) {
        this.frame = n;
        this.importantRebuildQueueType = taskQueueType;
        this.importantSortQueueType = taskQueueType2;
        this.renderLists = new ObjectArrayList();
        this.sortedTaskLists = new EnumMap(TaskQueueType.class);
        for (TaskQueueType taskQueueType3 : TaskQueueType.values()) {
            this.sortedTaskLists.put(taskQueueType3, new ArrayDeque());
        }
    }

    @Override
    public boolean needsRevisitForPendingUpdates() {
        return this.needsRevisitForPendingUpdates;
    }

    public void visitWithFlags(RenderSection renderSection, int n) {
        this.visit(renderSection, n);
    }

    @Override
    public Map<TaskQueueType, ArrayDeque<RenderSection>> getTaskLists() {
        return this.sortedTaskLists;
    }

    @Override
    public int[] getCachedSortItems() {
        return sortItems;
    }

    @Override
    public void setCachedSortItems(int[] nArray) {
        sortItems = nArray;
    }

    @Override
    public ObjectArrayList<ChunkRenderList> getUnsortedRenderLists() {
        return this.renderLists;
    }
}

