/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import minecraft.class00392;
import minecraft.class05108;
import minecraft.class05121;
import org.jspecify.annotations.Nullable;

public final class class05124
extends Record
implements class05108 {
    private final int httpCode;
    private final @Nullable class00392 payload;
    public static final class05124 L = new class05124(429, (class00392)class00392.L((String)"mco.errorMessage.serviceBusy"));
    public static final class00392 u = class00392.L((String)"mco.errorMessage.retry");
    public static final String i = "<body>";
    public static final String R = "</body>";

    @Override
    public String L() {
        if (this.payload != null) {
            return String.format(Locale.ROOT, "Realms service error (%d) with message '%s'", this.httpCode, this.payload.getString());
        }
        return String.format(Locale.ROOT, "Realms service error (%d) with no payload", this.httpCode);
    }

    public class05124(int n, @Nullable class00392 class003922) {
        this.httpCode = n;
        this.payload = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05124.class, "httpCode;payload", "httpCode", "payload"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05124.class, "httpCode;payload", "httpCode", "payload"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05124.class, "httpCode;payload", "httpCode", "payload"}, this);
    }

    public int i() {
        return this.httpCode;
    }

    public static class05124 u() {
        return new class05124(500, (class00392)class00392.L((String)"mco.errorMessage.realmsService.configurationError"));
    }

    @Override
    public class00392 y() {
        return this.payload != null ? this.payload : N;
    }

    public static class05124 y(int n) {
        return new class05124(n, null);
    }

    public static class05124 y(int n, String string) {
        int n2 = string.indexOf(i);
        int n3 = string.indexOf(R);
        if (n2 >= 0 && n3 > n2) {
            return new class05124(n, (class00392)class00392.y((String)string.substring(n2 + i.length(), n3).trim()));
        }
        y.error("Got an error with an unreadable html body {}", (Object)string);
        return new class05124(n, null);
    }

    public static class05124 N(class05121 class051212) {
        return new class05124(500, (class00392)class00392.N((String)"mco.errorMessage.realmsService.connectivity", (Object[])new Object[]{class051212.getMessage()}));
    }

    public static class05124 N(int n) {
        return new class05124(n, u);
    }

    @Override
    public int N() {
        return this.httpCode;
    }

    public static class05124 N(String string) {
        return new class05124(500, (class00392)class00392.N((String)"mco.errorMessage.realmsService.unknownCompatibility", (Object[])new Object[]{string}));
    }

    public @Nullable class00392 R() {
        return this.payload;
    }
}

