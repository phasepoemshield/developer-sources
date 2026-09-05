/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02195
 *  minecraft.class03556
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02195;
import minecraft.class03556;

public final class class10788
extends Record {
    private final class03556<class02195> type;
    private final byte x;
    private final byte y;
    private final byte rot;

    public byte L() {
        return this.y;
    }

    public class10788(class03556<class02195> class035562, byte by, byte by2, byte by3) {
        this.type = class035562;
        this.x = by;
        this.y = by2;
        this.rot = by3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10788.class, "type;x;y;rot", "type", "x", "y", "rot"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10788.class, "type;x;y;rot", "type", "x", "y", "rot"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10788.class, "type;x;y;rot", "type", "x", "y", "rot"}, this);
    }

    public byte u() {
        return this.rot;
    }

    public byte y() {
        return this.x;
    }

    public class03556<class02195> N() {
        return this.type;
    }
}

