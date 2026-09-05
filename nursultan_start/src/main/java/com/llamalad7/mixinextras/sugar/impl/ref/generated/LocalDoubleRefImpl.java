/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.LocalRefRuntime
 */
package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.impl.ref.LocalRefRuntime;
import com.llamalad7.mixinextras.sugar.ref.LocalDoubleRef;

public final class LocalDoubleRefImpl
implements LocalDoubleRef {
    private double value;
    private byte state = 1;

    @Override
    public double get() {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        return this.value;
    }

    public String toString() {
        return LocalRefRuntime.localRefToString((String)"LocalDoubleRef", (String)String.valueOf(this.value), (byte)this.state);
    }

    @Override
    public void set(double d) {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        this.value = d;
    }

    public void init(double d) {
        this.value = d;
        this.state = 0;
    }

    public double dispose() {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        this.state = (byte)2;
        return this.value;
    }
}

