/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph.util.fas;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.Digraphs;
import de.odysseus.ithaka.digraph.EdgeWeights;
import de.odysseus.ithaka.digraph.MapDigraph;
import de.odysseus.ithaka.digraph.util.fas.AbstractFeedbackArcSetProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class SimpleFeedbackArcSetProvider
extends AbstractFeedbackArcSetProvider {
    public SimpleFeedbackArcSetProvider() {
    }

    public SimpleFeedbackArcSetProvider(int n) {
        super(n);
    }

    @Override
    protected <V> Digraph<V> lfas(Digraph<V> digraph, EdgeWeights<? super V> edgeWeights) {
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        ArrayList arrayList = null;
        int n3 = Math.max(1, 1000000 / (digraph.getVertexCount() + digraph.getEdgeCount()));
        List list = this.copies(digraph, Math.min(10, digraph.getVertexCount()));
        ArrayList arrayList2 = new ArrayList(digraph.getVertexCount());
        HashSet hashSet = new HashSet(digraph.getVertexCount());
        for (Object object : digraph.vertices()) {
            for (Digraph object2 : list) {
                arrayList2.clear();
                hashSet.clear();
                Digraphs.dfs(object2, object, hashSet, arrayList2);
                assert (arrayList2.size() == digraph.getVertexCount());
                int e = 0;
                int n4 = 0;
                hashSet.clear();
                for (Object e2 : arrayList2) {
                    hashSet.add(e2);
                    for (Object e3 : digraph.targets(e2)) {
                        if (hashSet.contains(e3)) continue;
                        e += edgeWeights.get(e2, e3).getAsInt();
                        ++n4;
                    }
                    if (e <= n) continue;
                    break;
                }
                if (e >= n && (e != n || n4 >= n2)) continue;
                arrayList = new ArrayList(arrayList2);
                n = e;
                n2 = n4;
            }
            if (--n3 != 0) continue;
            break;
        }
        Objects.requireNonNull(arrayList);
        MapDigraph mapDigraph = MapDigraph.getDefaultDigraphFactory().create();
        hashSet.clear();
        for (Iterator iterator : arrayList) {
            hashSet.add(iterator);
            for (Iterator iterator2 : digraph.targets(iterator)) {
                if (hashSet.contains(iterator2)) continue;
                mapDigraph.put(iterator, iterator2, digraph.get(iterator, iterator2).getAsInt());
            }
        }
        return mapDigraph;
    }

    private <V> List<Digraph<V>> copies(Digraph<V> digraph, int n) {
        ArrayList<Digraph<V>> arrayList = new ArrayList<Digraph<V>>();
        arrayList.add(digraph);
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        HashMap hashMap = new HashMap();
        int n2 = 0;
        for (V v : digraph.vertices()) {
            hashMap.put(v, n2);
            arrayList2.add(n2++);
        }
        Random random = new Random(7L);
        for (int i = 0; i < n; ++i) {
            Collections.shuffle(arrayList2, random);
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList.add(Digraphs.copy(digraph, () -> new MapDigraph((object, object2) -> {
                int n = (Integer)arrayList3.get((Integer)hashMap.get(object));
                int n2 = (Integer)arrayList3.get((Integer)hashMap.get(object2));
                return Integer.compare(n, n2);
            })));
        }
        return arrayList;
    }
}

