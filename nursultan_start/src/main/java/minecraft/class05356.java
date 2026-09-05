/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.OptionalDynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05474
 *  minecraft.class06172
 *  minecraft.class07709
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class05374;
import minecraft.class05474;
import minecraft.class06172;
import minecraft.class07709;
import org.slf4j.Logger;

final class class05356<T>
extends Record {
    final Int2ObjectMap<T> sectionsByY;
    private final boolean versionChanged;

    private class05356(Int2ObjectMap<T> int2ObjectMap, boolean bl) {
        this.sectionsByY = int2ObjectMap;
        this.versionChanged = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05356.class, "sectionsByY;versionChanged", "sectionsByY", "versionChanged"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05356.class, "sectionsByY;versionChanged", "sectionsByY", "versionChanged"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05356.class, "sectionsByY;versionChanged", "sectionsByY", "versionChanged"}, this);
    }

    public boolean y() {
        return this.versionChanged;
    }

    public Int2ObjectMap<T> N() {
        return this.sectionsByY;
    }

    public static <T> class05356<T> N(Codec<T> codec, DynamicOps<class07709> dynamicOps, class07709 class077092, class06172 class061722, class05474 class054742) {
        Dynamic dynamic2 = new Dynamic(dynamicOps, (Object)class077092);
        Dynamic var6 = class061722.N(dynamic2, 1945);
        boolean bl = dynamic2 != var6;
        OptionalDynamic var8 = var6.get("Sections");
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
        for (int i = class054742.method_32891(); i <= class054742.method_31597(); ++i) {
            Optional optional = var8.get(Integer.toString(i)).result().flatMap(dynamic -> codec.parse(dynamic).resultOrPartial(arg_0 -> ((Logger)class05374.L).error(arg_0)));
            if (!optional.isPresent()) continue;
            int2ObjectOpenHashMap.put(i, optional.get());
        }
        return new class05356<T>(int2ObjectOpenHashMap, bl);
    }
}

