/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09946
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09946;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09744
extends Record {
    private final class09946[] handles;
    private final int[] outX;
    private final int[] outY;
    private final int count;
    private final int usedBottom;
    private final int usedLayoutBottom;
    private final int newHeight;
    static final class09744 B = new class09744(new class09946[0], new int[0], new int[0], 0, 0, 0, 1);

    public int[] L() {
        return this.outY;
    }

    public int M() {
        return this.newHeight;
    }

    class09744(class09946[] class09946Array, int[] nArray, int[] nArray2, int n, int n2, int n3, int n4) {
        this.handles = class09946Array;
        this.outX = nArray;
        this.outY = nArray2;
        this.count = n;
        this.usedBottom = n2;
        this.usedLayoutBottom = n3;
        this.newHeight = n4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09744.class, "handles;outX;outY;count;usedBottom;usedLayoutBottom;newHeight", "handles", "outX", "outY", "count", "usedBottom", "usedLayoutBottom", "newHeight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09744.class, "handles;outX;outY;count;usedBottom;usedLayoutBottom;newHeight", "handles", "outX", "outY", "count", "usedBottom", "usedLayoutBottom", "newHeight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09744.class, "handles;outX;outY;count;usedBottom;usedLayoutBottom;newHeight", "handles", "outX", "outY", "count", "usedBottom", "usedLayoutBottom", "newHeight"}, this);
    }

    public int i() {
        return this.usedBottom;
    }

    public int u() {
        return this.count;
    }

    public int[] y() {
        return this.outX;
    }

    public class09946[] N() {
        return this.handles;
    }

    public int R() {
        return this.usedLayoutBottom;
    }
}

