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
 *  minecraft.class01072
 *  minecraft.class06338
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
import minecraft.class01072;
import minecraft.class06338;
import minecraft.class07407;

public final class class07385
extends Record {
    private final String ip;
    private final Optional<String> reason;
    private final Optional<String> source;
    private final Optional<Instant> expires;
    public static final MapCodec<class07385> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("ip").forGetter(class07385::N), (App)Codec.STRING.optionalFieldOf("reason").forGetter(class07385::y), (App)Codec.STRING.optionalFieldOf("source").forGetter(class07385::L), (App)class06338.l.optionalFieldOf("expires").forGetter(class07385::u)).apply(instance, class07385::new));

    public Optional<String> L() {
        return this.source;
    }

    public class07385(String string, Optional<String> optional, Optional<String> optional2, Optional<Instant> optional3) {
        this.ip = string;
        this.reason = optional;
        this.source = optional2;
        this.expires = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07385.class, "ip;reason;source;expires", "ip", "reason", "source", "expires"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07385.class, "ip;reason;source;expires", "ip", "reason", "source", "expires"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07385.class, "ip;reason;source;expires", "ip", "reason", "source", "expires"}, this);
    }

    public class07407 i() {
        return new class07407(this.N(), this.y().orElse(null), this.L().orElse("Management server"), this.u());
    }

    public Optional<Instant> u() {
        return this.expires;
    }

    public Optional<String> y() {
        return this.reason;
    }

    public String N() {
        return this.ip;
    }

    public static class07385 N(class01072 class010722) {
        return class07385.N(class07407.N(class010722));
    }

    public static class07385 N(class07407 class074072) {
        return new class07385(class074072.y(), Optional.ofNullable(class074072.L()), Optional.of(class074072.u()), class074072.i());
    }
}

