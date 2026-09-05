/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl.util;

import java.util.Iterator;
import org.quiltmc.config.impl.util.ImmutableIterable$1;

public final class ImmutableIterable
implements Iterable {
    private final Iterable itr;

    static /* synthetic */ Iterable access$000(ImmutableIterable immutableIterable) {
        return immutableIterable.itr;
    }

    public ImmutableIterable(Iterable iterable) {
        this.itr = iterable;
    }

    public Iterator iterator() {
        return new ImmutableIterable$1(this);
    }
}

