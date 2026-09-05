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
 *  minecraft.class05338
 *  minecraft.class05908
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class07491
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
import java.util.Set;
import minecraft.class01397;
import minecraft.class05338;
import minecraft.class05908;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class07491;
import minecraft.class07693;

public final class class01405
extends Record
implements class05957 {
    private final Optional<Long> period;
    private final class05338 value;
    public static final MapCodec<class01405> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.LONG.optionalFieldOf("period").forGetter(class01405::L), (App)class05338.N.fieldOf("value").forGetter(class01405::u)).apply(instance, class01405::new));

    public Optional<Long> L() {
        return this.period;
    }

    public class01405(Optional<Long> optional, class05338 class053382) {
        this.period = optional;
        this.value = class053382;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01405.class, "period;value", "period", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01405.class, "period;value", "period", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01405.class, "period;value", "period", "value"}, this);
    }

    public class05338 u() {
        return this.value;
    }

    public Set<class07491<?>> y() {
        return this.value.N();
    }

    public boolean test(class05908 class059082) {
        long l = class059082.u().method_8532();
        if (this.period.isPresent()) {
            l %= this.period.get().longValue();
        }
        return this.value.y(class059082, (int)l);
    }

    public class05955 N() {
        return class07693.T;
    }

    public static class01397 N(class05338 class053382) {
        return new class01397(class053382);
    }
}

