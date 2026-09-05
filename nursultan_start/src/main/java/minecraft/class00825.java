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
 *  minecraft.class04492
 *  minecraft.class04770
 *  minecraft.class05196
 *  minecraft.class05908
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
import minecraft.class00759;
import minecraft.class00789;
import minecraft.class00810;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class04770;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class07072;

public final class class00825
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class05196> entityPredicate;
    private final Optional<class00759> killingBlow;
    public static final Codec<class00825> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00825::N), (App)class00821.y.optionalFieldOf("entity").forGetter(class00825::i), (App)class00759.N.optionalFieldOf("killing_blow").forGetter(class00825::R)).apply(instance, class00825::new));

    public static class06915<class00825> L() {
        return class06912.Ny.N((class06516)new class00825(Optional.empty(), Optional.empty(), Optional.empty()));
    }

    public class00825(Optional<class05196> optional, Optional<class05196> optional2, Optional<class00759> optional3) {
        this.player = optional;
        this.entityPredicate = optional2;
        this.killingBlow = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00825.class, "player;entityPredicate;killingBlow", "player", "entityPredicate", "killingBlow"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00825.class, "player;entityPredicate;killingBlow", "player", "entityPredicate", "killingBlow"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00825.class, "player;entityPredicate;killingBlow", "player", "entityPredicate", "killingBlow"}, this);
    }

    public Optional<class05196> i() {
        return this.entityPredicate;
    }

    public static class06915<class00825> u() {
        return class06912.u.N((class06516)new class00825(Optional.empty(), Optional.empty(), Optional.empty()));
    }

    public static class06915<class00825> y(class00810 class008102, Optional<class00759> optional) {
        return class06912.u.N((class06516)new class00825(Optional.empty(), Optional.of(class00821.N(class008102)), optional));
    }

    public static class06915<class00825> y(Optional<class00821> optional, Optional<class00759> optional2) {
        return class06912.u.N((class06516)new class00825(Optional.empty(), class00821.N(optional), optional2));
    }

    public static class06915<class00825> y(Optional<class00821> optional, class00789 class007892) {
        return class06912.u.N((class06516)new class00825(Optional.empty(), class00821.N(optional), Optional.of(class007892.y())));
    }

    public static class06915<class00825> y(class00810 class008102, class00789 class007892) {
        return class06912.u.N((class06516)new class00825(Optional.empty(), Optional.of(class00821.N(class008102)), Optional.of(class007892.y())));
    }

    public static class06915<class00825> y() {
        return class06912.L.N((class06516)new class00825(Optional.empty(), Optional.empty(), Optional.empty()));
    }

    public static class06915<class00825> y(Optional<class00821> optional) {
        return class06912.u.N((class06516)new class00825(Optional.empty(), class00821.N(optional), Optional.empty()));
    }

    public static class06915<class00825> y(class00810 class008102) {
        return class06912.u.N((class06516)new class00825(Optional.empty(), Optional.of(class00821.N(class008102)), Optional.empty()));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class00825> N(class00810 class008102, Optional<class00759> optional) {
        return class06912.L.N((class06516)new class00825(Optional.empty(), Optional.of(class00821.N(class008102)), optional));
    }

    public static class06915<class00825> N(Optional<class00821> optional, class00789 class007892) {
        return class06912.L.N((class06516)new class00825(Optional.empty(), class00821.N(optional), Optional.of(class007892.y())));
    }

    public static class06915<class00825> N(Optional<class00821> optional, Optional<class00759> optional2) {
        return class06912.L.N((class06516)new class00825(Optional.empty(), class00821.N(optional), optional2));
    }

    public static class06915<class00825> N(class00810 class008102) {
        return class06912.L.N((class06516)new class00825(Optional.empty(), Optional.of(class00821.N(class008102)), Optional.empty()));
    }

    public static class06915<class00825> N(Optional<class00821> optional) {
        return class06912.L.N((class06516)new class00825(Optional.empty(), class00821.N(optional), Optional.empty()));
    }

    public boolean N(class04770 class047702, class05908 class059082, class07072 class070722) {
        if (this.killingBlow.isPresent() && !this.killingBlow.get().N(class047702, class070722)) {
            return false;
        }
        return this.entityPredicate.isEmpty() || this.entityPredicate.get().N(class059082);
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.entityPredicate, "entity");
    }

    public static class06915<class00825> N(class00810 class008102, class00789 class007892) {
        return class06912.L.N((class06516)new class00825(Optional.empty(), Optional.of(class00821.N(class008102)), Optional.of(class007892.y())));
    }

    public Optional<class00759> R() {
        return this.killingBlow;
    }
}

