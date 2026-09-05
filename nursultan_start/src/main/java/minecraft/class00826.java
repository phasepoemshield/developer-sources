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
 *  minecraft.class06912
 *  minecraft.class06915
 *  minecraft.class07072
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00764;
import minecraft.class00798;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class04770;
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class07072;

public final class class00826
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00798> damage;
    public static final Codec<class00826> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00826::N), (App)class00798.N.optionalFieldOf("damage").forGetter(class00826::L)).apply(instance, class00826::new));

    public Optional<class00798> L() {
        return this.damage;
    }

    public class00826(Optional<class05196> optional, Optional<class00798> optional2) {
        this.player = optional;
        this.damage = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00826.class, "player;damage", "player", "damage"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00826.class, "player;damage", "player", "damage"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00826.class, "player;damage", "player", "damage"}, this);
    }

    public static class06915<class00826> y() {
        return class06912.Z.N((class06516)new class00826(Optional.empty(), Optional.empty()));
    }

    public static class06915<class00826> N(class00798 class007982) {
        return class06912.Z.N((class06516)new class00826(Optional.empty(), Optional.of(class007982)));
    }

    public static class06915<class00826> N(class00764 class007642) {
        return class06912.Z.N((class06516)new class00826(Optional.empty(), Optional.of(class007642.y())));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class04770 class047702, class07072 class070722, float f, float f2, boolean bl) {
        return !this.damage.isPresent() || this.damage.get().N(class047702, class070722, f, f2, bl);
    }
}

