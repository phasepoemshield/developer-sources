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

public final class class00791
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00845> item;
    private final class00836 levels;
    public static final Codec<class00791> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00791::N), (App)class00845.N.optionalFieldOf("item").forGetter(class00791::L), (App)class00836.u.optionalFieldOf("levels", (Object)class00836.L).forGetter(class00791::u)).apply(instance, class00791::new));

    public Optional<class00845> L() {
        return this.item;
    }

    public class00791(Optional<class05196> optional, Optional<class00845> optional2, class00836 class008362) {
        this.player = optional;
        this.item = optional2;
        this.levels = class008362;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00791.class, "player;item;levels", "player", "item", "levels"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00791.class, "player;item;levels", "player", "item", "levels"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00791.class, "player;item;levels", "player", "item", "levels"}, this);
    }

    public class00836 u() {
        return this.levels;
    }

    public static class06915<class00791> y() {
        return class06912.z.N((class06516)new class00791(Optional.empty(), Optional.empty(), class00836.L));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class06584 class065842, int n) {
        if (this.item.isPresent() && !this.item.get().test(class065842)) {
            return false;
        }
        return this.levels.u(n);
    }
}

