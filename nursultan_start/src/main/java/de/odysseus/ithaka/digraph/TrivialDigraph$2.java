/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.TrivialDigraph;
import de.odysseus.ithaka.digraph.TrivialDigraph$2$1;
import java.util.Iterator;

class TrivialDigraph$2
implements Iterable<V> {
    final /* synthetic */ TrivialDigraph this$0;

    TrivialDigraph$2(TrivialDigraph trivialDigraph) {
        this.this$0 = trivialDigraph;
    }

    public String toString() {
        return "[" + String.valueOf(this.this$0.vertex) + "]";
    }

    @Override
    public Iterator<V> iterator() {
        return new TrivialDigraph$2$1(this);
    }
}

