/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import net.caffeinemc.mods.sodium.client.render.chunk.tree.AbstractTraversableBiForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.TraversableTree;

public class TraversableBiForest
extends AbstractTraversableBiForest<TraversableTree> {
    public TraversableBiForest(int n, int n2, int n3, float f) {
        super(n, n2, n3, f);
    }

    @Override
    protected TraversableTree makeTree(int n, int n2, int n3) {
        return new TraversableTree(n, n2, n3);
    }
}

