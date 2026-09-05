/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind;

import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter;

public abstract class SerializationDelegatingTypeAdapter<T>
extends TypeAdapter<T> {
    public abstract TypeAdapter<T> getSerializationDelegate();
}

