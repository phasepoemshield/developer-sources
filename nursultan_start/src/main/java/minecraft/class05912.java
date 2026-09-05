/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00821
 *  minecraft.class00836
 *  minecraft.class00837
 *  minecraft.class00845
 *  minecraft.class00891
 *  minecraft.class01425
 *  minecraft.class03556
 *  minecraft.class04206
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
import minecraft.class00500;
import minecraft.class00821;
import minecraft.class00836;
import minecraft.class00837;
import minecraft.class00845;
import minecraft.class00891;
import minecraft.class01425;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class06915;

public final class class05912
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class03556<class00891>> block;
    private final Optional<class00845> item;
    private final class00836 beesInside;
    public static final Codec<class05912> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class05912::N), (App)class04206.i.b().optionalFieldOf("block").forGetter(class05912::y), (App)class00845.N.optionalFieldOf("item").forGetter(class05912::L), (App)class00836.u.optionalFieldOf("num_bees_inside", (Object)class00836.L).forGetter(class05912::u)).apply(instance, class05912::new));

    public Optional<class00845> L() {
        return this.item;
    }

    public class05912(Optional<class05196> optional, Optional<class03556<class00891>> optional2, Optional<class00845> optional3, class00836 class008362) {
        this.player = optional;
        this.block = optional2;
        this.item = optional3;
        this.beesInside = class008362;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05912.class, "player;block;item;beesInside", "player", "block", "item", "beesInside"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05912.class, "player;block;item;beesInside", "player", "block", "item", "beesInside"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05912.class, "player;block;item;beesInside", "player", "block", "item", "beesInside"}, this);
    }

    public class00836 u() {
        return this.beesInside;
    }

    public Optional<class03556<class00891>> y() {
        return this.block;
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class00500 class005002, class06584 class065842, int n) {
        if (this.block.isPresent() && !class005002.N(this.block.get())) {
            return false;
        }
        if (this.item.isPresent() && !this.item.get().test(class065842)) {
            return false;
        }
        return this.beesInside.u(n);
    }

    public static class06915<class05912> N(class00891 class008912, class00837 class008372, class00836 class008362) {
        return class06912.H.N((class06516)new class05912(Optional.empty(), Optional.of(class008912.s()), Optional.of(class008372.y()), class008362));
    }
}

