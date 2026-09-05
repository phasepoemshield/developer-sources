/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00810
 *  minecraft.class00821
 *  minecraft.class05908
 *  minecraft.class05919
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06551
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07491
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.Set;
import minecraft.class00810;
import minecraft.class00821;
import minecraft.class05908;
import minecraft.class05919;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06551;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07491;
import minecraft.class07693;

public final class class07700
extends Record
implements class05957 {
    private final Optional<class00821> predicate;
    private final class05919 entityTarget;
    public static final MapCodec<class07700> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00821.N.optionalFieldOf("predicate").forGetter(class07700::L), (App)class05919.field_45792.fieldOf("entity").forGetter(class07700::u)).apply(instance, class07700::new));

    public Optional<class00821> L() {
        return this.predicate;
    }

    public class07700(Optional<class00821> optional, class05919 class059192) {
        this.predicate = optional;
        this.entityTarget = class059192;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07700.class, "predicate;entityTarget", "predicate", "entityTarget"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07700.class, "predicate;entityTarget", "predicate", "entityTarget"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07700.class, "predicate;entityTarget", "predicate", "entityTarget"}, this);
    }

    public class05919 u() {
        return this.entityTarget;
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.B, this.entityTarget.N());
    }

    public boolean test(class05908 class059082) {
        class07049 class070492 = (class07049)class059082.L(this.entityTarget.N());
        class06889 class068892 = (class06889)class059082.L(class06551.B);
        return this.predicate.isEmpty() || this.predicate.get().N(class059082.u(), class068892, class070492);
    }

    public static class05952 N(class05919 class059192) {
        return class07700.N(class059192, class00810.N());
    }

    public static class05952 N(class05919 class059192, class00810 class008102) {
        return () -> new class07700(Optional.of(class008102.y()), class059192);
    }

    public static class05952 N(class05919 class059192, class00821 class008212) {
        return () -> new class07700(Optional.of(class008212), class059192);
    }

    public class05955 N() {
        return class07693.R;
    }
}

