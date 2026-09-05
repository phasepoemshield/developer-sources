/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.Digraphs;
import de.odysseus.ithaka.digraph.DoubledDigraph;
import de.odysseus.ithaka.digraph.TrivialDigraph$1;
import de.odysseus.ithaka.digraph.TrivialDigraph$2;
import java.util.Collection;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.Set;

public class TrivialDigraph<V>
implements DoubledDigraph<V> {
    V vertex = null;
    private boolean hasLoop = false;
    private int loopWeight = 0;

    @Override
    public Iterable<V> sources(Object object) {
        return this.targets(object);
    }

    @Override
    public boolean remove(V v) {
        if (this.vertex != null && this.vertex.equals(v)) {
            this.vertex = null;
            this.loopWeight = 0;
            this.hasLoop = false;
            return true;
        }
        return false;
    }

    @Override
    public OptionalInt remove(V v, V v2) {
        if (this.contains((Object)v, (Object)v2)) {
            int n = this.loopWeight;
            this.loopWeight = 0;
            this.hasLoop = false;
            return OptionalInt.of(n);
        }
        return OptionalInt.empty();
    }

    @Override
    public OptionalInt get(Object object, Object object2) {
        return this.contains(object, object2) ? OptionalInt.of(this.loopWeight) : OptionalInt.empty();
    }

    @Override
    public OptionalInt put(V v, V v2, int n) {
        if (v != v2) {
            throw new UnsupportedOperationException("TrivialDigraph must not contain no-loop edges!");
        }
        OptionalInt optionalInt = this.hasLoop ? OptionalInt.of(this.loopWeight) : OptionalInt.empty();
        this.add(v);
        this.hasLoop = true;
        this.loopWeight = n;
        return optionalInt;
    }

    @Override
    public DoubledDigraph<V> reverse() {
        return this;
    }

    @Override
    public boolean add(V v) {
        if (v == null) {
            throw new IllegalArgumentException("Cannot add null vertex!");
        }
        if (this.vertex == null) {
            this.vertex = v;
            return true;
        }
        if (this.vertex.equals(v)) {
            return false;
        }
        throw new UnsupportedOperationException("TrivialDigraph must contain at most one vertex!");
    }

    @Override
    public boolean contains(Object object, Object object2) {
        return this.vertex != null && this.hasLoop && this.vertex.equals(object) && this.vertex.equals(object2);
    }

    @Override
    public boolean contains(Object object) {
        return this.vertex != null && this.vertex.equals(object);
    }

    @Override
    public Iterable<V> targets(Object object) {
        if (!this.hasLoop || this.vertex == null || !this.vertex.equals(object)) {
            return Collections.emptyList();
        }
        return new TrivialDigraph$2(this);
    }

    @Override
    public void removeAll(Collection<V> collection) {
        if (collection.contains(this.vertex)) {
            this.remove(this.vertex);
        }
    }

    @Override
    public int getEdgeCount() {
        return this.hasLoop ? 1 : 0;
    }

    @Override
    public int getOutDegree(Object object) {
        return this.hasLoop ? 1 : 0;
    }

    @Override
    public int getVertexCount() {
        return this.vertex == null ? 0 : 1;
    }

    @Override
    public int getInDegree(Object object) {
        return this.hasLoop ? 1 : 0;
    }

    @Override
    public Digraph<V> subgraph(Set<V> set) {
        return this.vertex != null && set.contains(this.vertex) ? this : Digraphs.emptyDigraph();
    }

    @Override
    public boolean isAcyclic() {
        return !this.hasLoop;
    }

    @Override
    public Iterable<V> vertices() {
        if (this.vertex == null) {
            return Collections.emptyList();
        }
        return new TrivialDigraph$1(this);
    }

    @Override
    public int totalWeight() {
        return this.hasLoop ? this.loopWeight : 0;
    }
}

