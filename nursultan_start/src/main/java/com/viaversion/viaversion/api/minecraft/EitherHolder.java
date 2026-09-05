/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.EitherHolderImpl
 */
package com.viaversion.viaversion.api.minecraft;

import com.viaversion.viaversion.api.minecraft.EitherHolderImpl;
import com.viaversion.viaversion.api.minecraft.Holder;

public interface EitherHolder<T> {
    public static <T> EitherHolder<T> of(Holder<T> value) {
        return new EitherHolderImpl(value, null);
    }

    public static <T> EitherHolder<T> of(String key) {
        return new EitherHolderImpl(null, key);
    }

    public String key();

    public Holder<T> holder();

    public boolean hasHolder();

    public boolean hasKey();
}

