/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09914;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09932
extends Record
implements class09914 {
    private final float opacity;

    public class09932(float f) {
        this.opacity = f = class09693.N((float)f);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09932.class, "opacity", "opacity"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09932.class, "opacity", "opacity"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09932.class, "opacity", "opacity"}, this);
    }

    public float y() {
        return this.opacity;
    }
}

