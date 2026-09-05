/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.TrivialDigraph$2;
import java.util.Iterator;
import java.util.NoSuchElementException;

class TrivialDigraph$2$1
implements Iterator<V> {
    boolean hasNext = true;
    final /* synthetic */ TrivialDigraph$2 this$1;

    TrivialDigraph$2$1(TrivialDigraph$2 var1_1) {
        this.this$1 = var1_1;
    }

    @Override
    public void remove() {
        if (this.hasNext) {
            throw new IllegalStateException();
        }
        this.this$1.this$0.remove(this.this$1.this$0.vertex, this.this$1.this$0.vertex);
    }

    @Override
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override
    public V next() {
        if (this.hasNext) {
            this.hasNext = false;
            return this.this$1.this$0.vertex;
        }
        throw new NoSuchElementException("No more vertices");
    }
}

