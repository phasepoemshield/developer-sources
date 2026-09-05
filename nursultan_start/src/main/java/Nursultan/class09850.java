/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09850
extends Record {
    private final boolean shouldRunFullLayout;
    private final boolean shouldRunPositionUpdate;
    private final boolean hasScrollDirty;
    private final boolean viewportChanged;

    public boolean L() {
        return this.hasScrollDirty;
    }

    class09850(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.shouldRunFullLayout = bl;
        this.shouldRunPositionUpdate = bl2;
        this.hasScrollDirty = bl3;
        this.viewportChanged = bl4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09850.class, "shouldRunFullLayout;shouldRunPositionUpdate;hasScrollDirty;viewportChanged", "shouldRunFullLayout", "shouldRunPositionUpdate", "hasScrollDirty", "viewportChanged"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09850.class, "shouldRunFullLayout;shouldRunPositionUpdate;hasScrollDirty;viewportChanged", "shouldRunFullLayout", "shouldRunPositionUpdate", "hasScrollDirty", "viewportChanged"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09850.class, "shouldRunFullLayout;shouldRunPositionUpdate;hasScrollDirty;viewportChanged", "shouldRunFullLayout", "shouldRunPositionUpdate", "hasScrollDirty", "viewportChanged"}, this);
    }

    public boolean u() {
        return this.viewportChanged;
    }

    public boolean y() {
        return this.shouldRunPositionUpdate;
    }

    public boolean N() {
        return this.shouldRunFullLayout;
    }
}

