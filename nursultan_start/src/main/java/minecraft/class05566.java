/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04480
 *  minecraft.class05946
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04480;
import minecraft.class05946;

public final class class05566
extends Record
implements class04480 {
    private final class05946<?> referenced;

    public class05566(class05946<?> class059462) {
        this.referenced = class059462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05566.class, "referenced", "referenced"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05566.class, "referenced", "referenced"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05566.class, "referenced", "referenced"}, this);
    }

    public class05946<?> y() {
        return this.referenced;
    }

    public String N() {
        return "Reference to " + String.valueOf(this.referenced.N()) + " of type " + String.valueOf(this.referenced.y()) + " was used, but references are not allowed";
    }
}

