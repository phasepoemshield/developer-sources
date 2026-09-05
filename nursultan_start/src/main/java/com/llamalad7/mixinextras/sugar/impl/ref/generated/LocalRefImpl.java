/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.LocalRefRuntime
 */
package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.impl.ref.LocalRefRuntime;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;

public final class LocalRefImpl
implements LocalRef {
    private Object value;
    private byte state = 1;

    public Object get() {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        return this.value;
    }

    public String toString() {
        return LocalRefRuntime.localRefToString((String)"LocalRef", (String)String.valueOf(this.value), (byte)this.state);
    }

    public void set(Object object) {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        this.value = object;
    }

    public void init(Object object) {
        this.value = object;
        this.state = 0;
    }

    public Object dispose() {
        if (this.state != 0) {
            LocalRefRuntime.checkState((byte)this.state);
        }
        this.state = (byte)2;
        return this.value;
    }
}

