/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.com.google.gson;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;

public interface JsonSerializer<T> {
    public JsonElement serialize(T var1, Type var2, JsonSerializationContext var3);
}

