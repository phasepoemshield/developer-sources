/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl.values;

import java.util.Iterator;
import org.quiltmc.config.impl.values.ValueKeyImpl;
import org.quiltmc.config.impl.values.ValueKeyImpl$1;

final class ValueKeyImpl$Itr
implements Iterator {
    private int i = 0;
    final /* synthetic */ ValueKeyImpl this$0;

    private ValueKeyImpl$Itr(ValueKeyImpl valueKeyImpl) {
        this.this$0 = valueKeyImpl;
    }

    /* synthetic */ ValueKeyImpl$Itr(ValueKeyImpl valueKeyImpl, ValueKeyImpl$1 valueKeyImpl$1) {
        this(valueKeyImpl);
    }

    @Override
    public boolean hasNext() {
        return this.i < ValueKeyImpl.access$100(this.this$0).length;
    }

    public String next() {
        int n = this.i;
        this.i = n + 1;
        return ValueKeyImpl.access$100(this.this$0)[n];
    }
}

