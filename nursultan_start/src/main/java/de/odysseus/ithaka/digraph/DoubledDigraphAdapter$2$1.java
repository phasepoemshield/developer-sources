/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.DoubledDigraphAdapter$2;
import java.util.Iterator;

class DoubledDigraphAdapter$2$1
implements Iterator<V> {
    V target;
    final /* synthetic */ DoubledDigraphAdapter$2 this$1;

    DoubledDigraphAdapter$2$1(DoubledDigraphAdapter$2 var1_1) {
        this.this$1 = var1_1;
    }

    @Override
    public void remove() {
        this.this$1.val$delegate.remove();
        this.this$1.this$0.reverse.remove0(this.target, this.this$1.val$source);
    }

    @Override
    public boolean hasNext() {
        return this.this$1.val$delegate.hasNext();
    }

    @Override
    public V next() {
        this.target = this.this$1.val$delegate.next();
        return this.target;
    }
}

