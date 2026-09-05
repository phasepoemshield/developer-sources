/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 */
package de.odysseus.ithaka.digraph;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;

public interface MapDigraph$VertexMapFactory<V> {
    public Map<V, Object2IntMap<V>> create();
}

