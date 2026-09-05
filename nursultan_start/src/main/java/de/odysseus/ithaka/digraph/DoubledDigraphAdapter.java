/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.DigraphAdapter;
import de.odysseus.ithaka.digraph.DigraphFactory;
import de.odysseus.ithaka.digraph.DoubledDigraph;
import de.odysseus.ithaka.digraph.DoubledDigraphAdapter$1;
import de.odysseus.ithaka.digraph.DoubledDigraphAdapter$2;
import de.odysseus.ithaka.digraph.MapDigraph;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.OptionalInt;

public class DoubledDigraphAdapter<V>
extends DigraphAdapter<V>
implements DoubledDigraph<V> {
    final DoubledDigraphAdapter<V> reverse;
    private final DigraphFactory<? extends Digraph<V>> factory;

    @Override
    public Iterable<V> sources(V v) {
        return this.reverse.targets(v);
    }

    public DoubledDigraphAdapter() {
        this(MapDigraph.getDefaultDigraphFactory());
    }

    protected DoubledDigraphAdapter(DigraphFactory<? extends Digraph<V>> digraphFactory, DoubledDigraphAdapter<V> doubledDigraphAdapter) {
        super(digraphFactory.create());
        this.factory = digraphFactory;
        this.reverse = doubledDigraphAdapter;
    }

    public DoubledDigraphAdapter(DigraphFactory<? extends Digraph<V>> digraphFactory) {
        super(digraphFactory.create());
        this.factory = digraphFactory;
        this.reverse = this.createReverse();
    }

    @Override
    public final OptionalInt remove(V v, V v2) {
        this.reverse.remove0(v2, v);
        return this.remove0(v, v2);
    }

    @Override
    public final boolean remove(V v) {
        this.reverse.remove0(v);
        return this.remove0(v);
    }

    @Override
    public final OptionalInt put(V v, V v2, int n) {
        this.reverse.put0(v2, v, n);
        return this.put0(v, v2, n);
    }

    @Override
    public final DoubledDigraphAdapter<V> reverse() {
        return this.reverse;
    }

    @Override
    public final boolean add(V v) {
        this.reverse.add0(v);
        return this.add0(v);
    }

    @Override
    public Iterable<V> targets(V v) {
        Iterator<V> iterator = super.targets(v).iterator();
        if (!iterator.hasNext()) {
            return Collections.emptySet();
        }
        return new DoubledDigraphAdapter$2(this, iterator, v);
    }

    @Override
    public void removeAll(Collection<V> collection) {
        this.reverse.removeAll0(collection);
        this.removeAll0(collection);
    }

    protected OptionalInt remove0(V v, V v2) {
        return super.remove(v, v2);
    }

    protected boolean remove0(V v) {
        return super.remove(v);
    }

    protected OptionalInt put0(V v, V v2, int n) {
        return super.put(v, v2, n);
    }

    protected DoubledDigraphAdapter<V> createReverse() {
        return new DoubledDigraphAdapter<V>(this.factory, this);
    }

    public static <V> DigraphFactory<DoubledDigraphAdapter<V>> getAdapterFactory(DigraphFactory<? extends Digraph<V>> digraphFactory) {
        return () -> new DoubledDigraphAdapter(digraphFactory);
    }

    protected DigraphFactory<? extends DoubledDigraph<V>> getDigraphFactory() {
        return DoubledDigraphAdapter.getAdapterFactory(this.factory);
    }

    protected DigraphFactory<? extends Digraph<V>> getDelegateFactory() {
        return this.factory;
    }

    @Override
    public int getInDegree(V v) {
        return this.reverse.getOutDegree(v);
    }

    protected void removeAll0(Collection<V> collection) {
        super.removeAll(collection);
    }

    protected boolean add0(V v) {
        return super.add(v);
    }

    static /* synthetic */ Iterable access$001(DoubledDigraphAdapter doubledDigraphAdapter) {
        return super.vertices();
    }

    static /* synthetic */ Iterable access$101(DoubledDigraphAdapter doubledDigraphAdapter, Object object) {
        return super.targets(object);
    }

    @Override
    public Iterable<V> vertices() {
        Iterator iterator = super.vertices().iterator();
        if (!iterator.hasNext()) {
            return Collections.emptySet();
        }
        return new DoubledDigraphAdapter$1(this, iterator);
    }
}

