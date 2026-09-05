/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.util.TimeZone
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.ibm.icu.util.TimeZone;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

final class class08340
extends Record {
    final String format;
    final String localeId;
    final Optional<TimeZone> timeZone;

    public Optional<TimeZone> L() {
        return this.timeZone;
    }

    class08340(String string, String string2, Optional<TimeZone> optional) {
        this.format = string;
        this.localeId = string2;
        this.timeZone = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08340.class, "format;localeId;timeZone", "format", "localeId", "timeZone"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08340.class, "format;localeId;timeZone", "format", "localeId", "timeZone"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08340.class, "format;localeId;timeZone", "format", "localeId", "timeZone"}, this);
    }

    public String y() {
        return this.localeId;
    }

    public String N() {
        return this.format;
    }
}

