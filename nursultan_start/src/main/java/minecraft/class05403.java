/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class06581
 *  minecraft.class08819
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class05387;
import minecraft.class05388;
import minecraft.class05418;
import minecraft.class06581;
import minecraft.class08819;

public class class05403 {
    private final Optional<class01894> N;
    private final Set<class05418> y;
    private final Optional<String> L;

    public class05403(Optional<class01894> optional, Optional<String> optional2, class05418 ... class05418Array) {
        this.N = optional;
        this.L = optional2;
        this.y = ImmutableSet.copyOf((Object[])class05418Array);
    }

    public class01894 y(class00891 class008912, String string, class05388 class053882, BiConsumer<class01894, class08819> biConsumer) {
        return this.N(class05387.N(class008912, string), class053882, biConsumer);
    }

    public class01894 N(class01894 class018942, class05388 class053882, BiConsumer<class01894, class08819> biConsumer) {
        Map<class05418, class01894> var4 = this.N(class053882);
        biConsumer.accept(class018942, () -> {
            JsonObject jsonObject = new JsonObject();
            this.N.ifPresent(class018942 -> jsonObject.addProperty("parent", class018942.toString()));
            if (!var4.isEmpty()) {
                JsonObject jsonObject2 = new JsonObject();
                var4.forEach((class054182, class018942) -> jsonObject2.addProperty(class054182.N(), class018942.toString()));
                jsonObject.add("textures", (JsonElement)jsonObject2);
            }
            return jsonObject;
        });
        return class018942;
    }

    private Map<class05418, class01894> N(class05388 class053882) {
        return (Map)Streams.concat((Stream[])new Stream[]{this.y.stream(), class053882.N()}).collect(ImmutableMap.toImmutableMap(Function.identity(), class053882::N));
    }

    public class01894 N(class00891 class008912) {
        return class05387.N(class008912, this.L.orElse(""));
    }

    public class01894 N(class00891 class008912, class05388 class053882, BiConsumer<class01894, class08819> biConsumer) {
        return this.N(class05387.N(class008912, this.L.orElse("")), class053882, biConsumer);
    }

    public class01894 N(class00891 class008912, String string, class05388 class053882, BiConsumer<class01894, class08819> biConsumer) {
        return this.N(class05387.N(class008912, string + this.L.orElse("")), class053882, biConsumer);
    }

    public class01894 N(class06581 class065812, class05388 class053882, BiConsumer<class01894, class08819> biConsumer) {
        return this.N(class05387.N(class065812, this.L.orElse("")), class053882, biConsumer);
    }
}

