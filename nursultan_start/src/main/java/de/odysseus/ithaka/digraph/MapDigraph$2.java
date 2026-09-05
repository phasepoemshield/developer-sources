/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.MapDigraph;
import de.odysseus.ithaka.digraph.MapDigraph$2$1;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Iterator;

class MapDigraph$2
implements Iterable<V> {
    final /* synthetic */ Object2IntMap val$edgeMap;
    final /* synthetic */ Object val$source;
    final /* synthetic */ MapDigraph this$0;

    MapDigraph$2(MapDigraph mapDigraph, Object2IntMap object2IntMap, Object object) {
        this.this$0 = mapDigraph;
        this.val$edgeMap = object2IntMap;
        this.val$source = object;
    }

    public String toString() {
        return this.val$edgeMap.keySet().toString();
    }

    @Override
    public Iterator<V> iterator() {
        return new MapDigraph$2$1(this);
    }
}

