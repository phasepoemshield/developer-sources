/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrays
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import it.unimi.dsi.fastutil.ints.IntArrays;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.BaseMultiForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.TraversableForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.TraversableTree;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;

public abstract class AbstractTraversableMultiForest<T extends TraversableTree>
extends BaseMultiForest<T>
implements TraversableForest {
    public AbstractTraversableMultiForest(int n, int n2, int n3, float f) {
        super(n, n2, n3, f);
    }

    @Override
    public void prepareForTraversal() {
        for (TraversableTree traversableTree : (TraversableTree[])this.trees) {
            if (traversableTree == null) continue;
            traversableTree.prepareForTraversal();
        }
    }

    @Override
    public void traverse(CoordinateSectionVisitor coordinateSectionVisitor, Viewport viewport, float f) {
        class01296 class012962 = viewport.getChunkCoord();
        int n = class012962.method_10263();
        int n2 = class012962.method_10264();
        int n3 = class012962.method_10260();
        int[] nArray = new int[((TraversableTree[])this.trees).length];
        for (int i = 0; i < ((TraversableTree[])this.trees).length; ++i) {
            TraversableTree traversableTree = ((TraversableTree[])this.trees)[i];
            if (traversableTree == null) continue;
            int n4 = Math.abs(traversableTree.offsetX + 32 - n);
            int n5 = Math.abs(traversableTree.offsetY + 32 - n2);
            int n6 = Math.abs(traversableTree.offsetZ + 32 - n3);
            nArray[i] = n4 + n5 + n6 + 1 << 16 | i;
        }
        IntArrays.unstableSort((int[])nArray);
        for (int n5 : nArray) {
            TraversableTree traversableTree;
            if (n5 == 0 || (traversableTree = ((TraversableTree[])this.trees)[n5 & 0xFFFF]) == null) continue;
            traversableTree.traverse(coordinateSectionVisitor, viewport, f, this.buildDistance);
        }
    }
}

