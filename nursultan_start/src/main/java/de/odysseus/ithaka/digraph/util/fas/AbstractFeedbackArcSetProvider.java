/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph.util.fas;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.Digraphs;
import de.odysseus.ithaka.digraph.EdgeWeights;
import de.odysseus.ithaka.digraph.MapDigraph;
import de.odysseus.ithaka.digraph.util.fas.AbstractFeedbackArcSetProvider$FeedbackTask;
import de.odysseus.ithaka.digraph.util.fas.FeedbackArcSet;
import de.odysseus.ithaka.digraph.util.fas.FeedbackArcSetPolicy;
import de.odysseus.ithaka.digraph.util.fas.FeedbackArcSetProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public abstract class AbstractFeedbackArcSetProvider
implements FeedbackArcSetProvider {
    private final ExecutorService executor;

    protected AbstractFeedbackArcSetProvider() {
        this.executor = null;
    }

    protected AbstractFeedbackArcSetProvider(int n) {
        this.executor = n > 0 ? Executors.newFixedThreadPool(n) : null;
    }

    @Override
    public <V> FeedbackArcSet<V> getFeedbackArcSet(Digraph<V> digraph, EdgeWeights<? super V> edgeWeights, FeedbackArcSetPolicy feedbackArcSetPolicy) {
        if (Digraphs.isTriviallyAcyclic(digraph)) {
            return FeedbackArcSet.empty(feedbackArcSetPolicy);
        }
        List list = Digraphs.scc(digraph);
        if (list.size() == digraph.getVertexCount()) {
            return FeedbackArcSet.empty(feedbackArcSetPolicy);
        }
        if (list.size() == 1) {
            return this.fas(digraph, edgeWeights, feedbackArcSetPolicy);
        }
        ArrayList<AbstractFeedbackArcSetProvider$FeedbackTask<V>> arrayList = new ArrayList<AbstractFeedbackArcSetProvider$FeedbackTask<V>>();
        for (Set set : list) {
            if (set.size() <= 1) continue;
            arrayList.add(new AbstractFeedbackArcSetProvider$FeedbackTask<V>(this, digraph, edgeWeights, feedbackArcSetPolicy, set));
        }
        List<FeedbackArcSet<V>> list2 = this.executeAll(arrayList);
        if (list2 == null) {
            return null;
        }
        int n = 0;
        boolean bl = true;
        MapDigraph mapDigraph = new MapDigraph();
        for (FeedbackArcSet feedbackArcSet : list2) {
            for (Object v : feedbackArcSet.vertices()) {
                for (Object v2 : feedbackArcSet.targets(v)) {
                    mapDigraph.put(v, v2, digraph.get(v, v2).getAsInt());
                }
            }
            bl &= feedbackArcSet.isExact();
            n += feedbackArcSet.getWeight();
        }
        return new FeedbackArcSet(mapDigraph, n, feedbackArcSetPolicy, bl);
    }

    private <V> List<FeedbackArcSet<V>> executeAll(List<AbstractFeedbackArcSetProvider$FeedbackTask<V>> list) {
        ArrayList<FeedbackArcSet<V>> arrayList = new ArrayList<FeedbackArcSet<V>>();
        if (this.executor == null) {
            for (AbstractFeedbackArcSetProvider$FeedbackTask<V> abstractFeedbackArcSetProvider$FeedbackTask : list) {
                arrayList.add((FeedbackArcSet<V>)abstractFeedbackArcSetProvider$FeedbackTask.call());
            }
        } else {
            try {
                for (Future<V> future : this.executor.invokeAll(list)) {
                    arrayList.add((FeedbackArcSet)future.get());
                }
            }
            catch (InterruptedException | ExecutionException exception) {
                exception.printStackTrace();
                return null;
            }
        }
        return arrayList;
    }

    <V> FeedbackArcSet<V> fas(Digraph<V> digraph, EdgeWeights<? super V> edgeWeights, FeedbackArcSetPolicy feedbackArcSetPolicy) {
        boolean bl;
        EdgeWeights edgeWeights2;
        EdgeWeights<Object> edgeWeights3 = edgeWeights;
        if (feedbackArcSetPolicy == FeedbackArcSetPolicy.MIN_SIZE) {
            edgeWeights2 = edgeWeights;
            int bl2 = this.totalWeight(digraph, edgeWeights2);
            edgeWeights3 = (object, object2) -> {
                OptionalInt optionalInt = edgeWeights2.get(object, object2);
                if (optionalInt.isPresent()) {
                    return OptionalInt.of(optionalInt.getAsInt() + bl2);
                }
                return OptionalInt.empty();
            };
        }
        edgeWeights2 = this.mfas(digraph, edgeWeights3);
        boolean bl3 = true;
        if (edgeWeights2 == null) {
            edgeWeights2 = this.lfas(digraph, edgeWeights3);
            bl = false;
        }
        return new FeedbackArcSet<V>(edgeWeights2, this.totalWeight((Digraph<V>)edgeWeights2, edgeWeights), feedbackArcSetPolicy, bl);
    }

    protected abstract <V> Digraph<V> lfas(Digraph<V> var1, EdgeWeights<? super V> var2);

    protected <V> Digraph<V> mfas(Digraph<V> digraph, EdgeWeights<? super V> edgeWeights) {
        return null;
    }

    protected <V> int totalWeight(Digraph<V> digraph, EdgeWeights<? super V> edgeWeights) {
        int n = 0;
        for (V v : digraph.vertices()) {
            for (V v2 : digraph.targets(v)) {
                n += edgeWeights.get(v, v2).getAsInt();
            }
        }
        return n;
    }
}

