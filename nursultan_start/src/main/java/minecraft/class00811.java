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
 *  minecraft.class04782
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
import minecraft.class00810;
import minecraft.class00817;
import minecraft.class00818;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class04782;
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class06915;

public final class class00811
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00817> startPosition;
    private final Optional<class00761> distance;
    public static final Codec<class00811> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00811::N), (App)class00817.N.optionalFieldOf("start_position").forGetter(class00811::y), (App)class00761.N.optionalFieldOf("distance").forGetter(class00811::L)).apply(instance, class00811::new));

    public Optional<class00761> L() {
        return this.distance;
    }

    public class00811(Optional<class05196> optional, Optional<class00817> optional2, Optional<class00761> optional3) {
        this.player = optional;
        this.startPosition = optional2;
        this.distance = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00811.class, "player;startPosition;distance", "player", "startPosition", "distance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00811.class, "player;startPosition;distance", "player", "startPosition", "distance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00811.class, "player;startPosition;distance", "player", "startPosition", "distance"}, this);
    }

    public Optional<class00817> y() {
        return this.startPosition;
    }

    public static class06915<class00811> N(class00761 class007612) {
        return class06912.O.N((class06516)new class00811(Optional.empty(), Optional.empty(), Optional.of(class007612)));
    }

    public static class06915<class00811> N(class00810 class008102, class00761 class007612, class00818 class008182) {
        return class06912.r.N((class06516)new class00811(Optional.of(class00821.N(class008102)), Optional.of(class008182.y()), Optional.of(class007612)));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class00811> N(class00810 class008102, class00761 class007612) {
        return class06912.NN.N((class06516)new class00811(Optional.of(class00821.N(class008102)), Optional.empty(), Optional.of(class007612)));
    }

    public boolean N(class04782 class047822, class06889 class068892, class06889 class068893) {
        if (this.startPosition.isPresent() && !this.startPosition.get().N(class047822, class068892.M, class068892.B, class068892.Z)) {
            return false;
        }
        return !this.distance.isPresent() || this.distance.get().N(class068892.M, class068892.B, class068892.Z, class068893.M, class068893.B, class068893.Z);
    }
}

