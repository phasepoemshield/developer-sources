/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.BaseBiForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.TraversableForest;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.TraversableTree;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;

public abstract class AbstractTraversableBiForest<T extends TraversableTree>
extends BaseBiForest<T>
implements TraversableForest {
    public AbstractTraversableBiForest(int n, int n2, int n3, float f) {
        super(n, n2, n3, f);
    }

    @Override
    public void prepareForTraversal() {
        ((TraversableTree)this.mainTree).prepareForTraversal();
        if (this.secondaryTree != null) {
            ((TraversableTree)this.secondaryTree).prepareForTraversal();
        }
    }

    @Override
    public void traverse(CoordinateSectionVisitor coordinateSectionVisitor, Viewport viewport, float f) {
        ((TraversableTree)this.mainTree).traverse(coordinateSectionVisitor, viewport, f, this.buildDistance);
        if (this.secondaryTree != null) {
            ((TraversableTree)this.secondaryTree).traverse(coordinateSectionVisitor, viewport, f, this.buildDistance);
        }
    }
}

