/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph.util.fas;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.EdgeWeights;
import de.odysseus.ithaka.digraph.util.fas.AbstractFeedbackArcSetProvider;
import de.odysseus.ithaka.digraph.util.fas.FeedbackArcSet;
import de.odysseus.ithaka.digraph.util.fas.FeedbackArcSetPolicy;
import java.util.Set;
import java.util.concurrent.Callable;

class AbstractFeedbackArcSetProvider$FeedbackTask<V>
implements Callable<FeedbackArcSet<V>> {
    final Digraph<V> digraph;
    final EdgeWeights<? super V> weights;
    final FeedbackArcSetPolicy policy;
    final Set<V> scc;
    final /* synthetic */ AbstractFeedbackArcSetProvider this$0;

    AbstractFeedbackArcSetProvider$FeedbackTask(AbstractFeedbackArcSetProvider abstractFeedbackArcSetProvider, Digraph<V> digraph, EdgeWeights<? super V> edgeWeights, FeedbackArcSetPolicy feedbackArcSetPolicy, Set<V> set) {
        this.this$0 = abstractFeedbackArcSetProvider;
        this.digraph = digraph;
        this.weights = edgeWeights;
        this.policy = feedbackArcSetPolicy;
        this.scc = set;
    }

    @Override
    public FeedbackArcSet<V> call() {
        return this.this$0.fas(this.digraph.subgraph(this.scc), this.weights, this.policy);
    }
}

