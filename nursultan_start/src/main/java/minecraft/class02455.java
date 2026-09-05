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

public final class class02455
extends Record {
    final int x;
    final int z;
    final int bottomY;
    final int topY;
    final float uOffset;
    final float vOffset;
    final int lightCoords;

    public int L() {
        return this.bottomY;
    }

    public int M() {
        return this.lightCoords;
    }

    public class02455(int n, int n2, int n3, int n4, float f, float f2, int n5) {
        this.x = n;
        this.z = n2;
        this.bottomY = n3;
        this.topY = n4;
        this.uOffset = f;
        this.vOffset = f2;
        this.lightCoords = n5;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02455.class, "x;z;bottomY;topY;uOffset;vOffset;lightCoords", "x", "z", "bottomY", "topY", "uOffset", "vOffset", "lightCoords"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02455.class, "x;z;bottomY;topY;uOffset;vOffset;lightCoords", "x", "z", "bottomY", "topY", "uOffset", "vOffset", "lightCoords"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02455.class, "x;z;bottomY;topY;uOffset;vOffset;lightCoords", "x", "z", "bottomY", "topY", "uOffset", "vOffset", "lightCoords"}, this);
    }

    public float i() {
        return this.uOffset;
    }

    public int u() {
        return this.topY;
    }

    public int y() {
        return this.z;
    }

    public int N() {
        return this.x;
    }

    public float R() {
        return this.vOffset;
    }
}

