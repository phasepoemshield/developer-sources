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
 *  minecraft.class03556
 *  minecraft.class05196
 *  minecraft.class06516
 *  minecraft.class06525
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
import minecraft.class01425;
import minecraft.class03556;
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06525;
import minecraft.class06912;
import minecraft.class06915;

public final class class00773
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class03556<class06525>> potion;
    public static final Codec<class00773> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00773::N), (App)class06525.N.optionalFieldOf("potion").forGetter(class00773::L)).apply(instance, class00773::new));

    public Optional<class03556<class06525>> L() {
        return this.potion;
    }

    public class00773(Optional<class05196> optional, Optional<class03556<class06525>> optional2) {
        this.player = optional;
        this.potion = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00773.class, "player;potion", "player", "potion"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00773.class, "player;potion", "player", "potion"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00773.class, "player;potion", "player", "potion"}, this);
    }

    public static class06915<class00773> y() {
        return class06912.E.N((class06516)new class00773(Optional.empty(), Optional.empty()));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class03556<class06525> class035562) {
        return !this.potion.isPresent() || this.potion.get().equals(class035562);
    }
}

