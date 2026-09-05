/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.reflect.TypeToken
 */
package fun.crashsystem.jdrpc.libs.com.google.gson;

import fun.crashsystem.jdrpc.libs.com.google.gson.Gson;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter;
import fun.crashsystem.jdrpc.libs.com.google.gson.reflect.TypeToken;

public interface TypeAdapterFactory {
    public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2);
}

