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
 *  minecraft.class05908
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06551
 *  minecraft.class06889
 *  minecraft.class07209
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
import minecraft.class00753;
import minecraft.class00817;
import minecraft.class00818;
import minecraft.class05908;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06551;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07491;
import minecraft.class07693;

public final class class00859
extends Record
implements class05957 {
    private final Optional<class00817> predicate;
    private final class07209 offset;
    private static final MapCodec<class07209> M = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.optionalFieldOf("offsetX", (Object)0).forGetter(class00753::method_10263), (App)Codec.INT.optionalFieldOf("offsetY", (Object)0).forGetter(class00753::method_10264), (App)Codec.INT.optionalFieldOf("offsetZ", (Object)0).forGetter(class00753::method_10260)).apply(instance, class07209::new));
    public static final MapCodec<class00859> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00817.N.optionalFieldOf("predicate").forGetter(class00859::L), (App)M.forGetter(class00859::u)).apply(instance, class00859::new));

    public Optional<class00817> L() {
        return this.predicate;
    }

    public class00859(Optional<class00817> optional, class07209 class072092) {
        this.predicate = optional;
        this.offset = class072092;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00859.class, "predicate;offset", "predicate", "offset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00859.class, "predicate;offset", "predicate", "offset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00859.class, "predicate;offset", "predicate", "offset"}, this);
    }

    public class07209 u() {
        return this.offset;
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.B);
    }

    public boolean test(class05908 class059082) {
        class06889 class068892 = (class06889)class059082.L(class06551.B);
        return class068892 != null && (this.predicate.isEmpty() || this.predicate.get().N(class059082.u(), class068892.N() + (double)this.offset.method_10263(), class068892.y() + (double)this.offset.method_10264(), class068892.L() + (double)this.offset.method_10260()));
    }

    public class05955 N() {
        return class07693.m;
    }

    public static class05952 N(class00818 class008182, class07209 class072092) {
        return () -> new class00859(Optional.of(class008182.y()), class072092);
    }

    public static class05952 N(class00818 class008182) {
        return () -> new class00859(Optional.of(class008182.y()), class07209.field_10980);
    }
}

