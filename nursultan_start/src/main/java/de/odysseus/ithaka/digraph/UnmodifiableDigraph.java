/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.DigraphAdapter;
import java.util.Collection;
import java.util.OptionalInt;

public class UnmodifiableDigraph<V>
extends DigraphAdapter<V> {
    public UnmodifiableDigraph(Digraph<V> digraph) {
        super(digraph);
    }

    @Override
    public final OptionalInt remove(V v, V v2) {
        throw new UnsupportedOperationException("This de.odysseus.ithaka.digraph is readonly!");
    }

    @Override
    public final boolean remove(V v) {
        throw new UnsupportedOperationException("This de.odysseus.ithaka.digraph is readonly!");
    }

    @Override
    public final OptionalInt put(V v, V v2, int n) {
        throw new UnsupportedOperationException("This de.odysseus.ithaka.digraph is readonly!");
    }

    @Override
    public final boolean add(V v) {
        throw new UnsupportedOperationException("This de.odysseus.ithaka.digraph is readonly!");
    }

    @Override
    public final void removeAll(Collection<V> collection) {
        throw new UnsupportedOperationException("This de.odysseus.ithaka.digraph is readonly!");
    }
}

