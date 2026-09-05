/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00810
 *  minecraft.class00821
 *  minecraft.class00837
 *  minecraft.class00845
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
import minecraft.class00810;
import minecraft.class00821;
import minecraft.class00837;
import minecraft.class00845;
import minecraft.class01425;
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class06915;

public final class class04547
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00845> item;
    public static final Codec<class04547> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class04547::N), (App)class00845.N.optionalFieldOf("item").forGetter(class04547::y)).apply(instance, class04547::new));

    public class04547(Optional<class05196> optional, Optional<class00845> optional2) {
        this.player = optional;
        this.item = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04547.class, "player;item", "player", "item"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04547.class, "player;item", "player", "item"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04547.class, "player;item", "player", "item"}, this);
    }

    public Optional<class00845> y() {
        return this.item;
    }

    public boolean N(class06584 class065842) {
        return !this.item.isPresent() || this.item.get().test(class065842);
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class04547> N(class00810 class008102, class00837 class008372) {
        return class06912.h.N((class06516)new class04547(Optional.of(class00821.N((class00810)class008102)), Optional.of(class008372.y())));
    }
}

