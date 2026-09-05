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
import java.util.OptionalInt;
import minecraft.class00392;

final class class04222
extends Record {
    final class00392 message;
    final int maxWidth;
    final OptionalInt maxRows;

    public OptionalInt L() {
        return this.maxRows;
    }

    class04222(class00392 class003922, int n, OptionalInt optionalInt) {
        this.message = class003922;
        this.maxWidth = n;
        this.maxRows = optionalInt;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04222.class, "message;maxWidth;maxRows", "message", "maxWidth", "maxRows"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04222.class, "message;maxWidth;maxRows", "message", "maxWidth", "maxRows"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04222.class, "message;maxWidth;maxRows", "message", "maxWidth", "maxRows"}, this);
    }

    public int y() {
        return this.maxWidth;
    }

    public class00392 N() {
        return this.message;
    }
}

