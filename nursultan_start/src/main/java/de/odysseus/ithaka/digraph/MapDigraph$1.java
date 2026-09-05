/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.MapDigraph;
import de.odysseus.ithaka.digraph.MapDigraph$1$1;
import java.util.Iterator;

class MapDigraph$1
implements Iterable<V> {
    final /* synthetic */ MapDigraph this$0;

    MapDigraph$1(MapDigraph mapDigraph) {
        this.this$0 = mapDigraph;
    }

    public String toString() {
        return this.this$0.vertexMap.keySet().toString();
    }

    @Override
    public Iterator<V> iterator() {
        return new MapDigraph$1$1(this);
    }
}

