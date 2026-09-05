/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.impl.base.toposort;

import java.util.ArrayList;
import java.util.List;
import net.fabricmc.fabric.impl.base.toposort.SortableNode;

class NodeSorting$NodeScc<N extends SortableNode<N>> {
    final List<N> nodes;
    final List<NodeSorting$NodeScc<N>> subsequentSccs = new ArrayList<NodeSorting$NodeScc<N>>();
    int inDegree = 0;

    NodeSorting$NodeScc(List<N> list) {
        this.nodes = list;
    }
}

