/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.LocalRefRuntime
 */
package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.impl.ref.LocalRefRuntime;
import com.llamalad7.mixinextras.sugar.ref.LocalLongRef;

public final class LocalLongRefImpl
implements LocalLongRef {
    private long value;
    private byte state = 1;

    @Override
    public long get() {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        return this.value;
    }

    public String toString() {
        return LocalRefRuntime.localRefToString((String)"LocalLongRef", (String)String.valueOf(this.value), (byte)this.state);
    }

    @Override
    public void set(long l) {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        this.value = l;
    }

    public void init(long l) {
        this.value = l;
        this.state = 0;
    }

    public long dispose() {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        this.state = (byte)2;
        return this.value;
    }
}

