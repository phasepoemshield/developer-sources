/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09756;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;

final class class09760
extends Record {
    private final int contentBottom;
    private final int layoutBottom;
    private final int currentHeight;
    private final int appendX;
    private final int appendY;
    private final int appendRowHeight;
    private final ArrayList<class09756> freeRects;

    public int L() {
        return this.currentHeight;
    }

    public ArrayList<class09756> M() {
        return this.freeRects;
    }

    class09760(int n, int n2, int n3, int n4, int n5, int n6, ArrayList<class09756> arrayList) {
        this.contentBottom = n;
        this.layoutBottom = n2;
        this.currentHeight = n3;
        this.appendX = n4;
        this.appendY = n5;
        this.appendRowHeight = n6;
        this.freeRects = arrayList;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09760.class, "contentBottom;layoutBottom;currentHeight;appendX;appendY;appendRowHeight;freeRects", "contentBottom", "layoutBottom", "currentHeight", "appendX", "appendY", "appendRowHeight", "freeRects"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09760.class, "contentBottom;layoutBottom;currentHeight;appendX;appendY;appendRowHeight;freeRects", "contentBottom", "layoutBottom", "currentHeight", "appendX", "appendY", "appendRowHeight", "freeRects"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09760.class, "contentBottom;layoutBottom;currentHeight;appendX;appendY;appendRowHeight;freeRects", "contentBottom", "layoutBottom", "currentHeight", "appendX", "appendY", "appendRowHeight", "freeRects"}, this);
    }

    public int i() {
        return this.appendY;
    }

    public int u() {
        return this.appendX;
    }

    public int y() {
        return this.layoutBottom;
    }

    public int N() {
        return this.contentBottom;
    }

    public int R() {
        return this.appendRowHeight;
    }
}

