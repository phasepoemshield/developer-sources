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
 *  minecraft.class04782
 *  minecraft.class05908
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class07693
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00867;
import minecraft.class04782;
import minecraft.class05908;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class07693;

public final class class00866
extends Record
implements class05957 {
    private final Optional<Boolean> isRaining;
    private final Optional<Boolean> isThundering;
    public static final MapCodec<class00866> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("raining").forGetter(class00866::u), (App)Codec.BOOL.optionalFieldOf("thundering").forGetter(class00866::i)).apply(instance, class00866::new));

    public static class00867 L() {
        return new class00867();
    }

    public class00866(Optional<Boolean> optional, Optional<Boolean> optional2) {
        this.isRaining = optional;
        this.isThundering = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00866.class, "isRaining;isThundering", "isRaining", "isThundering"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00866.class, "isRaining;isThundering", "isRaining", "isThundering"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00866.class, "isRaining;isThundering", "isRaining", "isThundering"}, this);
    }

    public Optional<Boolean> i() {
        return this.isThundering;
    }

    public Optional<Boolean> u() {
        return this.isRaining;
    }

    public boolean test(class05908 class059082) {
        class04782 class047822 = class059082.u();
        if (this.isRaining.isPresent() && this.isRaining.get().booleanValue() != class047822.method_8419()) {
            return false;
        }
        return !this.isThundering.isPresent() || this.isThundering.get().booleanValue() == class047822.method_8546();
    }

    public class05955 N() {
        return class07693.P;
    }
}

