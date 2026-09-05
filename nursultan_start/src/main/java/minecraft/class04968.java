/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.ExclusionStrategy
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  minecraft.class04942
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import minecraft.class04942;
import minecraft.class04986;
import org.jspecify.annotations.Nullable;

public class class04968 {
    ExclusionStrategy N = new class04986(this);
    private final Gson y = new GsonBuilder().addSerializationExclusionStrategy(this.N).addDeserializationExclusionStrategy(this.N).create();

    public <T extends class04942> @Nullable T N(String string, Class<T> clazz) {
        return (T)((class04942)this.y.fromJson(string, clazz));
    }

    public String N(JsonElement jsonElement) {
        return this.y.toJson(jsonElement);
    }

    public String N(class04942 class049422) {
        return this.y.toJson((Object)class049422);
    }
}

