/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01072
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import minecraft.class01072;
import org.jspecify.annotations.Nullable;

final class class07407
extends Record {
    private final String ip;
    private final @Nullable String reason;
    private final String source;
    private final Optional<Instant> expires;

    public @Nullable String L() {
        return this.reason;
    }

    class07407(String string, @Nullable String string2, String string3, Optional<Instant> optional) {
        this.ip = string;
        this.reason = string2;
        this.source = string3;
        this.expires = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07407.class, "ip;reason;source;expires", "ip", "reason", "source", "expires"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07407.class, "ip;reason;source;expires", "ip", "reason", "source", "expires"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07407.class, "ip;reason;source;expires", "ip", "reason", "source", "expires"}, this);
    }

    public Optional<Instant> i() {
        return this.expires;
    }

    public String u() {
        return this.source;
    }

    public String y() {
        return this.ip;
    }

    static class07407 N(class01072 class010722) {
        return new class07407(Objects.requireNonNull((String)class010722.B()), class010722.u(), class010722.y(), Optional.ofNullable(class010722.L()).map(Date::toInstant));
    }

    class01072 N() {
        return new class01072(this.y(), null, this.u(), (Date)this.i().map(Date::from).orElse(null), this.L());
    }
}

