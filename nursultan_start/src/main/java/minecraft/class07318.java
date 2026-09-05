/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00759
 *  minecraft.class00789
 *  minecraft.class05908
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06551
 *  minecraft.class06889
 *  minecraft.class07072
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
import minecraft.class00759;
import minecraft.class00789;
import minecraft.class05908;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06551;
import minecraft.class06889;
import minecraft.class07072;
import minecraft.class07491;
import minecraft.class07693;

public final class class07318
extends Record
implements class05957 {
    private final Optional<class00759> predicate;
    public static final MapCodec<class07318> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00759.N.optionalFieldOf("predicate").forGetter(class07318::L)).apply(instance, class07318::new));

    public Optional<class00759> L() {
        return this.predicate;
    }

    public class07318(Optional<class00759> optional) {
        this.predicate = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07318.class, "predicate", "predicate"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07318.class, "predicate", "predicate"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07318.class, "predicate", "predicate"}, this);
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.B, class06551.i);
    }

    public boolean test(class05908 class059082) {
        class07072 class070722 = (class07072)class059082.L(class06551.i);
        class06889 class068892 = (class06889)class059082.L(class06551.B);
        if (class068892 == null || class070722 == null) {
            return false;
        }
        return this.predicate.isEmpty() || this.predicate.get().N(class059082.u(), class068892, class070722);
    }

    public class05955 N() {
        return class07693.W;
    }

    public static class05952 N(class00789 class007892) {
        return () -> new class07318(Optional.of(class007892.y()));
    }
}

