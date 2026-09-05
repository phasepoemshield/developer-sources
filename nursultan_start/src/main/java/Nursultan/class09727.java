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

final class class09727
extends Record {
    private final int x;
    private final int y;
    private final int paddedWidth;
    private final int paddedHeight;
    private final int newHeight;
    private final int newRowHeight;
    private final boolean appended;

    public int L() {
        return this.paddedWidth;
    }

    public boolean M() {
        return this.appended;
    }

    class09727(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        this.x = n;
        this.y = n2;
        this.paddedWidth = n3;
        this.paddedHeight = n4;
        this.newHeight = n5;
        this.newRowHeight = n6;
        this.appended = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09727.class, "x;y;paddedWidth;paddedHeight;newHeight;newRowHeight;appended", "x", "y", "paddedWidth", "paddedHeight", "newHeight", "newRowHeight", "appended"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09727.class, "x;y;paddedWidth;paddedHeight;newHeight;newRowHeight;appended", "x", "y", "paddedWidth", "paddedHeight", "newHeight", "newRowHeight", "appended"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09727.class, "x;y;paddedWidth;paddedHeight;newHeight;newRowHeight;appended", "x", "y", "paddedWidth", "paddedHeight", "newHeight", "newRowHeight", "appended"}, this);
    }

    public int i() {
        return this.newHeight;
    }

    public int u() {
        return this.paddedHeight;
    }

    public int y() {
        return this.y;
    }

    public int N() {
        return this.x;
    }

    public int R() {
        return this.newRowHeight;
    }
}

