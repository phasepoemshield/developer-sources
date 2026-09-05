/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.impl.base.toposort;

import java.util.ArrayList;
import java.util.List;

public abstract class SortableNode<N extends SortableNode<N>> {
    protected final List<N> subsequentNodes = new ArrayList<N>();
    protected final List<N> previousNodes = new ArrayList<N>();
    boolean visited = false;

    public void addPreviousNode(N n) {
        this.previousNodes.add(n);
    }

    public void addSubsequentNode(N n) {
        this.subsequentNodes.add(n);
    }

    public static <N extends SortableNode<N>> void link(N n, N n2) {
        if (n == n2) {
            throw new IllegalArgumentException("Cannot link a node to itself!");
        }
        n.addSubsequentNode(n2);
        n2.addPreviousNode(n);
    }

    protected abstract String getDescription();
}

