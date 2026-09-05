/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05157
 *  minecraft.class06338
 *  minecraft.class07947
 *  minecraft.class08774
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.Optional;
import minecraft.class05157;
import minecraft.class06338;
import minecraft.class07419;
import minecraft.class07947;
import minecraft.class08774;

public final class class07395
extends Record {
    private final class07947 player;
    private final Optional<String> reason;
    private final Optional<String> source;
    private final Optional<Instant> expires;
    public static final MapCodec<class07395> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07947.N.codec().fieldOf("player").forGetter(class07395::N), (App)Codec.STRING.optionalFieldOf("reason").forGetter(class07395::y), (App)Codec.STRING.optionalFieldOf("source").forGetter(class07395::L), (App)class06338.l.optionalFieldOf("expires").forGetter(class07395::u)).apply(instance, class07395::new));

    public Optional<String> L() {
        return this.source;
    }

    public class07395(class07947 class079472, Optional<String> optional, Optional<String> optional2, Optional<Instant> optional3) {
        this.player = class079472;
        this.reason = optional;
        this.source = optional2;
        this.expires = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07395.class, "player;reason;source;expires", "player", "reason", "source", "expires"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07395.class, "player;reason;source;expires", "player", "reason", "source", "expires"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07395.class, "player;reason;source;expires", "player", "reason", "source", "expires"}, this);
    }

    public Optional<Instant> u() {
        return this.expires;
    }

    public Optional<String> y() {
        return this.reason;
    }

    public class07419 N(class08774 class087742) {
        return new class07419(class087742, this.y().orElse(null), this.L().orElse("Management server"), this.u());
    }

    public static class07395 N(class05157 class051572) {
        return class07395.N(class07419.N(class051572));
    }

    public static class07395 N(class07419 class074192) {
        return new class07395(class07947.N((class08774)class074192.y()), Optional.ofNullable(class074192.L()), Optional.of(class074192.u()), class074192.i());
    }

    public class07947 N() {
        return this.player;
    }
}

