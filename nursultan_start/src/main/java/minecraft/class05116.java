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

public final class class05116
extends Record
implements class05108 {
    private final String message;
    public static final int L = 401;

    @Override
    public String L() {
        return String.format(Locale.ROOT, "Realms authentication error with message '%s'", this.message);
    }

    public class05116(String string) {
        this.message = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05116.class, "message", "message"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05116.class, "message", "message"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05116.class, "message", "message"}, this);
    }

    public String u() {
        return this.message;
    }

    @Override
    public class00392 y() {
        return class00392.y((String)this.message);
    }

    @Override
    public int N() {
        return 401;
    }
}

