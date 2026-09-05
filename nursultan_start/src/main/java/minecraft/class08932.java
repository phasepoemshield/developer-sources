/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08350
 *  minecraft.class08895
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class08350;
import minecraft.class08895;
import minecraft.class08905;
import minecraft.class08910;
import minecraft.class08913;
import minecraft.class08938;

public final class class08932
extends Record
implements class08895 {
    private final class08938<?, ?> unbakedSwitch;
    private final Optional<class08895> fallback;
    public static final MapCodec<class08932> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class08938.N.forGetter(class08932::N), (App)class08913.y.optionalFieldOf("fallback").forGetter(class08932::y)).apply(instance, class08932::new));

    public class08932(class08938<?, ?> class089382, Optional<class08895> optional) {
        this.unbakedSwitch = class089382;
        this.fallback = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08932.class, "unbakedSwitch;fallback", "unbakedSwitch", "fallback"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08932.class, "unbakedSwitch;fallback", "unbakedSwitch", "fallback"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08932.class, "unbakedSwitch;fallback", "unbakedSwitch", "fallback"}, this);
    }

    public Optional<class08895> y() {
        return this.fallback;
    }

    public class08938<?, ?> N() {
        return this.unbakedSwitch;
    }

    public void method_62326(class08350 class083502) {
        this.unbakedSwitch.N(class083502);
        this.fallback.ifPresent(class088952 -> class088952.method_62326(class083502));
    }

    public MapCodec<class08932> method_65585() {
        return N;
    }

    public class08910 method_65587(class08905 class089052) {
        class08910 class089102 = this.fallback.map(class088952 -> class088952.method_65587(class089052)).orElse(class089052.i());
        return this.unbakedSwitch.N(class089052, class089102);
    }
}

