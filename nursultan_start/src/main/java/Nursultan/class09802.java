/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10003
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class10003;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09802
extends Record {
    private final float x;
    private final float y;
    private final class10003 resolvedSide;

    public class10003 L() {
        return this.resolvedSide;
    }

    class09802(float f, float f2, class10003 class100032) {
        this.x = f;
        this.y = f2;
        this.resolvedSide = class100032;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09802.class, "x;y;resolvedSide", "x", "y", "resolvedSide"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09802.class, "x;y;resolvedSide", "x", "y", "resolvedSide"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09802.class, "x;y;resolvedSide", "x", "y", "resolvedSide"}, this);
    }

    public float y() {
        return this.y;
    }

    public float N() {
        return this.x;
    }
}

