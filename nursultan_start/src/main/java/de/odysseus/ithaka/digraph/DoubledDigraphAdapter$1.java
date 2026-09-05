/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph;

import de.odysseus.ithaka.digraph.DoubledDigraphAdapter;
import de.odysseus.ithaka.digraph.DoubledDigraphAdapter$1$1;
import java.util.Iterator;

class DoubledDigraphAdapter$1
implements Iterable<V> {
    final /* synthetic */ Iterator val$delegate;
    final /* synthetic */ DoubledDigraphAdapter this$0;

    DoubledDigraphAdapter$1(DoubledDigraphAdapter doubledDigraphAdapter, Iterator iterator) {
        this.this$0 = doubledDigraphAdapter;
        this.val$delegate = iterator;
    }

    public String toString() {
        return DoubledDigraphAdapter.access$001(this.this$0).toString();
    }

    @Override
    public Iterator<V> iterator() {
        return new DoubledDigraphAdapter$1$1(this);
    }
}

