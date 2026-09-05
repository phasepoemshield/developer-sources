/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01022
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01022;

public final class class03981<D>
extends Record {
    final D cookie;
    final class01022 finalDimensions;

    public class03981(D d, class01022 class010222) {
        this.cookie = d;
        this.finalDimensions = class010222;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03981.class, "cookie;finalDimensions", "cookie", "finalDimensions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03981.class, "cookie;finalDimensions", "cookie", "finalDimensions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03981.class, "cookie;finalDimensions", "cookie", "finalDimensions"}, this);
    }

    public class01022 y() {
        return this.finalDimensions;
    }

    public D N() {
        return this.cookie;
    }
}

