/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.TraversableTree;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.Tree;

public class RemovableTree
extends TraversableTree {
    private boolean reducedIsValid = true;
    private int sortKey;

    public RemovableTree(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public boolean remove(int n, int n2, int n3) {
        if (Tree.isOutOfBounds(n -= this.offsetX, n2 -= this.offsetY, n3 -= this.offsetZ)) {
            return false;
        }
        int n4 = Tree.interleave6x3(n, n2, n3);
        int n5 = n4 >> 6;
        this.tree[n5] = this.tree[n5] & (1L << (n4 & 0x3F) ^ 0xFFFFFFFFFFFFFFFFL);
        this.reducedIsValid = false;
        return true;
    }

    public boolean isEmpty() {
        return this.treeDoubleReduced == 0L;
    }

    @Override
    public boolean add(int n, int n2, int n3) {
        boolean bl = super.add(n, n2, n3);
        if (bl) {
            this.reducedIsValid = false;
        }
        return bl;
    }

    public int getSortKey() {
        return this.sortKey;
    }

    @Override
    public int getPresence(int n, int n2, int n3) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void updateSortKeyFor(int n, int n2, int n3) {
        int n4 = Math.abs(this.offsetX + 32 - n);
        int n5 = Math.abs(this.offsetY + 32 - n2);
        int n6 = Math.abs(this.offsetZ + 32 - n3);
        this.sortKey = n4 + n5 + n6 + 1;
    }

    @Override
    public void prepareForTraversal() {
        if (!this.reducedIsValid) {
            super.prepareForTraversal();
            this.reducedIsValid = true;
        }
    }

    public long getTreeKey() {
        return class01296.y((int)this.offsetX, (int)this.offsetY, (int)this.offsetZ);
    }
}

