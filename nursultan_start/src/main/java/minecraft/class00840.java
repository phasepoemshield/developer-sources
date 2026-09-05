/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01425
 *  minecraft.class04770
 *  minecraft.class05196
 *  minecraft.class06516
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class06915
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00761;
import minecraft.class00821;
import minecraft.class00836;
import minecraft.class01425;
import minecraft.class04770;
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class06915;

public final class class00840
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00761> distance;
    private final class00836 duration;
    public static final Codec<class00840> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00840::N), (App)class00761.N.optionalFieldOf("distance").forGetter(class00840::y), (App)class00836.u.optionalFieldOf("duration", (Object)class00836.L).forGetter(class00840::L)).apply(instance, class00840::new));

    public class00836 L() {
        return this.duration;
    }

    public class00840(Optional<class05196> optional, Optional<class00761> optional2, class00836 class008362) {
        this.player = optional;
        this.distance = optional2;
        this.duration = class008362;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00840.class, "player;distance;duration", "player", "distance", "duration"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00840.class, "player;distance;duration", "player", "distance", "duration"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00840.class, "player;distance;duration", "player", "distance", "duration"}, this);
    }

    public Optional<class00761> y() {
        return this.distance;
    }

    public boolean N(class04770 class047702, class06889 class068892, int n) {
        if (this.distance.isPresent() && !this.distance.get().N(class068892.M, class068892.B, class068892.Z, class047702.method_23317(), class047702.method_23318(), class047702.method_23321())) {
            return false;
        }
        return this.duration.u(n);
    }

    public static class06915<class00840> N(class00761 class007612) {
        return class06912.t.N((class06516)new class00840(Optional.empty(), Optional.of(class007612), class00836.L));
    }

    public Optional<class05196> N() {
        return this.player;
    }
}

