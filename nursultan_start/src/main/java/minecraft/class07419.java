/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05157
 *  minecraft.class08774
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import minecraft.class05157;
import minecraft.class08774;
import org.jspecify.annotations.Nullable;

final class class07419
extends Record {
    private final class08774 player;
    private final @Nullable String reason;
    private final String source;
    private final Optional<Instant> expires;

    public @Nullable String L() {
        return this.reason;
    }

    class07419(class08774 class087742, @Nullable String string, String string2, Optional<Instant> optional) {
        this.player = class087742;
        this.reason = string;
        this.source = string2;
        this.expires = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07419.class, "player;reason;source;expires", "player", "reason", "source", "expires"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07419.class, "player;reason;source;expires", "player", "reason", "source", "expires"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07419.class, "player;reason;source;expires", "player", "reason", "source", "expires"}, this);
    }

    public Optional<Instant> i() {
        return this.expires;
    }

    public String u() {
        return this.source;
    }

    public class08774 y() {
        return this.player;
    }

    static class07419 N(class05157 class051572) {
        return new class07419(Objects.requireNonNull((class08774)class051572.B()), class051572.u(), class051572.y(), Optional.ofNullable(class051572.L()).map(Date::toInstant));
    }

    class05157 N() {
        return new class05157(new class08774(this.y().N(), this.y().y()), null, this.u(), (Date)this.i().map(Date::from).orElse(null), this.L());
    }
}

