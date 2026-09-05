/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.DigraphFactory;
import de.odysseus.ithaka.digraph.DoubledDigraph;
import de.odysseus.ithaka.digraph.EmptyDigraph;
import de.odysseus.ithaka.digraph.UnmodifiableDigraph;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.Stack;

public class Digraphs {
    public static <V> List<Set<V>> scc(Digraph<V> digraph) {
        ArrayList<Set<V>> arrayList = new ArrayList<Set<V>>();
        Digraph<V> digraph2 = digraph.reverse();
        Stack stack = new Stack();
        HashSet hashSet = new HashSet();
        for (Object object : digraph.vertices()) {
            Digraphs.dfs(digraph, object, hashSet, stack);
        }
        hashSet = new HashSet();
        while (!stack.isEmpty()) {
            Object object;
            Iterator<Object> iterator = stack.pop();
            if (hashSet.contains(iterator)) continue;
            object = new HashSet();
            Digraphs.dfs(digraph2, iterator, hashSet, object);
            arrayList.add((Set<V>)object);
        }
        return arrayList;
    }

    public static <V> Set<V> closure(Digraph<V> digraph, V v) {
        HashSet hashSet = new HashSet();
        Digraphs.dfs(digraph, v, hashSet, hashSet);
        return hashSet;
    }

    public static <V> void dfs(Digraph<V> digraph, V v, Set<? super V> set, Collection<? super V> collection) {
        if (set.add(v)) {
            for (V v2 : digraph.targets(v)) {
                Digraphs.dfs(digraph, v2, set, collection);
            }
            collection.add(v);
        }
    }

    public static <V> boolean isReachable(Digraph<V> digraph, V v, V v2) {
        return digraph.contains(v, v2) || Digraphs.closure(digraph, v).contains(v2);
    }

    public static <V, G extends Digraph<V>> G reverse(Digraph<V> digraph, DigraphFactory<? extends G> digraphFactory) {
        G g = digraphFactory.create();
        for (V v : digraph.vertices()) {
            g.add(v);
            for (V v2 : digraph.targets(v)) {
                g.put(v2, v, digraph.get(v, v2).getAsInt());
            }
        }
        return g;
    }

    public static <V, G extends Digraph<V>> G copy(Digraph<V> digraph, DigraphFactory<? extends G> digraphFactory) {
        G g = digraphFactory.create();
        for (V v : digraph.vertices()) {
            g.add(v);
            for (V v2 : digraph.targets(v)) {
                g.put(v, v2, digraph.get(v, v2).getAsInt());
            }
        }
        return g;
    }

    public static <V> boolean isStronglyConnected(Digraph<V> digraph) {
        int n = digraph.getVertexCount();
        if (n < 2) {
            return true;
        }
        return Digraphs.scc(digraph).size() == 1;
    }

    public static <V> Digraph<V> unmodifiableDigraph(Digraph<V> digraph) {
        return new UnmodifiableDigraph<V>(digraph);
    }

    public static <V> boolean isEquivalent(Digraph<V> digraph, Digraph<V> digraph2, boolean bl) {
        if (digraph == digraph2) {
            return true;
        }
        if (digraph.getEdgeCount() != digraph2.getEdgeCount() || digraph.getVertexCount() != digraph2.getVertexCount()) {
            return false;
        }
        for (V v : digraph.vertices()) {
            if (!digraph2.contains(v)) {
                return false;
            }
            for (V v2 : digraph.targets(v)) {
                int n;
                int n2;
                OptionalInt optionalInt = digraph2.get(v, v2);
                if (optionalInt.isEmpty()) {
                    return false;
                }
                if (!bl || (n2 = digraph.get(v, v2).getAsInt()) == (n = optionalInt.getAsInt())) continue;
                return false;
            }
        }
        return true;
    }

    public static <V> boolean isTriviallyAcyclic(Digraph<V> digraph) {
        return digraph.getVertexCount() < 2;
    }

    public static <V> DoubledDigraph<V> emptyDigraph() {
        return new EmptyDigraph();
    }

    public static <V> List<Set<V>> wcc(Digraph<V> digraph) {
        ArrayList<Set<V>> arrayList = new ArrayList<Set<V>>();
        Digraph<V> digraph2 = digraph.reverse();
        HashSet hashSet = new HashSet();
        for (V v : digraph.vertices()) {
            if (hashSet.contains(v)) continue;
            HashSet hashSet2 = new HashSet();
            Digraphs.dfs2(digraph, digraph2, v, hashSet, hashSet2);
            arrayList.add(hashSet2);
        }
        return arrayList;
    }

    private static <V> void dfs2(Digraph<V> digraph, Digraph<V> digraph2, V v, Set<? super V> set, Collection<? super V> collection) {
        if (set.add(v)) {
            for (V v2 : digraph.targets(v)) {
                Digraphs.dfs2(digraph, digraph2, v2, set, collection);
            }
            for (V v2 : digraph2.targets(v)) {
                Digraphs.dfs2(digraph, digraph2, v2, set, collection);
            }
            collection.add(v);
        }
    }

    public static <V> void dfs2(Digraph<V> digraph, V v, Set<? super V> set, Collection<? super V> collection) {
        Digraphs.dfs2(digraph, digraph.reverse(), v, set, collection);
    }

    public static <V> List<V> toposort(Digraph<V> digraph, boolean bl) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet(digraph.getVertexCount());
        for (V v : digraph.vertices()) {
            if (hashSet.contains(v)) continue;
            Digraphs.dfs(digraph, v, hashSet, arrayList);
        }
        if (!bl) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public static <V, G extends Digraph<V>> G subgraph(Digraph<V> digraph, Set<V> set, DigraphFactory<? extends G> digraphFactory) {
        G g = digraphFactory.create();
        for (V v : set) {
            if (!digraph.contains(v)) continue;
            g.add(v);
            for (V v2 : digraph.targets(v)) {
                if (!set.contains(v2)) continue;
                g.put(v, v2, digraph.get(v, v2).getAsInt());
            }
        }
        return g;
    }

    public static <V> boolean isAcyclic(Digraph<V> digraph) {
        if (Digraphs.isTriviallyAcyclic(digraph)) {
            return true;
        }
        int n = digraph.getVertexCount();
        if (digraph.getEdgeCount() > n * (n - 1) / 2) {
            return false;
        }
        return Digraphs.scc(digraph).size() == n;
    }
}

