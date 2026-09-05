/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class01894
 *  minecraft.class06551
 */
package minecraft;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class01894;
import minecraft.class06551;
import minecraft.class06929;
import minecraft.class06943;

public class class06925 {
    public static final BiMap<class01894, class06929> N = HashBiMap.create();
    public static final Codec<class06929> y = class01894.N.comapFlatMap(class018942 -> Optional.ofNullable((class06929)N.get(class018942)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + String.valueOf(class018942) + "'")), arg_0 -> N.inverse().get(arg_0));
    public static final class06929 L = class06925.N("empty", class069432 -> {});
    public static final class06929 u = class06925.N("chest", class069432 -> class069432.N(class06551.B).y(class06551.N));
    public static final class06929 i = class06925.N("command", class069432 -> class069432.N(class06551.B).y(class06551.N));
    public static final class06929 R = class06925.N("selector", class069432 -> class069432.N(class06551.B).N(class06551.N));
    public static final class06929 M = class06925.N("fishing", class069432 -> class069432.N(class06551.B).N(class06551.U).y(class06551.N));
    public static final class06929 B = class06925.N("entity", class069432 -> class069432.N(class06551.N).N(class06551.B).N(class06551.i).y(class06551.R).y(class06551.M).y(class06551.u));
    public static final class06929 Z = class06925.N("equipment", class069432 -> class069432.N(class06551.B).N(class06551.N));
    public static final class06929 z = class06925.N("archaeology", class069432 -> class069432.N(class06551.B).N(class06551.N).N(class06551.U));
    public static final class06929 U = class06925.N("gift", class069432 -> class069432.N(class06551.B).N(class06551.N));
    public static final class06929 E = class06925.N("barter", class069432 -> class069432.N(class06551.N));
    public static final class06929 W = class06925.N("vault", class069432 -> class069432.N(class06551.B).y(class06551.N).y(class06551.U));
    public static final class06929 m = class06925.N("advancement_reward", class069432 -> class069432.N(class06551.N).N(class06551.B));
    public static final class06929 P = class06925.N("advancement_entity", class069432 -> class069432.N(class06551.N).N(class06551.B));
    public static final class06929 s = class06925.N("advancement_location", class069432 -> class069432.N(class06551.N).N(class06551.B).N(class06551.U).N(class06551.Z));
    public static final class06929 T = class06925.N("block_use", class069432 -> class069432.N(class06551.N).N(class06551.B).N(class06551.Z));
    public static final class06929 b = class06925.N("generic", class069432 -> class069432.N(class06551.N).N(class06551.u).N(class06551.i).N(class06551.R).N(class06551.M).N(class06551.B).N(class06551.Z).N(class06551.z).N(class06551.U).N(class06551.E));
    public static final class06929 j = class06925.N("block", class069432 -> class069432.N(class06551.Z).N(class06551.B).N(class06551.U).y(class06551.N).y(class06551.z).y(class06551.E));
    public static final class06929 v = class06925.N("shearing", class069432 -> class069432.N(class06551.B).N(class06551.N).N(class06551.U));
    public static final class06929 n = class06925.N("entity_interact", class069432 -> class069432.N(class06551.L).y(class06551.y).N(class06551.U));
    public static final class06929 t = class06925.N("block_interact", class069432 -> class069432.N(class06551.Z).y(class06551.z).y(class06551.y).y(class06551.U));
    public static final class06929 G = class06925.N("enchanted_damage", class069432 -> class069432.N(class06551.N).N(class06551.W).N(class06551.B).N(class06551.i).y(class06551.M).y(class06551.R));
    public static final class06929 l = class06925.N("enchanted_item", class069432 -> class069432.N(class06551.U).N(class06551.W));
    public static final class06929 d = class06925.N("enchanted_location", class069432 -> class069432.N(class06551.N).N(class06551.W).N(class06551.B).N(class06551.m));
    public static final class06929 w = class06925.N("enchanted_entity", class069432 -> class069432.N(class06551.N).N(class06551.W).N(class06551.B));
    public static final class06929 k = class06925.N("hit_block", class069432 -> class069432.N(class06551.N).N(class06551.W).N(class06551.B).N(class06551.Z));

    private static class06929 N(String string, Consumer<class06943> consumer) {
        class06943 class069432 = new class06943();
        consumer.accept(class069432);
        class06929 class069292 = class069432.N();
        class01894 class018942 = class01894.y((String)string);
        if ((class06929)N.put((Object)class018942, (Object)class069292) != null) {
            throw new IllegalStateException("Loot table parameter set " + String.valueOf(class018942) + " is already registered");
        }
        return class069292;
    }

    private static /* synthetic */ void G(class06943 class069432) {
        class069432.N(class06551.B).y(class06551.N);
    }
}

