/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.DoubledDigraphAdapter;
import de.odysseus.ithaka.digraph.DoubledDigraphAdapter$2$1;
import java.util.Iterator;

class DoubledDigraphAdapter$2
implements Iterable<V> {
    final /* synthetic */ Iterator val$delegate;
    final /* synthetic */ Object val$source;
    final /* synthetic */ DoubledDigraphAdapter this$0;

    DoubledDigraphAdapter$2(DoubledDigraphAdapter doubledDigraphAdapter, Iterator iterator, Object object) {
        this.this$0 = doubledDigraphAdapter;
        this.val$delegate = iterator;
        this.val$source = object;
    }

    public String toString() {
        return DoubledDigraphAdapter.access$101(this.this$0, this.val$source).toString();
    }

    @Override
    public Iterator<V> iterator() {
        return new DoubledDigraphAdapter$2$1(this);
    }
}

