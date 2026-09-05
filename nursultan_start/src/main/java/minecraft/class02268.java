/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01090
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01090;

public final class class02268
extends Record {
    private final boolean required;
    private final class01090 defaultPosition;
    private final boolean fixedPosition;

    public boolean L() {
        return this.fixedPosition;
    }

    public class02268(boolean bl, class01090 class010902, boolean bl2) {
        this.required = bl;
        this.defaultPosition = class010902;
        this.fixedPosition = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02268.class, "required;defaultPosition;fixedPosition", "required", "defaultPosition", "fixedPosition"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02268.class, "required;defaultPosition;fixedPosition", "required", "defaultPosition", "fixedPosition"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02268.class, "required;defaultPosition;fixedPosition", "required", "defaultPosition", "fixedPosition"}, this);
    }

    public class01090 y() {
        return this.defaultPosition;
    }

    public boolean N() {
        return this.required;
    }
}

