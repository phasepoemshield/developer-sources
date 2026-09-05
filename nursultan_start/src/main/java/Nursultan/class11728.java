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

public class class11728
extends Record {
    public float pxRange;
    public float y1;
    public float x1;
    public float x2;
    public float v2;
    public float y2;
    public int atlasPageWidth;
    public float u2;
    public int atlasPage;
    public int atlasPageHeight;
    public float u1;
    public float v1;

    public float L() {
        return this.v2;
    }

    public float M() {
        return this.u1;
    }

    class11728(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n, int n2, int n3, float f9) {
        this.x1 = f;
        this.y1 = f2;
        this.x2 = f3;
        this.y2 = f4;
        this.u1 = f5;
        this.v1 = f6;
        this.u2 = f7;
        this.v2 = f8;
        this.atlasPage = n;
        this.atlasPageWidth = n2;
        this.atlasPageHeight = n3;
        this.pxRange = f9;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11728.class, "x1;y1;x2;y2;u1;v1;u2;v2;atlasPage;atlasPageWidth;atlasPageHeight;pxRange", "x1", "y1", "x2", "y2", "u1", "v1", "u2", "v2", "atlasPage", "atlasPageWidth", "atlasPageHeight", "pxRange"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11728.class, "x1;y1;x2;y2;u1;v1;u2;v2;atlasPage;atlasPageWidth;atlasPageHeight;pxRange", "x1", "y1", "x2", "y2", "u1", "v1", "u2", "v2", "atlasPage", "atlasPageWidth", "atlasPageHeight", "pxRange"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11728.class, "x1;y1;x2;y2;u1;v1;u2;v2;atlasPage;atlasPageWidth;atlasPageHeight;pxRange", "x1", "y1", "x2", "y2", "u1", "v1", "u2", "v2", "atlasPage", "atlasPageWidth", "atlasPageHeight", "pxRange"}, this);
    }

    public int B() {
        return this.atlasPageWidth;
    }

    public float Z() {
        return this.x1;
    }

    public float i() {
        return this.u2;
    }

    public float U() {
        return this.y1;
    }

    public int z() {
        return this.atlasPageHeight;
    }

    public float u() {
        return this.v1;
    }

    public float y() {
        return this.pxRange;
    }

    public float E() {
        return this.y2;
    }

    public float N() {
        return this.x2;
    }

    public int R() {
        return this.atlasPage;
    }
}

