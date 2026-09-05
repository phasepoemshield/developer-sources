/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph.util.fas;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.Digraphs;
import de.odysseus.ithaka.digraph.UnmodifiableDigraph;
import de.odysseus.ithaka.digraph.util.fas.FeedbackArcSetPolicy;

public class FeedbackArcSet<V>
extends UnmodifiableDigraph<V> {
    private final FeedbackArcSetPolicy policy;
    private final boolean exact;
    private final int weight;

    public FeedbackArcSet(Digraph<V> digraph, int n, FeedbackArcSetPolicy feedbackArcSetPolicy, boolean bl) {
        super(digraph);
        this.weight = n;
        this.policy = feedbackArcSetPolicy;
        this.exact = bl;
    }

    public static <V> FeedbackArcSet<V> empty(FeedbackArcSetPolicy feedbackArcSetPolicy) {
        return new FeedbackArcSet(Digraphs.emptyDigraph(), 0, feedbackArcSetPolicy, true);
    }

    public boolean isExact() {
        return this.exact;
    }

    public FeedbackArcSetPolicy getPolicy() {
        return this.policy;
    }

    public int getWeight() {
        return this.weight;
    }
}

