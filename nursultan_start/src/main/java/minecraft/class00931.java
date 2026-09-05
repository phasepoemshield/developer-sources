/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class07107
 *  minecraft.class07126
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class07107;
import minecraft.class07126;

public final class class00931
extends Record {
    private final class07126 particle;
    private final float scaling;
    private final float speed;
    public static final MapCodec<class00931> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07107.yE.fieldOf("particle").forGetter(class00931::N), (App)Codec.FLOAT.optionalFieldOf("scaling", (Object)Float.valueOf(1.0f)).forGetter(class00931::y), (App)Codec.FLOAT.optionalFieldOf("speed", (Object)Float.valueOf(1.0f)).forGetter(class00931::L)).apply(instance, class00931::new));
    public static final class02362<class04247, class00931> y = class02362.N((class02362)class07107.yW, class00931::N, (class02362)class02389.E, class00931::y, (class02362)class02389.E, class00931::L, class00931::new);

    public float L() {
        return this.speed;
    }

    public class00931(class07126 class071262, float f, float f2) {
        this.particle = class071262;
        this.scaling = f;
        this.speed = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00931.class, "particle;scaling;speed", "particle", "scaling", "speed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00931.class, "particle;scaling;speed", "particle", "scaling", "speed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00931.class, "particle;scaling;speed", "particle", "scaling", "speed"}, this);
    }

    public float y() {
        return this.scaling;
    }

    public class07126 N() {
        return this.particle;
    }
}

