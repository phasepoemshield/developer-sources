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

public class class11030
extends Record {
    public int[] cubes;
    public int[] lines;

    class11030(int[] nArray, int[] nArray2) {
        this.lines = nArray;
        this.cubes = nArray2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11030.class, "lines;cubes", "lines", "cubes"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11030.class, "lines;cubes", "lines", "cubes"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11030.class, "lines;cubes", "lines", "cubes"}, this);
    }

    boolean u() {
        return this.lines.length == 0 && this.cubes.length == 0;
    }

    public int[] y() {
        return this.lines;
    }

    public int[] N() {
        return this.cubes;
    }
}

