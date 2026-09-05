/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonParseException
 *  minecraft.class00167
 *  minecraft.class01894
 *  minecraft.class05001
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.UnbakedModelDeserializer
 *  net.fabricmc.fabric.mixin.client.model.loading.BlockModelAccessor
 */
package net.fabricmc.fabric.impl.client.model.loading;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class00167;
import minecraft.class01894;
import minecraft.class05001;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.UnbakedModelDeserializer;
import net.fabricmc.fabric.mixin.client.model.loading.BlockModelAccessor;

@Environment(value=EnvType.CLIENT)
public class UnbakedModelDeserializerRegistry {
    private static final Map<class01894, UnbakedModelDeserializer> DESERIALIZERS = new HashMap<class01894, UnbakedModelDeserializer>();

    public static class00167 deserialize(Reader reader) throws JsonParseException {
        return (class00167)class05001.N((Gson)BlockModelAccessor.fabric_getGson(), (Reader)reader, class00167.class);
    }

    public static UnbakedModelDeserializer get(class01894 class018942) {
        Objects.requireNonNull(class018942, "id cannot be null");
        return DESERIALIZERS.get(class018942);
    }

    public static void register(class01894 class018942, UnbakedModelDeserializer unbakedModelDeserializer) {
        Objects.requireNonNull(class018942, "id cannot be null");
        Objects.requireNonNull(class018942, "deserializer cannot be null");
        if (DESERIALIZERS.putIfAbsent(class018942, unbakedModelDeserializer) != null) {
            throw new IllegalArgumentException("UnbakedModelDeserializer with identifier '" + String.valueOf(class018942) + "' already registered");
        }
    }
}

