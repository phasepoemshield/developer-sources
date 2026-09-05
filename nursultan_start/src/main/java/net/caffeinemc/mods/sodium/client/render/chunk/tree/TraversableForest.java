/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07299
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import minecraft.class07299;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.BaseBiForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.Forest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.TraversableBiForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.TraversableMultiForest;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;

public interface TraversableForest
extends Forest {
    public void prepareForTraversal();

    public void traverse(CoordinateSectionVisitor var1, Viewport var2, float var3);

    public static TraversableForest createTraversableForest(int n, int n2, int n3, float f, class07299 class072992) {
        if (BaseBiForest.checkApplicable(f, class072992)) {
            return new TraversableBiForest(n, n2, n3, f);
        }
        return new TraversableMultiForest(n, n2, n3, f);
    }
}

