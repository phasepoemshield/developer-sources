/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class08392
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import minecraft.class00392;
import minecraft.class05108;
import minecraft.class08392;
import org.jspecify.annotations.Nullable;

public final class class05136
extends Record
implements class05108 {
    private final int httpCode;
    private final int code;
    private final @Nullable String reason;
    private final @Nullable String message;

    @Override
    public String L() {
        return String.format(Locale.ROOT, "Realms service error (%d/%d/%s) with message '%s'", this.httpCode, this.code, this.reason, this.message);
    }

    public @Nullable String M() {
        return this.message;
    }

    public class05136(int n, int n2, @Nullable String string, @Nullable String string2) {
        this.httpCode = n;
        this.code = n2;
        this.reason = string;
        this.message = string2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05136.class, "httpCode;code;reason;message", "httpCode", "code", "reason", "message"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05136.class, "httpCode;code;reason;message", "httpCode", "code", "reason", "message"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05136.class, "httpCode;code;reason;message", "httpCode", "code", "reason", "message"}, this);
    }

    public int i() {
        return this.code;
    }

    public int u() {
        return this.httpCode;
    }

    @Override
    public class00392 y() {
        String string;
        String string2 = "mco.errorMessage." + this.code;
        if (class08392.N((String)string2)) {
            return class00392.L((String)string2);
        }
        if (this.reason != null && class08392.N((String)(string = "mco.errorReason." + this.reason))) {
            return class00392.L((String)string);
        }
        return this.message != null ? class00392.y((String)this.message) : N;
    }

    @Override
    public int N() {
        return this.code;
    }

    public @Nullable String R() {
        return this.reason;
    }
}

