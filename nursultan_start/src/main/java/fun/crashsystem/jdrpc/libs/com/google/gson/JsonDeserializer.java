/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.com.google.gson;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonDeserializationContext;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public interface JsonDeserializer<T> {
    public T deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException;
}

