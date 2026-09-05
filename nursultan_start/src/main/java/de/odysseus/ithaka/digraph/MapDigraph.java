/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntAVLTreeMap
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.DigraphFactory;
import de.odysseus.ithaka.digraph.Digraphs;
import de.odysseus.ithaka.digraph.MapDigraph$1;
import de.odysseus.ithaka.digraph.MapDigraph$2;
import de.odysseus.ithaka.digraph.MapDigraph$EdgeMapFactory;
import de.odysseus.ithaka.digraph.MapDigraph$VertexMapFactory;
import it.unimi.dsi.fastutil.objects.Object2IntAVLTreeMap;
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeMap;

public class MapDigraph<V>
implements Digraph<V> {
    private static final int INVALID_WEIGHT = Integer.MIN_VALUE;
    private final MapDigraph$VertexMapFactory<V> vertexMapFactory;
    private final MapDigraph$EdgeMapFactory<V> edgeMapFactory;
    final Map<V, Object2IntMap<V>> vertexMap;
    int edgeCount;

    public MapDigraph(MapDigraph$VertexMapFactory<V> mapDigraph$VertexMapFactory, MapDigraph$EdgeMapFactory<V> mapDigraph$EdgeMapFactory) {
        this.vertexMapFactory = mapDigraph$VertexMapFactory;
        this.edgeMapFactory = mapDigraph$EdgeMapFactory;
        this.vertexMap = mapDigraph$VertexMapFactory.create();
    }

    public MapDigraph(Comparator<? super V> comparator, Comparator<? super V> comparator2) {
        this(MapDigraph.getDefaultVertexMapFactory(comparator), MapDigraph.getDefaultEdgeMapFactory(comparator2));
    }

    public MapDigraph(Comparator<? super V> comparator) {
        this(comparator, comparator);
    }

    public MapDigraph() {
        this(null);
    }

    @Override
    public OptionalInt remove(V v, V v2) {
        Object2IntMap<V> object2IntMap = this.vertexMap.get(v);
        if (object2IntMap == null || !object2IntMap.containsKey(v2)) {
            return OptionalInt.empty();
        }
        int n = object2IntMap.removeInt(v2);
        --this.edgeCount;
        if (object2IntMap.isEmpty()) {
            this.vertexMap.put((Object2IntMap<V>)v, (Object2IntMap<Object2IntMap<V>>)MapDigraph.createEmptyMap());
        }
        return n == Integer.MIN_VALUE ? OptionalInt.empty() : OptionalInt.of(n);
    }

    @Override
    public boolean remove(V v) {
        Object2IntMap<V> object2IntMap = this.vertexMap.get(v);
        if (object2IntMap == null) {
            return false;
        }
        this.edgeCount -= object2IntMap.size();
        this.vertexMap.remove(v);
        for (V v2 : this.vertexMap.keySet()) {
            this.remove(v2, v);
        }
        return true;
    }

    @Override
    public OptionalInt get(V v, V v2) {
        Object2IntMap<V> object2IntMap = this.vertexMap.get(v);
        if (object2IntMap == null || object2IntMap.isEmpty()) {
            return OptionalInt.empty();
        }
        int n = object2IntMap.getInt(v2);
        return n == Integer.MIN_VALUE ? OptionalInt.empty() : OptionalInt.of(n);
    }

    @Override
    public OptionalInt put(V v, V v2, int n) {
        OptionalInt optionalInt;
        int n2;
        if (n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Invalid weight " + n);
        }
        Object2IntMap<V> object2IntMap = this.vertexMap.get(v);
        if (object2IntMap == null || object2IntMap.isEmpty()) {
            object2IntMap = this.edgeMapFactory.create(v);
            this.vertexMap.put((Object2IntMap<V>)v, (Object2IntMap<Object2IntMap<V>>)object2IntMap);
        }
        if ((n2 = object2IntMap.put(v2, n)) != Integer.MIN_VALUE) {
            optionalInt = OptionalInt.of(n2);
        } else {
            optionalInt = OptionalInt.empty();
            this.add(v2);
            ++this.edgeCount;
        }
        return optionalInt;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1));
        stringBuilder.append("(");
        Iterator<V> iterator = this.vertices().iterator();
        while (iterator.hasNext()) {
            V v = iterator.next();
            stringBuilder.append(v);
            stringBuilder.append(this.targets(v));
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
            if (stringBuilder.length() <= 1000) continue;
            stringBuilder.append("...");
            break;
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @Override
    public MapDigraph<V> reverse() {
        return Digraphs.reverse(this, this.getDigraphFactory());
    }

    @Override
    public boolean add(V v) {
        if (!this.vertexMap.containsKey(v)) {
            this.vertexMap.put((Object2IntMap<V>)v, (Object2IntMap<Object2IntMap<V>>)MapDigraph.createEmptyMap());
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(V v, V v2) {
        Object2IntMap<V> object2IntMap = this.vertexMap.get(v);
        if (object2IntMap == null || object2IntMap.isEmpty()) {
            return false;
        }
        return object2IntMap.containsKey(v2);
    }

    @Override
    public boolean contains(V v) {
        return this.vertexMap.containsKey(v);
    }

    @Override
    public Iterable<V> targets(V v) {
        Object2IntMap<V> object2IntMap = this.vertexMap.get(v);
        if (object2IntMap == null || object2IntMap.isEmpty()) {
            return Collections.emptySet();
        }
        return new MapDigraph$2(this, object2IntMap, v);
    }

    @Override
    public void removeAll(Collection<V> collection) {
        Object2IntMap<V> object2IntMap;
        for (V v : collection) {
            object2IntMap = this.vertexMap.get(v);
            if (object2IntMap == null) continue;
            this.edgeCount -= object2IntMap.size();
            this.vertexMap.remove(v);
        }
        for (V v : this.vertexMap.keySet()) {
            object2IntMap = this.vertexMap.get(v);
            ObjectIterator objectIterator = object2IntMap.keySet().iterator();
            while (objectIterator.hasNext()) {
                if (!collection.contains(objectIterator.next())) continue;
                objectIterator.remove();
                --this.edgeCount;
            }
            if (!object2IntMap.isEmpty()) continue;
            this.vertexMap.put((Object2IntMap<V>)v, (Object2IntMap<Object2IntMap<V>>)MapDigraph.createEmptyMap());
        }
    }

    public static <V> DigraphFactory<MapDigraph<V>> getMapDigraphFactory(MapDigraph$VertexMapFactory<V> mapDigraph$VertexMapFactory, MapDigraph$EdgeMapFactory<V> mapDigraph$EdgeMapFactory) {
        return () -> new MapDigraph(mapDigraph$VertexMapFactory, mapDigraph$EdgeMapFactory);
    }

    private static <V> MapDigraph$EdgeMapFactory<V> getDefaultEdgeMapFactory(Comparator<? super V> comparator) {
        return object -> {
            Object object2 = comparator == null ? new Object2IntLinkedOpenHashMap(16) : new Object2IntAVLTreeMap(comparator);
            object2.defaultReturnValue(Integer.MIN_VALUE);
            return object2;
        };
    }

    private static <V> MapDigraph$VertexMapFactory<V> getDefaultVertexMapFactory(Comparator<? super V> comparator) {
        return () -> {
            if (comparator == null) {
                return new LinkedHashMap(16);
            }
            return new TreeMap(comparator);
        };
    }

    public static <V> DigraphFactory<MapDigraph<V>> getDefaultDigraphFactory() {
        return MapDigraph.getMapDigraphFactory(MapDigraph.getDefaultVertexMapFactory(null), MapDigraph.getDefaultEdgeMapFactory(null));
    }

    @Override
    public int getEdgeCount() {
        return this.edgeCount;
    }

    public DigraphFactory<? extends MapDigraph<V>> getDigraphFactory() {
        return () -> new MapDigraph<V>(this.vertexMapFactory, this.edgeMapFactory);
    }

    static <V> Object2IntMap<V> createEmptyMap() {
        return Object2IntMaps.emptyMap();
    }

    @Override
    public int getOutDegree(V v) {
        Object2IntMap<V> object2IntMap = this.vertexMap.get(v);
        if (object2IntMap == null) {
            return 0;
        }
        return object2IntMap.size();
    }

    @Override
    public int getVertexCount() {
        return this.vertexMap.size();
    }

    @Override
    public MapDigraph<V> subgraph(Set<V> set) {
        return Digraphs.subgraph(this, set, this.getDigraphFactory());
    }

    @Override
    public boolean isAcyclic() {
        return Digraphs.isAcyclic(this);
    }

    @Override
    public Iterable<V> vertices() {
        if (this.vertexMap.isEmpty()) {
            return Collections.emptySet();
        }
        return new MapDigraph$1(this);
    }

    @Override
    public int totalWeight() {
        int n = 0;
        for (V v : this.vertices()) {
            for (V v2 : this.targets(v)) {
                n += this.get(v, v2).getAsInt();
            }
        }
        return n;
    }
}

