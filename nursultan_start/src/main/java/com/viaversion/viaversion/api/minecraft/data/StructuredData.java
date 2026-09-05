/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.data.EmptyStructuredData
 *  com.viaversion.viaversion.api.minecraft.data.FilledStructuredData
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.IdHolder
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.data;

import com.viaversion.viaversion.api.minecraft.data.EmptyStructuredData;
import com.viaversion.viaversion.api.minecraft.data.FilledStructuredData;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.IdHolder;
import io.netty.buffer.ByteBuf;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface StructuredData<T>
extends IdHolder,
Copyable {
    public void setId(int var1);

    public @Nullable T value();

    public boolean isEmpty();

    public static <T> StructuredData<T> of(StructuredDataKey<T> key, T value, int id) {
        return new FilledStructuredData(key, value, id);
    }

    public static <T> StructuredData<T> empty(StructuredDataKey<T> key, int id) {
        return new EmptyStructuredData(key, id);
    }

    public void write(ByteBuf var1);

    public StructuredDataKey<T> key();

    default public boolean isPresent() {
        return !this.isEmpty();
    }

    public void setValue(T var1);

    public StructuredData<T> copy();
}

