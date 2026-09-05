/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07299
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import minecraft.class07299;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.BaseForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.Tree;

public abstract class BaseBiForest<T extends Tree>
extends BaseForest<T> {
    private static final int SECONDARY_TREE_OFFSET_XZ = 4;
    private static final int MAX_BUILD_DISTANCE = 520;
    protected final T mainTree;
    protected T secondaryTree;

    public BaseBiForest(int n, int n2, int n3, float f) {
        super(n, n2, n3, f);
        this.mainTree = this.makeTree(this.baseOffsetX, this.baseOffsetY, this.baseOffsetZ);
    }

    @Override
    public void add(int n, int n2, int n3) {
        if (((Tree)this.mainTree).add(n, n2, n3)) {
            return;
        }
        if (this.secondaryTree == null) {
            this.secondaryTree = this.makeSecondaryTree();
        }
        ((Tree)this.secondaryTree).add(n, n2, n3);
    }

    protected T makeSecondaryTree() {
        return this.makeTree(this.baseOffsetX + 4, this.baseOffsetY, this.baseOffsetZ + 4);
    }

    @Override
    public int getPresence(int n, int n2, int n3) {
        int n4 = ((Tree)this.mainTree).getPresence(n, n2, n3);
        if (n4 != -1) {
            return n4;
        }
        if (this.secondaryTree != null) {
            return ((Tree)this.secondaryTree).getPresence(n, n2, n3);
        }
        return -1;
    }

    public static boolean checkApplicable(float f, class07299 class072992) {
        int n = (int)Math.ceil(f);
        if (n > 520) {
            return false;
        }
        return class072992.method_31605() >> 4 <= 64;
    }
}

