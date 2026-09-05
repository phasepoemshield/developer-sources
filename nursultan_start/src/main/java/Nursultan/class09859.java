/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10021
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class10021;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09859
extends Record {
    private final class10021 viewport;
    private final float grabOffsetY;
    private final float accumulatedOffsetY;

    public float L() {
        return this.accumulatedOffsetY;
    }

    class09859(class10021 class100212, float f, float f2) {
        this.viewport = class100212;
        this.grabOffsetY = f;
        this.accumulatedOffsetY = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09859.class, "viewport;grabOffsetY;accumulatedOffsetY", "viewport", "grabOffsetY", "accumulatedOffsetY"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09859.class, "viewport;grabOffsetY;accumulatedOffsetY", "viewport", "grabOffsetY", "accumulatedOffsetY"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09859.class, "viewport;grabOffsetY;accumulatedOffsetY", "viewport", "grabOffsetY", "accumulatedOffsetY"}, this);
    }

    public float y() {
        return this.grabOffsetY;
    }

    public class10021 N() {
        return this.viewport;
    }
}

