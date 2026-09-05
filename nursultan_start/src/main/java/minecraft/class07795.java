/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00837
 *  minecraft.class00845
 *  minecraft.class05908
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class07491
 *  minecraft.class07693
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.Set;
import minecraft.class00837;
import minecraft.class00845;
import minecraft.class05908;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class07491;
import minecraft.class07693;

public final class class07795
extends Record
implements class05957 {
    private final Optional<class00845> predicate;
    public static final MapCodec<class07795> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00845.N.optionalFieldOf("predicate").forGetter(class07795::L)).apply(instance, class07795::new));

    public Optional<class00845> L() {
        return this.predicate;
    }

    public class07795(Optional<class00845> optional) {
        this.predicate = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07795.class, "predicate", "predicate"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07795.class, "predicate", "predicate"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07795.class, "predicate", "predicate"}, this);
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.U);
    }

    public boolean test(class05908 class059082) {
        class06584 class065842 = (class06584)class059082.L(class06551.U);
        return class065842 != null && (this.predicate.isEmpty() || this.predicate.get().test(class065842));
    }

    public class05955 N() {
        return class07693.z;
    }

    public static class05952 N(class00837 class008372) {
        return () -> new class07795(Optional.of(class008372.y()));
    }
}

