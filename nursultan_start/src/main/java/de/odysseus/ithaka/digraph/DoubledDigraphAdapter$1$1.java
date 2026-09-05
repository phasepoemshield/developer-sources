/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.DoubledDigraphAdapter$1;
import java.util.Iterator;

class DoubledDigraphAdapter$1$1
implements Iterator<V> {
    V vertex;
    final /* synthetic */ DoubledDigraphAdapter$1 this$1;

    DoubledDigraphAdapter$1$1(DoubledDigraphAdapter$1 var1_1) {
        this.this$1 = var1_1;
    }

    @Override
    public void remove() {
        this.this$1.val$delegate.remove();
        this.this$1.this$0.reverse.remove0(this.vertex);
    }

    @Override
    public boolean hasNext() {
        return this.this$1.val$delegate.hasNext();
    }

    @Override
    public V next() {
        this.vertex = this.this$1.val$delegate.next();
        return this.vertex;
    }
}

