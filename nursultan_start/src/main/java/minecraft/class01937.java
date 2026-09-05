/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class01937
extends Record {
    final String value;
    final boolean negated;
    private static final String L = "!";

    public class01937(String string, boolean bl) {
        if (string.isEmpty()) {
            throw new IllegalArgumentException("Empty term");
        }
        this.value = string;
        this.negated = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01937.class, "value;negated", "value", "negated"}, this, object);
    }

    public String toString() {
        return this.negated ? L + this.value : this.value;
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01937.class, "value;negated", "value", "negated"}, this);
    }

    public boolean y() {
        return this.negated;
    }

    public String N() {
        return this.value;
    }

    public static class01937 N(String string) {
        if (string.startsWith(L)) {
            return new class01937(string.substring(1), true);
        }
        return new class01937(string, false);
    }
}

