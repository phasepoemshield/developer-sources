/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  minecraft.class00167
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.model.loading.UnbakedModelDeserializerRegistry
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import minecraft.class00167;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.model.loading.UnbakedModelDeserializerRegistry;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface UnbakedModelDeserializer {
    public class00167 deserialize(JsonObject var1, JsonDeserializationContext var2);

    public static class00167 deserialize(Reader reader) throws JsonParseException {
        return UnbakedModelDeserializerRegistry.deserialize((Reader)reader);
    }

    public static @Nullable UnbakedModelDeserializer get(class01894 class018942) {
        return UnbakedModelDeserializerRegistry.get((class01894)class018942);
    }

    public static void register(class01894 class018942, UnbakedModelDeserializer unbakedModelDeserializer) {
        UnbakedModelDeserializerRegistry.register((class01894)class018942, (UnbakedModelDeserializer)unbakedModelDeserializer);
    }
}

