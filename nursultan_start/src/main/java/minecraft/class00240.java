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
 *  minecraft.class00265
 *  minecraft.class00273
 *  minecraft.class00299
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03767
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00265;
import minecraft.class00273;
import minecraft.class00299;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03767;
import minecraft.class04247;

public final class class00240
extends Record
implements class00265 {
    private final class00299 ingredient;
    private final class00299 fuel;
    private final class00299 result;
    private final class00299 craftingStation;
    private final int duration;
    private final float experience;
    public static final MapCodec<class00240> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00299.N.fieldOf("ingredient").forGetter(class00240::y), (App)class00299.N.fieldOf("fuel").forGetter(class00240::L), (App)class00299.N.fieldOf("result").forGetter(class00240::u), (App)class00299.N.fieldOf("crafting_station").forGetter(class00240::i), (App)Codec.INT.fieldOf("duration").forGetter(class00240::R), (App)Codec.FLOAT.fieldOf("experience").forGetter(class00240::M)).apply(instance, class00240::new));
    public static final class02362<class04247, class00240> y = class02362.N((class02362)class00299.y, class00240::y, (class02362)class00299.y, class00240::L, (class02362)class00299.y, class00240::u, (class02362)class00299.y, class00240::i, (class02362)class02389.B, class00240::R, (class02362)class02389.E, class00240::M, class00240::new);
    public static final class00273<class00240> L = new class00273(N, y);

    public class00299 L() {
        return this.fuel;
    }

    public float M() {
        return this.experience;
    }

    public class00240(class00299 class002992, class00299 class002993, class00299 class002994, class00299 class002995, int n, float f) {
        this.ingredient = class002992;
        this.fuel = class002993;
        this.result = class002994;
        this.craftingStation = class002995;
        this.duration = n;
        this.experience = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00240.class, "ingredient;fuel;result;craftingStation;duration;experience", "ingredient", "fuel", "result", "craftingStation", "duration", "experience"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00240.class, "ingredient;fuel;result;craftingStation;duration;experience", "ingredient", "fuel", "result", "craftingStation", "duration", "experience"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00240.class, "ingredient;fuel;result;craftingStation;duration;experience", "ingredient", "fuel", "result", "craftingStation", "duration", "experience"}, this);
    }

    public class00299 i() {
        return this.craftingStation;
    }

    public class00299 u() {
        return this.result;
    }

    public class00299 y() {
        return this.ingredient;
    }

    public class00273<class00240> N() {
        return L;
    }

    public boolean N(class03767 class037672) {
        return this.ingredient.N(class037672) && this.L().N(class037672) && super.N(class037672);
    }

    public int R() {
        return this.duration;
    }
}

