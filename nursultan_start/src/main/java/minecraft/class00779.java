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
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;

public final class class00779
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final class00836 level;
    public static final Codec<class00779> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00779::N), (App)class00836.u.optionalFieldOf("level", (Object)class00836.L).forGetter(class00779::L)).apply(instance, class00779::new));

    public class00836 L() {
        return this.level;
    }

    public class00779(Optional<class05196> optional, class00836 class008362) {
        this.player = optional;
        this.level = class008362;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00779.class, "player;level", "player", "level"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00779.class, "player;level", "player", "level"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00779.class, "player;level", "player", "level"}, this);
    }

    public static class06915<class00779> y() {
        return class06912.W.N((class06516)new class00779(Optional.empty(), class00836.L));
    }

    public boolean N(int n) {
        return this.level.u(n);
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class00779> N(class00836 class008362) {
        return class06912.W.N((class06516)new class00779(Optional.empty(), class008362));
    }
}

