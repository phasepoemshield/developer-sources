/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.net.InetAddresses
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04770
 *  minecraft.class06338
 *  minecraft.class07947
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.net.InetAddresses;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.Optional;
import minecraft.class04770;
import minecraft.class06338;
import minecraft.class07407;
import minecraft.class07947;
import org.jspecify.annotations.Nullable;

public final class class07390
extends Record {
    private final Optional<class07947> player;
    private final Optional<String> ip;
    private final Optional<String> reason;
    private final Optional<String> source;
    private final Optional<Instant> expires;
    public static final MapCodec<class07390> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07947.N.codec().optionalFieldOf("player").forGetter(class07390::y), (App)Codec.STRING.optionalFieldOf("ip").forGetter(class07390::L), (App)Codec.STRING.optionalFieldOf("reason").forGetter(class07390::u), (App)Codec.STRING.optionalFieldOf("source").forGetter(class07390::i), (App)class06338.l.optionalFieldOf("expires").forGetter(class07390::R)).apply(instance, class07390::new));

    public Optional<String> L() {
        return this.ip;
    }

    public class07390(Optional<class07947> optional, Optional<String> optional2, Optional<String> optional3, Optional<String> optional4, Optional<Instant> optional5) {
        this.player = optional;
        this.ip = optional2;
        this.reason = optional3;
        this.source = optional4;
        this.expires = optional5;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07390.class, "player;ip;reason;source;expires", "player", "ip", "reason", "source", "expires"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07390.class, "player;ip;reason;source;expires", "player", "ip", "reason", "source", "expires"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07390.class, "player;ip;reason;source;expires", "player", "ip", "reason", "source", "expires"}, this);
    }

    public Optional<String> i() {
        return this.source;
    }

    public Optional<String> u() {
        return this.reason;
    }

    public Optional<class07947> y() {
        return this.player;
    }

    class07407 N(class04770 class047702) {
        return new class07407(class047702.method_14209(), this.u().orElse(null), this.i().orElse("Management server"), this.R());
    }

    @Nullable class07407 N() {
        if (this.L().isEmpty() || !InetAddresses.isInetAddress((String)this.L().get())) {
            return null;
        }
        return new class07407(this.L().get(), this.u().orElse(null), this.i().orElse("Management server"), this.R());
    }

    public Optional<Instant> R() {
        return this.expires;
    }
}

