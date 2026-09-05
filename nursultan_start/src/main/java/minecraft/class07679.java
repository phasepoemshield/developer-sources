/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00816
 *  minecraft.class00821
 *  minecraft.class01425
 *  minecraft.class05196
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00816;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class05196;

public final class class07679
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final class00816 distance;
    public static final Codec<class07679> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class07679::N), (App)class00816.u.optionalFieldOf("distance", (Object)class00816.L).forGetter(class07679::y)).apply(instance, class07679::new));

    public class07679(Optional<class05196> optional, class00816 class008162) {
        this.player = optional;
        this.distance = class008162;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07679.class, "player;distance", "player", "distance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07679.class, "player;distance", "player", "distance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07679.class, "player;distance", "player", "distance"}, this);
    }

    public class00816 y() {
        return this.distance;
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(double d) {
        return this.distance.i(d);
    }
}

