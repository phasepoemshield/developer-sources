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

public class class11610
extends Record {
    public boolean visible;
    public float opacity;

    public class11610(float f, boolean bl) {
        this.opacity = f;
        this.visible = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11610.class, "opacity;visible", "opacity", "visible"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11610.class, "opacity;visible", "opacity", "visible"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11610.class, "opacity;visible", "opacity", "visible"}, this);
    }

    public boolean y() {
        return this.visible;
    }

    public float N() {
        return this.opacity;
    }
}

