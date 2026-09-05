/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableBiMap
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00609
 *  minecraft.class00610
 *  minecraft.class00619
 *  minecraft.class00751
 *  minecraft.class04206
 *  minecraft.class06338
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00609;
import minecraft.class00610;
import minecraft.class00619;
import minecraft.class00751;
import minecraft.class04206;
import minecraft.class06338;
import minecraft.class07536;

public final class class06750<Value>
extends Record {
    private final Codec<Value> valueCodec;
    private final Map<class00609, class00619<Value, ?>> modifierLibrary;
    private final Codec<class00619<Value, ?>> modifierCodec;
    private final class00610<Value> keyframeLerp;
    private final class00610<Value> stateChangeLerp;
    private final class00610<Value> spatialLerp;
    private final class00610<Value> partialTickLerp;

    public Codec<class00619<Value, ?>> L() {
        return this.modifierCodec;
    }

    public class00610<Value> M() {
        return this.partialTickLerp;
    }

    public class06750(Codec<Value> codec, Map<class00609, class00619<Value, ?>> map, Codec<class00619<Value, ?>> codec2, class00610<Value> class006102, class00610<Value> class006103, class00610<Value> class006104, class00610<Value> class006105) {
        this.valueCodec = codec;
        this.modifierLibrary = map;
        this.modifierCodec = codec2;
        this.keyframeLerp = class006102;
        this.stateChangeLerp = class006103;
        this.spatialLerp = class006104;
        this.partialTickLerp = class006105;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06750.class, "valueCodec;modifierLibrary;modifierCodec;keyframeLerp;stateChangeLerp;spatialLerp;partialTickLerp", "valueCodec", "modifierLibrary", "modifierCodec", "keyframeLerp", "stateChangeLerp", "spatialLerp", "partialTickLerp"}, this, object);
    }

    public String toString() {
        return class07536.N((class00751)class04206.NX, (Object)((Object)this));
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06750.class, "valueCodec;modifierLibrary;modifierCodec;keyframeLerp;stateChangeLerp;spatialLerp;partialTickLerp", "valueCodec", "modifierLibrary", "modifierCodec", "keyframeLerp", "stateChangeLerp", "spatialLerp", "partialTickLerp"}, this);
    }

    public class00610<Value> i() {
        return this.stateChangeLerp;
    }

    public class00610<Value> u() {
        return this.keyframeLerp;
    }

    public Map<class00609, class00619<Value, ?>> y() {
        return this.modifierLibrary;
    }

    public static <Value> class06750<Value> N(Codec<Value> codec, Map<class00609, class00619<Value, ?>> map) {
        return new class06750<Value>(codec, map, class06750.N(map), class00610.y((float)1.0f), class00610.y((float)0.0f), class00610.y((float)0.5f), class00610.y((float)0.0f));
    }

    public static <Value> class06750<Value> N(Codec<Value> codec, Map<class00609, class00619<Value, ?>> map, class00610<Value> class006102) {
        return class06750.N(codec, map, class006102, class006102);
    }

    public static <Value> class06750<Value> N(Codec<Value> codec) {
        return class06750.N(codec, Map.of());
    }

    private static <Value> Codec<class00619<Value, ?>> N(Map<class00609, class00619<Value, ?>> map) {
        ImmutableBiMap immutableBiMap = ImmutableBiMap.builder().put((Object)class00609.field_63771, (Object)class00619.N()).putAll(map).buildOrThrow();
        return class06338.N((Codec)class00609.field_63784, arg_0 -> ((ImmutableBiMap)immutableBiMap).get(arg_0), arg_0 -> ((ImmutableBiMap)immutableBiMap.inverse()).get(arg_0));
    }

    public void N(class00619<Value, ?> class006192) {
        if (class006192 != class00619.N() && !this.modifierLibrary.containsValue(class006192)) {
            throw new IllegalArgumentException("Modifier " + String.valueOf(class006192) + " is not valid for " + String.valueOf((Object)this));
        }
    }

    public static <Value> class06750<Value> N(Codec<Value> codec, Map<class00609, class00619<Value, ?>> map, class00610<Value> class006102, class00610<Value> class006103) {
        return new class06750<Value>(codec, map, class06750.N(map), class006102, class006102, class006102, class006103);
    }

    public Codec<Value> N() {
        return this.valueCodec;
    }

    public class00610<Value> R() {
        return this.spatialLerp;
    }
}

