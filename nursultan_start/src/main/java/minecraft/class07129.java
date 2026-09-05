/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07096
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07096;

public final class class07129
extends Record {
    private final String providerId;
    private final class07096 cache;
    private final int writes;

    public int L() {
        return this.writes;
    }

    public class07129(String string, class07096 class070962, int n) {
        this.providerId = string;
        this.cache = class070962;
        this.writes = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07129.class, "providerId;cache;writes", "providerId", "cache", "writes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07129.class, "providerId;cache;writes", "providerId", "cache", "writes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07129.class, "providerId;cache;writes", "providerId", "cache", "writes"}, this);
    }

    public class07096 y() {
        return this.cache;
    }

    public String N() {
        return this.providerId;
    }
}

