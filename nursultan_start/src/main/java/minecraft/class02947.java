/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class07085
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class07085;

public final class class02947
extends Record {
    private final class05946<class05074> lootTable;
    private final Map<class07085, Float> slotDropChances;
    public static final Codec<Map<class07085, Float>> N = Codec.either((Codec)Codec.FLOAT, (Codec)Codec.unboundedMap((Codec)class07085.field_45739, (Codec)Codec.FLOAT)).xmap(either -> (Map)either.map(class02947::N, Function.identity()), map -> {
        boolean bl = map.values().stream().distinct().count() == 1L;
        boolean bl2 = map.keySet().containsAll(class07085.field_54086);
        if (bl && bl2) {
            return Either.left((Object)map.values().stream().findFirst().orElse(Float.valueOf(0.0f)));
        }
        return Either.right((Object)map);
    });
    public static final Codec<class02947> y = RecordCodecBuilder.create(instance -> instance.group((App)class05074.N.fieldOf("loot_table").forGetter(class02947::N), (App)N.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(class02947::y)).apply(instance, class02947::new));

    public class02947(class05946<class05074> class059462, float f) {
        this(class059462, class02947.N(f));
    }

    public class02947(class05946<class05074> class059462, Map<class07085, Float> map) {
        this.lootTable = class059462;
        this.slotDropChances = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02947.class, "lootTable;slotDropChances", "lootTable", "slotDropChances"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02947.class, "lootTable;slotDropChances", "lootTable", "slotDropChances"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02947.class, "lootTable;slotDropChances", "lootTable", "slotDropChances"}, this);
    }

    public Map<class07085, Float> y() {
        return this.slotDropChances;
    }

    private static Map<class07085, Float> N(List<class07085> list, float f) {
        HashMap hashMap = Maps.newHashMap();
        for (class07085 class070852 : list) {
            hashMap.put(class070852, Float.valueOf(f));
        }
        return hashMap;
    }

    private static Map<class07085, Float> N(float f) {
        return class02947.N(List.of(class07085.values()), f);
    }

    public class05946<class05074> N() {
        return this.lootTable;
    }
}

