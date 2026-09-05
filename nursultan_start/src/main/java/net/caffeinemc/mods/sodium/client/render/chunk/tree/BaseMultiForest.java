/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import net.caffeinemc.mods.sodium.client.render.chunk.tree.BaseForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.Tree;

public abstract class BaseMultiForest<T extends Tree>
extends BaseForest<T> {
    protected final T[] trees;
    protected final int forestDim;
    protected T lastTree;

    public BaseMultiForest(int n, int n2, int n3, float f) {
        super(n, n2, n3, f);
        this.forestDim = BaseMultiForest.forestDimFromBuildDistance(f);
        this.trees = this.makeTrees(this.forestDim * this.forestDim * this.forestDim);
    }

    @Override
    public void add(int n, int n2, int n3) {
        if (this.lastTree != null && ((Tree)this.lastTree).add(n, n2, n3)) {
            return;
        }
        int n4 = n - this.baseOffsetX;
        int n5 = n2 - this.baseOffsetY;
        int n6 = n3 - this.baseOffsetZ;
        int n7 = this.getTreeIndex(n4, n5, n6);
        if (n7 == -1) {
            return;
        }
        T t = this.trees[n7];
        if (t == null) {
            int n8 = this.baseOffsetX + (n4 & 0xFFFFFFC0);
            int n9 = this.baseOffsetY + (n5 & 0xFFFFFFC0);
            int n10 = this.baseOffsetZ + (n6 & 0xFFFFFFC0);
            this.trees[n7] = t = this.makeTree(n8, n9, n10);
        }
        ((Tree)t).add(n, n2, n3);
        this.lastTree = t;
    }

    @Override
    public int getPresence(int n, int n2, int n3) {
        int n4;
        if (this.lastTree != null && (n4 = ((Tree)this.lastTree).getPresence(n, n2, n3)) != -1) {
            return n4;
        }
        n4 = n - this.baseOffsetX;
        int n5 = n2 - this.baseOffsetY;
        int n6 = n3 - this.baseOffsetZ;
        int n7 = this.getTreeIndex(n4, n5, n6);
        if (n7 == -1) {
            return -1;
        }
        T t = this.trees[n7];
        if (t != null) {
            this.lastTree = t;
            return ((Tree)t).getPresence(n, n2, n3);
        }
        return -1;
    }

    protected int getTreeIndex(int n, int n2, int n3) {
        int n4 = n >> 6;
        int n5 = n2 >> 6;
        int n6 = n3 >> 6;
        if (n4 < 0 || n4 >= this.forestDim || n5 < 0 || n5 >= this.forestDim || n6 < 0 || n6 >= this.forestDim) {
            return -1;
        }
        return n4 + (n6 * this.forestDim + n5) * this.forestDim;
    }

    public static int forestDimFromBuildDistance(float f) {
        return (int)Math.ceil(((double)f / 8.0 + 1.0) / 64.0);
    }

    protected abstract T[] makeTrees(int var1);
}

