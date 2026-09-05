/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.TypeAdapter
 */
package com.viaversion.viaversion.libs.gson.internal.bind;

import com.viaversion.viaversion.libs.gson.TypeAdapter;

public abstract class SerializationDelegatingTypeAdapter<T>
extends TypeAdapter<T> {
    public abstract TypeAdapter<T> getSerializationDelegate();
}

