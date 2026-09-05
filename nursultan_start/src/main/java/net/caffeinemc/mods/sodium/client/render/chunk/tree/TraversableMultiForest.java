/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import net.caffeinemc.mods.sodium.client.render.chunk.tree.AbstractTraversableMultiForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.TraversableTree;

public class TraversableMultiForest
extends AbstractTraversableMultiForest<TraversableTree> {
    public TraversableMultiForest(int n, int n2, int n3, float f) {
        super(n, n2, n3, f);
    }

    @Override
    protected TraversableTree makeTree(int n, int n2, int n3) {
        return new TraversableTree(n, n2, n3);
    }

    protected TraversableTree[] makeTrees(int n) {
        return new TraversableTree[n];
    }
}

