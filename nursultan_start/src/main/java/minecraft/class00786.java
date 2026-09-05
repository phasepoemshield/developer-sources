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
 *  minecraft.class02055
 *  minecraft.class05196
 *  minecraft.class06516
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06912
 *  minecraft.class06915
 *  minecraft.class07310
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00821;
import minecraft.class00837;
import minecraft.class00845;
import minecraft.class01425;
import minecraft.class02055;
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class07310;

public final class class00786
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00845> item;
    public static final Codec<class00786> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00786::N), (App)class00845.N.optionalFieldOf("item").forGetter(class00786::L)).apply(instance, class00786::new));

    public Optional<class00845> L() {
        return this.item;
    }

    public class00786(Optional<class05196> optional, Optional<class00845> optional2) {
        this.player = optional;
        this.item = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00786.class, "player;item", "player", "item"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00786.class, "player;item", "player", "item"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00786.class, "player;item", "player", "item"}, this);
    }

    public static class06915<class00786> y() {
        return class06912.k.N((class06516)new class00786(Optional.empty(), Optional.empty()));
    }

    public static class06915<class00786> N(class02055<class06581> class020552, class07310 class073102) {
        return class00786.N(class00837.N().N(class020552, new class07310[]{class073102.B()}));
    }

    public static class06915<class00786> N(class00837 class008372) {
        return class06912.k.N((class06516)new class00786(Optional.empty(), Optional.of(class008372.y())));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class06584 class065842) {
        return this.item.isEmpty() || this.item.get().test(class065842);
    }
}

