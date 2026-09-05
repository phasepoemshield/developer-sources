/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.TrivialDigraph;
import de.odysseus.ithaka.digraph.TrivialDigraph$1$1;
import java.util.Iterator;

class TrivialDigraph$1
implements Iterable<V> {
    final /* synthetic */ TrivialDigraph this$0;

    TrivialDigraph$1(TrivialDigraph trivialDigraph) {
        this.this$0 = trivialDigraph;
    }

    public String toString() {
        return "[" + String.valueOf(this.this$0.vertex) + "]";
    }

    @Override
    public Iterator<V> iterator() {
        return new TrivialDigraph$1$1(this);
    }
}

