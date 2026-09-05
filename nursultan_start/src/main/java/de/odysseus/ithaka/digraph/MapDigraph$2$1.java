/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.MapDigraph;
import de.odysseus.ithaka.digraph.MapDigraph$2;
import java.util.Iterator;

class MapDigraph$2$1
implements Iterator<V> {
    private final Iterator<V> delegate;
    final /* synthetic */ MapDigraph$2 this$1;

    MapDigraph$2$1(MapDigraph$2 mapDigraph$2) {
        this.this$1 = mapDigraph$2;
        this.delegate = this.this$1.val$edgeMap.keySet().iterator();
    }

    @Override
    public void remove() {
        this.delegate.remove();
        --this.this$1.this$0.edgeCount;
        if (this.this$1.val$edgeMap.isEmpty()) {
            this.this$1.this$0.vertexMap.put(this.this$1.val$source, MapDigraph.createEmptyMap());
        }
    }

    @Override
    public boolean hasNext() {
        return this.delegate.hasNext();
    }

    @Override
    public V next() {
        return this.delegate.next();
    }
}

