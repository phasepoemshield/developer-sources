/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.google.common.hash.HashCode;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class06860
extends Record {
    final String name;
    final byte[] payload;
    final HashCode hash;

    public HashCode L() {
        return this.hash;
    }

    class06860(String string, byte[] byArray, HashCode hashCode) {
        this.name = string;
        this.payload = byArray;
        this.hash = hashCode;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06860.class, "name;payload;hash", "name", "payload", "hash"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06860.class, "name;payload;hash", "name", "payload", "hash"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06860.class, "name;payload;hash", "name", "payload", "hash"}, this);
    }

    public byte[] y() {
        return this.payload;
    }

    public String N() {
        return this.name;
    }
}

