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

public final class class07403
extends Record {
    private final Integer connectionId;

    public class07403(Integer n) {
        this.connectionId = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07403.class, "connectionId", "connectionId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07403.class, "connectionId", "connectionId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07403.class, "connectionId", "connectionId"}, this);
    }

    public static class07403 N(Integer n) {
        return new class07403(n);
    }

    public Integer N() {
        return this.connectionId;
    }
}

