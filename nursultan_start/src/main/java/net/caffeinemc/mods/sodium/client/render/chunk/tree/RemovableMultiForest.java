/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ReferenceArrayList
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import it.unimi.dsi.fastutil.longs.Long2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.Collection;
import java.util.Comparator;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.BaseMultiForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.RemovableForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.RemovableTree;
import net.caffeinemc.mods.sodium.client.render.viewport.CameraTransform;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;

public class RemovableMultiForest
implements RemovableForest {
    private final Long2ReferenceLinkedOpenHashMap<RemovableTree> trees;
    private final ReferenceArrayList<RemovableTree> treeSortList = new ReferenceArrayList();
    private RemovableTree lastTree;
    private boolean treesAreReady = true;

    public RemovableMultiForest(float f) {
        this.trees = new Long2ReferenceLinkedOpenHashMap(RemovableMultiForest.getCapacity(f));
    }

    @Override
    public void remove(int n, int n2, int n3) {
        this.treesAreReady = false;
        if (this.lastTree != null && this.lastTree.remove(n, n2, n3)) {
            return;
        }
        int n4 = n >> 6;
        int n5 = n2 >> 6;
        int n6 = n3 >> 6;
        long l = class01296.y((int)n4, (int)n5, (int)n6);
        RemovableTree removableTree = (RemovableTree)this.trees.get(l);
        if (removableTree == null) {
            return;
        }
        removableTree.remove(n, n2, n3);
        this.lastTree = removableTree;
    }

    public void remove(RenderSection renderSection) {
        this.remove(renderSection.getChunkX(), renderSection.getChunkY(), renderSection.getChunkZ());
    }

    @Override
    public void add(int n, int n2, int n3) {
        this.treesAreReady = false;
        if (this.lastTree != null && this.lastTree.add(n, n2, n3)) {
            return;
        }
        int n4 = n >> 6;
        int n5 = n2 >> 6;
        int n6 = n3 >> 6;
        long l = class01296.y((int)n4, (int)n5, (int)n6);
        RemovableTree removableTree = (RemovableTree)this.trees.get(l);
        if (removableTree == null) {
            int n7 = n4 << 6;
            int n8 = n5 << 6;
            int n9 = n6 << 6;
            removableTree = new RemovableTree(n7, n8, n9);
            this.trees.put(l, (Object)removableTree);
        }
        removableTree.add(n, n2, n3);
        this.lastTree = removableTree;
    }

    public void ensureCapacity(float f) {
        this.trees.ensureCapacity(RemovableMultiForest.getCapacity(f));
    }

    private static int getCapacity(float f) {
        int n = BaseMultiForest.forestDimFromBuildDistance(f) + 1;
        return n * n * n;
    }

    @Override
    public int getPresence(int n, int n2, int n3) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void prepareForTraversal() {
        if (this.treesAreReady) {
            return;
        }
        ObjectIterator objectIterator = this.trees.values().iterator();
        while (objectIterator.hasNext()) {
            RemovableTree removableTree = (RemovableTree)objectIterator.next();
            removableTree.prepareForTraversal();
            if (!removableTree.isEmpty()) continue;
            objectIterator.remove();
            if (this.lastTree != removableTree) continue;
            this.lastTree = null;
        }
        this.treesAreReady = true;
    }

    @Override
    public void traverse(CoordinateSectionVisitor coordinateSectionVisitor, Viewport viewport, float f) {
        CameraTransform cameraTransform = viewport.getTransform();
        int n = cameraTransform.intX >> 4;
        int n2 = cameraTransform.intY >> 4;
        int n3 = cameraTransform.intZ >> 4;
        this.treeSortList.clear();
        this.treeSortList.ensureCapacity(this.trees.size());
        this.treeSortList.addAll((Collection)this.trees.values());
        for (RemovableTree removableTree : this.treeSortList) {
            removableTree.updateSortKeyFor(n, n2, n3);
        }
        this.treeSortList.unstableSort(Comparator.comparingInt(RemovableTree::getSortKey));
        for (RemovableTree removableTree : this.treeSortList) {
            removableTree.traverse(coordinateSectionVisitor, viewport, 0.0f, 0.0f);
        }
    }
}

