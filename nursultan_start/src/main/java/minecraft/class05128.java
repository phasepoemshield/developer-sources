/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import minecraft.class00392;
import minecraft.class05108;

public final class class05128
extends Record
implements class05108 {
    private final int httpCode;
    private final String payload;

    @Override
    public String L() {
        return String.format(Locale.ROOT, "Realms service error (%d) with raw payload '%s'", this.httpCode, this.payload);
    }

    public class05128(int n, String string) {
        this.httpCode = n;
        this.payload = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05128.class, "httpCode;payload", "httpCode", "payload"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05128.class, "httpCode;payload", "httpCode", "payload"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05128.class, "httpCode;payload", "httpCode", "payload"}, this);
    }

    public String i() {
        return this.payload;
    }

    public int u() {
        return this.httpCode;
    }

    @Override
    public class00392 y() {
        return class00392.y((String)this.payload);
    }

    @Override
    public int N() {
        return this.httpCode;
    }
}

