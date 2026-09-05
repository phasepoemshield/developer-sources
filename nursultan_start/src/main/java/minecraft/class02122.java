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
import minecraft.class02124;

final class class02122
extends Record {
    private final class02124 facing;
    private final int x;
    private final int y;

    public int L() {
        return this.y;
    }

    class02122(class02124 class021242, int n, int n2) {
        this.facing = class021242;
        this.x = n;
        this.y = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02122.class, "facing;x;y", "facing", "x", "y"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02122.class, "facing;x;y", "facing", "x", "y"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02122.class, "facing;x;y", "facing", "x", "y"}, this);
    }

    public int y() {
        return this.x;
    }

    public class02124 N() {
        return this.facing;
    }
}

