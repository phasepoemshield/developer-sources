/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import net.caffeinemc.mods.sodium.client.render.chunk.tree.Forest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.Tree;

public abstract class BaseForest<T extends Tree>
implements Forest {
    protected final int baseOffsetX;
    protected final int baseOffsetY;
    protected final int baseOffsetZ;
    final float buildDistance;

    protected BaseForest(int n, int n2, int n3, float f) {
        this.baseOffsetX = n;
        this.baseOffsetY = n2;
        this.baseOffsetZ = n3;
        this.buildDistance = f;
    }

    protected abstract T makeTree(int var1, int var2, int var3);
}

