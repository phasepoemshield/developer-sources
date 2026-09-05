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
 *  minecraft.class05196
 *  minecraft.class06516
 *  minecraft.class06584
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
import minecraft.class00821;
import minecraft.class00836;
import minecraft.class00845;
import minecraft.class01425;
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class06915;

public final class class00853
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00845> item;
    private final class00836 durability;
    private final class00836 delta;
    public static final Codec<class00853> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00853::N), (App)class00845.N.optionalFieldOf("item").forGetter(class00853::y), (App)class00836.u.optionalFieldOf("durability", (Object)class00836.L).forGetter(class00853::L), (App)class00836.u.optionalFieldOf("delta", (Object)class00836.L).forGetter(class00853::u)).apply(instance, class00853::new));

    public class00836 L() {
        return this.durability;
    }

    public class00853(Optional<class05196> optional, Optional<class00845> optional2, class00836 class008362, class00836 class008363) {
        this.player = optional;
        this.item = optional2;
        this.durability = class008362;
        this.delta = class008363;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00853.class, "player;item;durability;delta", "player", "item", "durability", "delta"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00853.class, "player;item;durability;delta", "player", "item", "durability", "delta"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00853.class, "player;item;durability;delta", "player", "item", "durability", "delta"}, this);
    }

    public class00836 u() {
        return this.delta;
    }

    public Optional<class00845> y() {
        return this.item;
    }

    public boolean N(class06584 class065842, int n) {
        if (this.item.isPresent() && !this.item.get().test(class065842)) {
            return false;
        }
        if (!this.durability.u(class065842.s() - n)) {
            return false;
        }
        return this.delta.u(class065842.P() - n);
    }

    public static class06915<class00853> N(Optional<class05196> optional, Optional<class00845> optional2, class00836 class008362) {
        return class06912.n.N((class06516)new class00853(optional, optional2, class008362, class00836.L));
    }

    public static class06915<class00853> N(Optional<class00845> optional, class00836 class008362) {
        return class00853.N(Optional.empty(), optional, class008362);
    }

    public Optional<class05196> N() {
        return this.player;
    }
}

