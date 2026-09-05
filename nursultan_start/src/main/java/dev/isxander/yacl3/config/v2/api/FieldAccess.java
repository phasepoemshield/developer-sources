/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.api;

import dev.isxander.yacl3.config.v2.api.ReadOnlyFieldAccess;

public interface FieldAccess<T>
extends ReadOnlyFieldAccess<T> {
    public void set(T var1);
}

