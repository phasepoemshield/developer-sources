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

public final class class07946
extends Record {
    private final boolean runOnMainThread;
    private final boolean discoverable;

    public class07946(boolean bl, boolean bl2) {
        this.runOnMainThread = bl;
        this.discoverable = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07946.class, "runOnMainThread;discoverable", "runOnMainThread", "discoverable"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07946.class, "runOnMainThread;discoverable", "runOnMainThread", "discoverable"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07946.class, "runOnMainThread;discoverable", "runOnMainThread", "discoverable"}, this);
    }

    public boolean y() {
        return this.discoverable;
    }

    public boolean N() {
        return this.runOnMainThread;
    }
}

