/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.MapDigraph$1;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Iterator;

class MapDigraph$1$1
implements Iterator<V> {
    private final Iterator<V> delegate;
    V vertex;
    final /* synthetic */ MapDigraph$1 this$1;

    MapDigraph$1$1(MapDigraph$1 mapDigraph$1) {
        this.this$1 = mapDigraph$1;
        this.delegate = this.this$1.this$0.vertexMap.keySet().iterator();
        this.vertex = null;
    }

    @Override
    public void remove() {
        Object2IntMap object2IntMap = this.this$1.this$0.vertexMap.get(this.vertex);
        this.delegate.remove();
        this.this$1.this$0.edgeCount -= object2IntMap.size();
        for (Object v : this.this$1.this$0.vertexMap.keySet()) {
            this.this$1.this$0.remove(v, this.vertex);
        }
    }

    @Override
    public boolean hasNext() {
        return this.delegate.hasNext();
    }

    @Override
    public V next() {
        this.vertex = this.delegate.next();
        return this.vertex;
    }
}

