/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00810
 *  minecraft.class00818
 *  minecraft.class00821
 *  minecraft.class00837
 *  minecraft.class00891
 *  minecraft.class01425
 *  minecraft.class01427
 *  minecraft.class02055
 *  minecraft.class05196
 *  minecraft.class06124
 *  minecraft.class06516
 *  minecraft.class06581
 *  minecraft.class06912
 *  minecraft.class06915
 *  minecraft.class07310
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00810;
import minecraft.class00818;
import minecraft.class00821;
import minecraft.class00837;
import minecraft.class00891;
import minecraft.class01425;
import minecraft.class01427;
import minecraft.class02055;
import minecraft.class05196;
import minecraft.class06124;
import minecraft.class06516;
import minecraft.class06581;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class07310;

public final class class07682
extends Record
implements class01425 {
    private final Optional<class05196> player;
    public static final Codec<class07682> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class07682::N)).apply(instance, class07682::new));

    public static class06915<class07682> L() {
        return class06912.K.N((class06516)new class07682(Optional.empty()));
    }

    public class07682(Optional<class05196> optional) {
        this.player = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07682.class, "player", "player"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07682.class, "player", "player"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07682.class, "player", "player"}, this);
    }

    public static class06915<class07682> i() {
        return class06912.l.N((class06516)new class07682(Optional.empty()));
    }

    public static class06915<class07682> u() {
        return class06912.Nu.N((class06516)new class07682(Optional.empty()));
    }

    public static class06915<class07682> y() {
        return class06912.b.N((class06516)new class07682(Optional.empty()));
    }

    public static class06915<class07682> N(Optional<class00821> optional) {
        return class06912.T.N((class06516)new class07682(class00821.N(optional)));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class07682> N(class00818 class008182) {
        return class06912.T.N((class06516)new class07682(Optional.of(class00821.N((class00810)class00810.N().N(class008182)))));
    }

    public static class06915<class07682> N(class00810 class008102) {
        return class06912.T.N((class06516)new class07682(Optional.of(class00821.N((class00821)class008102.y()))));
    }

    public static class06915<class07682> N(class02055<class00891> class020552, class02055<class06581> class020553, class00891 class008912, class06581 class065812) {
        return class07682.N(class00810.N().N(class06124.N().u(class00837.N().N(class020553, new class07310[]{class065812}))).y(class00818.N().N(class01427.N().N(class020552, new class00891[]{class008912}))));
    }
}

