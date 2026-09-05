/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl.util;

import java.util.Iterator;
import org.quiltmc.config.impl.util.ImmutableIterable;

class ImmutableIterable$1
implements Iterator {
    private final Iterator itr;
    final /* synthetic */ ImmutableIterable this$0;

    ImmutableIterable$1(ImmutableIterable immutableIterable) {
        this.this$0 = immutableIterable;
        this.itr = ImmutableIterable.access$000(immutableIterable).iterator();
    }

    @Override
    public boolean hasNext() {
        return this.itr.hasNext();
    }

    public Object next() {
        return this.itr.next();
    }
}

