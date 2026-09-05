/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.LocalRefRuntime
 */
package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.impl.ref.LocalRefRuntime;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;

public final class LocalBooleanRefImpl
implements LocalBooleanRef {
    private boolean value;
    private byte state = 1;

    @Override
    public boolean get() {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        return this.value;
    }

    public String toString() {
        return LocalRefRuntime.localRefToString((String)"LocalBooleanRef", (String)String.valueOf(this.value), (byte)this.state);
    }

    @Override
    public void set(boolean bl) {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        this.value = bl;
    }

    public void init(boolean bl) {
        this.value = bl;
        this.state = 0;
    }

    public boolean dispose() {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        this.state = (byte)2;
        return this.value;
    }
}

