/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11647
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05946
 *  minecraft.class08699
 */
package minecraft;

import Nursultan.class11647;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05946;
import minecraft.class08569;
import minecraft.class08699;

public final class class08548
extends Record {
    private final class08569 base;
    private final Map<class05946<class11647>, class08569> overrides;
    public static final String N = "_";
    public static final MapCodec<class08548> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class08569.N.fieldOf("asset_name").forGetter(class08548::N), (App)Codec.unboundedMap((Codec)class05946.N((class05946)class08699.N), class08569.N).optionalFieldOf("override_armor_assets", Map.of()).forGetter(class08548::y)).apply(instance, class08548::new));
    public static final class02362<ByteBuf, class08548> L = class02362.N(class08569.y, class08548::N, (class02362)class02389.N(Object2ObjectOpenHashMap::new, (class02362)class05946.y((class05946)class08699.N), class08569.y), class08548::y, class08548::new);
    public static final class08548 u = class08548.N("quartz");
    public static final class08548 i = class08548.N("iron", Map.of(class08699.i, "iron_darker"));
    public static final class08548 R = class08548.N("netherite", Map.of(class08699.Z, "netherite_darker"));
    public static final class08548 M = class08548.N("redstone");
    public static final class08548 B = class08548.N("copper", Map.of(class08699.L, "copper_darker"));
    public static final class08548 Z = class08548.N("gold", Map.of(class08699.R, "gold_darker"));
    public static final class08548 z = class08548.N("emerald");
    public static final class08548 U = class08548.N("diamond", Map.of(class08699.M, "diamond_darker"));
    public static final class08548 E = class08548.N("lapis");
    public static final class08548 W = class08548.N("amethyst");
    public static final class08548 m = class08548.N("resin");

    public class08548(class08569 class085692, Map<class05946<class11647>, class08569> map) {
        this.base = class085692;
        this.overrides = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08548.class, "base;overrides", "base", "overrides"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08548.class, "base;overrides", "base", "overrides"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08548.class, "base;overrides", "base", "overrides"}, this);
    }

    public Map<class05946<class11647>, class08569> y() {
        return this.overrides;
    }

    public static class08548 N(String string) {
        return new class08548(new class08569(string), Map.of());
    }

    public static class08548 N(String string, Map<class05946<class11647>, String> map) {
        return new class08548(new class08569(string), Map.copyOf(Maps.transformValues(map, class08569::new)));
    }

    public class08569 N() {
        return this.base;
    }

    public class08569 N(class05946<class11647> class059462) {
        return this.overrides.getOrDefault(class059462, this.base);
    }
}

