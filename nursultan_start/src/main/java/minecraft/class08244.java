/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07018
 *  minecraft.class08326
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import minecraft.class07018;
import minecraft.class08326;
import org.slf4j.Logger;

public final class class08244
extends Record {
    private final List<String> removed;
    private final Map<String, String> renamed;
    private static final Logger i = LogUtils.getLogger();
    public static final class08244 N = new class08244(List.of(), Map.of());
    public static final Codec<class08244> y = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.listOf().fieldOf("removed").forGetter(class08244::y), (App)Codec.unboundedMap((Codec)Codec.STRING, (Codec)Codec.STRING).fieldOf("renamed").forGetter(class08244::L)).apply(instance, class08244::new));

    public Map<String, String> L() {
        return this.renamed;
    }

    public class08244(List<String> list, Map<String, String> map) {
        this.removed = list;
        this.renamed = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08244.class, "removed;renamed", "removed", "renamed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08244.class, "removed;renamed", "removed", "renamed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08244.class, "removed;renamed", "removed", "renamed"}, this);
    }

    public List<String> y() {
        return this.removed;
    }

    public static class08244 N() {
        return class08244.N("/assets/minecraft/lang/deprecated.json");
    }

    public void N(Map<String, String> map) {
        for (String string3 : this.removed) {
            map.remove(string3);
        }
        this.renamed.forEach((string, string2) -> {
            String string3 = (String)map.remove(string);
            if (string3 == null) {
                i.warn("Missing translation key for rename: {}", string);
                map.remove(string2);
            } else {
                map.put((String)string2, string3);
            }
        });
    }

    public static class08244 N(InputStream inputStream) {
        JsonElement jsonElement = class08326.N((Reader)new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        return (class08244)((Object)y.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).getOrThrow(string -> new IllegalStateException("Failed to parse deprecated language data: " + string)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static class08244 N(String string) {
        try (InputStream inputStream = class07018.class.getResourceAsStream(string);){
            if (inputStream == null) return N;
            class08244 class082442 = class08244.N(inputStream);
            return class082442;
        }
        catch (Exception exception) {
            i.error("Failed to read {}", (Object)string, (Object)exception);
        }
        return N;
    }
}

