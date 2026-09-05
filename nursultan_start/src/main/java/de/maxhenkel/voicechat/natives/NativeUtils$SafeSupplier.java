/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.natives;

@FunctionalInterface
public interface NativeUtils$SafeSupplier<T> {
    public T get() throws Throwable;
}

