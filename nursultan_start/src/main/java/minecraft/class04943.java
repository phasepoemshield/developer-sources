/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00821
 *  minecraft.class00836
 *  minecraft.class01425
 *  minecraft.class04492
 *  minecraft.class05196
 *  minecraft.class05908
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
import minecraft.class00821;
import minecraft.class00836;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class06915;

public final class class04943
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final class00836 signalStrength;
    private final Optional<class05196> projectile;
    public static final Codec<class04943> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class04943::N), (App)class00836.u.optionalFieldOf("signal_strength", (Object)class00836.L).forGetter(class04943::y), (App)class00821.y.optionalFieldOf("projectile").forGetter(class04943::L)).apply(instance, class04943::new));

    public Optional<class05196> L() {
        return this.projectile;
    }

    public class04943(Optional<class05196> optional, class00836 class008362, Optional<class05196> optional2) {
        this.player = optional;
        this.signalStrength = class008362;
        this.projectile = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04943.class, "player;signalStrength;projectile", "player", "signalStrength", "projectile"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04943.class, "player;signalStrength;projectile", "player", "signalStrength", "projectile"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04943.class, "player;signalStrength;projectile", "player", "signalStrength", "projectile"}, this);
    }

    public class00836 y() {
        return this.signalStrength;
    }

    public static class06915<class04943> N(class00836 class008362, Optional<class05196> optional) {
        return class06912.c.N((class06516)new class04943(Optional.empty(), class008362, optional));
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.projectile, "projectile");
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class05908 class059082, class06889 class068892, int n) {
        if (!this.signalStrength.u(n)) {
            return false;
        }
        return !this.projectile.isPresent() || this.projectile.get().N(class059082);
    }
}

