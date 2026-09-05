/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00836
 *  minecraft.class02465
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02648
 *  minecraft.class02813
 *  minecraft.class02827
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00836;
import minecraft.class02465;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02648;
import minecraft.class02813;
import minecraft.class02827;
import minecraft.class02952;

public final class class02921
extends Record
implements class02465<class02813> {
    private final Optional<class02648<class02827, class02952>> explosions;
    private final class00836 flightDuration;
    public static final Codec<class02921> N = RecordCodecBuilder.create(instance -> instance.group((App)class02648.N(class02952.N).optionalFieldOf("explosions").forGetter(class02921::N), (App)class00836.u.optionalFieldOf("flight_duration", (Object)class00836.L).forGetter(class02921::L)).apply(instance, class02921::new));

    public class00836 L() {
        return this.flightDuration;
    }

    public class02921(Optional<class02648<class02827, class02952>> optional, class00836 class008362) {
        this.explosions = optional;
        this.flightDuration = class008362;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02921.class, "explosions;flightDuration", "explosions", "flightDuration"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02921.class, "explosions;flightDuration", "explosions", "flightDuration"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02921.class, "explosions;flightDuration", "explosions", "flightDuration"}, this);
    }

    public class02477<class02813> y() {
        return class02484.NT;
    }

    public boolean N(class02813 class028132) {
        if (this.explosions.isPresent() && !this.explosions.get().test((Iterable)class028132.y())) {
            return false;
        }
        return this.flightDuration.u(class028132.N());
    }

    public Optional<class02648<class02827, class02952>> N() {
        return this.explosions;
    }
}

