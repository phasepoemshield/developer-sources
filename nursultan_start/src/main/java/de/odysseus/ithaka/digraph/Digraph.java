/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.EdgeWeights;
import java.util.Collection;
import java.util.OptionalInt;
import java.util.Set;

public interface Digraph<V>
extends EdgeWeights<V> {
    public boolean remove(V var1);

    public OptionalInt remove(V var1, V var2);

    @Override
    public OptionalInt get(V var1, V var2);

    public OptionalInt put(V var1, V var2, int var3);

    public Digraph<V> reverse();

    public boolean add(V var1);

    public boolean contains(V var1, V var2);

    public boolean contains(V var1);

    public Iterable<V> targets(V var1);

    public void removeAll(Collection<V> var1);

    public int getEdgeCount();

    public int getOutDegree(V var1);

    public int getVertexCount();

    public Digraph<V> subgraph(Set<V> var1);

    public boolean isAcyclic();

    public Iterable<V> vertices();

    public int totalWeight();
}

