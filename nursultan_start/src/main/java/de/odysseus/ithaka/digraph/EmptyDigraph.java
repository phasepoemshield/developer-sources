/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.DoubledDigraph;
import java.util.Collection;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.Set;

class EmptyDigraph<V>
implements DoubledDigraph<V> {
    @Override
    public Iterable<V> sources(Object object) {
        return Collections.emptyList();
    }

    EmptyDigraph() {
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public OptionalInt remove(V v, V v2) {
        return OptionalInt.empty();
    }

    @Override
    public OptionalInt get(Object object, Object object2) {
        return OptionalInt.empty();
    }

    @Override
    public OptionalInt put(V v, V v2, int n) {
        throw new UnsupportedOperationException("Empty de.odysseus.ithaka.digraph cannot have edges!");
    }

    @Override
    public DoubledDigraph<V> reverse() {
        return this;
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException("Empty de.odysseus.ithaka.digraph cannot have vertices!");
    }

    @Override
    public boolean contains(Object object, Object object2) {
        return false;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public Iterable<V> targets(Object object) {
        return Collections.emptyList();
    }

    @Override
    public void removeAll(Collection<V> collection) {
    }

    @Override
    public int getEdgeCount() {
        return 0;
    }

    @Override
    public int getOutDegree(Object object) {
        return 0;
    }

    @Override
    public int getVertexCount() {
        return 0;
    }

    @Override
    public int getInDegree(Object object) {
        return 0;
    }

    @Override
    public Digraph<V> subgraph(Set<V> set) {
        return this;
    }

    @Override
    public boolean isAcyclic() {
        return true;
    }

    @Override
    public Iterable<V> vertices() {
        return Collections.emptyList();
    }

    @Override
    public int totalWeight() {
        return 0;
    }
}

