/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00761
 *  minecraft.class00810
 *  minecraft.class00817
 *  minecraft.class00821
 *  minecraft.class01425
 *  minecraft.class04492
 *  minecraft.class04782
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class06516
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class06915
 *  org.jspecify.annotations.Nullable
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
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class04782;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class06915;
import org.jspecify.annotations.Nullable;

public final class class02187
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00817> startPosition;
    private final Optional<class00761> distance;
    private final Optional<class05196> cause;
    public static final Codec<class02187> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class02187::N), (App)class00817.N.optionalFieldOf("start_position").forGetter(class02187::y), (App)class00761.N.optionalFieldOf("distance").forGetter(class02187::L), (App)class00821.y.optionalFieldOf("cause").forGetter(class02187::u)).apply(instance, class02187::new));

    public Optional<class00761> L() {
        return this.distance;
    }

    public class02187(Optional<class05196> optional, Optional<class00817> optional2, Optional<class00761> optional3, Optional<class05196> optional4) {
        this.player = optional;
        this.startPosition = optional2;
        this.distance = optional3;
        this.cause = optional4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02187.class, "player;startPosition;distance;cause", "player", "startPosition", "distance", "cause"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02187.class, "player;startPosition;distance;cause", "player", "startPosition", "distance", "cause"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02187.class, "player;startPosition;distance;cause", "player", "startPosition", "distance", "cause"}, this);
    }

    public Optional<class05196> u() {
        return this.cause;
    }

    public Optional<class00817> y() {
        return this.startPosition;
    }

    public boolean N(class04782 class047822, class06889 class068892, class06889 class068893, @Nullable class05908 class059082) {
        if (this.startPosition.isPresent() && !this.startPosition.get().N(class047822, class068892.M, class068892.B, class068892.Z)) {
            return false;
        }
        if (this.distance.isPresent() && !this.distance.get().N(class068892.M, class068892.B, class068892.Z, class068893.M, class068893.B, class068893.Z)) {
            return false;
        }
        return !this.cause.isPresent() || class059082 != null && this.cause.get().N(class059082);
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.u(), "cause");
    }

    public static class06915<class02187> N(class00761 class007612, class00810 class008102) {
        return class06912.NM.N((class06516)new class02187(Optional.empty(), Optional.empty(), Optional.of(class007612), Optional.of(class00821.N((class00810)class008102))));
    }

    public Optional<class05196> N() {
        return this.player;
    }
}

