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
 *  minecraft.class01425
 *  minecraft.class05196
 *  minecraft.class06338
 *  minecraft.class06516
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
import minecraft.class05196;
import minecraft.class06338;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;

public final class class07575
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<Integer> count;
    public static final Codec<class07575> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class07575::N), (App)class06338.b.optionalFieldOf("count").forGetter(class07575::y)).apply(instance, class07575::new));

    public class07575(Optional<class05196> optional, Optional<Integer> optional2) {
        this.player = optional;
        this.count = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07575.class, "player;count", "player", "count"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07575.class, "player;count", "player", "count"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07575.class, "player;count", "player", "count"}, this);
    }

    public Optional<Integer> y() {
        return this.count;
    }

    public boolean y(int n) {
        return this.count.isEmpty() || n >= this.count.get();
    }

    public static class06915<class07575> N(int n) {
        return class06912.o.N((class06516)new class07575(Optional.empty(), Optional.of(n)));
    }

    public Optional<class05196> N() {
        return this.player;
    }
}

