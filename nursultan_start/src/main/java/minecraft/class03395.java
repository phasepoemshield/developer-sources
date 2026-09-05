/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04981
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03405;
import minecraft.class04981;

public final class class03395
extends Record
implements class03405 {
    private final long realmId;
    private final int slotId;

    public class03395(class04981 class049812) {
        this(class049812.y, class049812.T);
    }

    public class03395(long l, int n) {
        this.realmId = l;
        this.slotId = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03395.class, "realmId;slotId", "realmId", "slotId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03395.class, "realmId;slotId", "realmId", "slotId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03395.class, "realmId;slotId", "realmId", "slotId"}, this);
    }

    public int y() {
        return this.slotId;
    }

    public long N() {
        return this.realmId;
    }
}

