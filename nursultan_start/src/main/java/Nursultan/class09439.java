/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01128
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import minecraft.class01128;
import org.jspecify.annotations.Nullable;

public class class09439<B, T>
implements class01128<B, T> {
    final /* synthetic */ Class N;

    public class09439(Class clazz) {
        this.N = clazz;
    }

    public Class<? extends B> s() {
        return this.N;
    }

    public @Nullable T N(B b) {
        return (T)(this.N.isInstance(b) ? b : null);
    }
}

