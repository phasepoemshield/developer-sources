/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 *  minecraft.class07085
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import minecraft.class06338;
import minecraft.class07085;
import minecraft.class07536;

public final class class08342
extends Record {
    private final Map<class07085, Float> byEquipment;
    public static final float N = 0.085f;
    public static final float y = 1.0f;
    public static final int L = 2;
    public static final class08342 u = new class08342(class07536.N_74(class07085.class, class070852 -> Float.valueOf(0.085f)));
    public static final Codec<class08342> i = Codec.unboundedMap((Codec)class07085.field_45739, (Codec)class06338.n).xmap(class08342::y, class08342::N).xmap(class08342::new, class08342::N);

    public boolean L(class07085 class070852) {
        return this.y(class070852) > 1.0f;
    }

    public class08342(Map<class07085, Float> map) {
        this.byEquipment = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08342.class, "byEquipment", "byEquipment"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08342.class, "byEquipment", "byEquipment"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08342.class, "byEquipment", "byEquipment"}, this);
    }

    private static Map<class07085, Float> y(Map<class07085, Float> map) {
        return class07536.N_74(class07085.class, class070852 -> map.getOrDefault(class070852, Float.valueOf(0.085f)));
    }

    public float y(class07085 class070852) {
        return this.byEquipment.getOrDefault(class070852, Float.valueOf(0.085f)).floatValue();
    }

    public class08342 N(class07085 class070852) {
        return this.N(class070852, 2.0f);
    }

    private static Map<class07085, Float> N(Map<class07085, Float> map) {
        HashMap<class07085, Float> hashMap = new HashMap<class07085, Float>(map);
        hashMap.values().removeIf(f -> f.floatValue() == 0.085f);
        return hashMap;
    }

    public class08342 N(class07085 class070852, float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Tried to set invalid equipment chance " + f + " for " + String.valueOf(class070852));
        }
        if (this.y(class070852) == f) {
            return this;
        }
        return new class08342(class07536.N_74(class07085.class, class070853 -> Float.valueOf(class070853 == class070852 ? f : this.y((class07085)class070853))));
    }

    public Map<class07085, Float> N() {
        return this.byEquipment;
    }
}

