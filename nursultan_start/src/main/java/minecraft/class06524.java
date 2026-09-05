/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06497
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06497;

public final class class06524
extends Record
implements class06497 {
    private final boolean advanced;
    private final boolean creative;

    public class06524 L() {
        return new class06524(this.advanced, true);
    }

    public class06524(boolean bl, boolean bl2) {
        this.advanced = bl;
        this.creative = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06524.class, "advanced;creative", "advanced", "creative"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06524.class, "advanced;creative", "advanced", "creative"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06524.class, "advanced;creative", "advanced", "creative"}, this);
    }

    public boolean i() {
        return this.creative;
    }

    public boolean u() {
        return this.advanced;
    }

    public boolean y() {
        return this.creative;
    }

    public boolean N() {
        return this.advanced;
    }
}

