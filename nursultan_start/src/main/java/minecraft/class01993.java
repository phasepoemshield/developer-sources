/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04469
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04469;

public final class class01993
extends Record {
    private final class04469 signature;
    private final boolean pending;

    public boolean L() {
        return this.pending;
    }

    public class01993(class04469 class044692, boolean bl) {
        this.signature = class044692;
        this.pending = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01993.class, "signature;pending", "signature", "pending"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01993.class, "signature;pending", "signature", "pending"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01993.class, "signature;pending", "signature", "pending"}, this);
    }

    public class04469 y() {
        return this.signature;
    }

    public class01993 N() {
        return this.pending ? new class01993(this.signature, false) : this;
    }
}

