/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.Digraph;
import java.util.Collection;
import java.util.OptionalInt;
import java.util.Set;

public abstract class DigraphAdapter<V>
implements Digraph<V> {
    private final Digraph<V> delegate;

    public DigraphAdapter(Digraph<V> digraph) {
        this.delegate = digraph;
    }

    @Override
    public OptionalInt remove(V v, V v2) {
        return this.delegate.remove(v, v2);
    }

    @Override
    public boolean remove(V v) {
        return this.delegate.remove(v);
    }

    @Override
    public OptionalInt get(V v, V v2) {
        return this.delegate.get(v, v2);
    }

    @Override
    public OptionalInt put(V v, V v2, int n) {
        return this.delegate.put(v, v2, n);
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        return this.delegate.equals(((DigraphAdapter)object).delegate);
    }

    public String toString() {
        return this.delegate.toString();
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override
    public Digraph<V> reverse() {
        return this.delegate.reverse();
    }

    @Override
    public boolean add(V v) {
        return this.delegate.add(v);
    }

    @Override
    public boolean contains(V v) {
        return this.delegate.contains(v);
    }

    @Override
    public boolean contains(V v, V v2) {
        return this.delegate.contains(v, v2);
    }

    @Override
    public Iterable<V> targets(V v) {
        return this.delegate.targets(v);
    }

    @Override
    public void removeAll(Collection<V> collection) {
        this.delegate.removeAll(collection);
    }

    @Override
    public int getEdgeCount() {
        return this.delegate.getEdgeCount();
    }

    @Override
    public int getOutDegree(V v) {
        return this.delegate.getOutDegree(v);
    }

    @Override
    public int getVertexCount() {
        return this.delegate.getVertexCount();
    }

    @Override
    public Digraph<V> subgraph(Set<V> set) {
        return this.delegate.subgraph(set);
    }

    @Override
    public boolean isAcyclic() {
        return this.delegate.isAcyclic();
    }

    @Override
    public Iterable<V> vertices() {
        return this.delegate.vertices();
    }

    @Override
    public int totalWeight() {
        return this.delegate.totalWeight();
    }
}

