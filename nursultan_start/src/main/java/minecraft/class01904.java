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
 *  minecraft.class07103
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
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;

public final class class01904
extends Record
implements class07126 {
    private final float roll;
    public static final MapCodec<class01904> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.fieldOf("roll").forGetter(class019042 -> Float.valueOf(class019042.roll))).apply(instance, class01904::new));
    public static final class02362<class04247, class01904> y = class02362.N((class02362)class02389.E, class019042 -> Float.valueOf(class019042.roll), class01904::new);

    public class01904(float f) {
        this.roll = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01904.class, "roll", "roll"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01904.class, "roll", "roll"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01904.class, "roll", "roll"}, this);
    }

    public float N() {
        return this.roll;
    }

    public class07103<class01904> method_10295() {
        return class07107.H;
    }
}

