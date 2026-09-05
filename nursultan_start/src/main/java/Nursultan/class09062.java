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

public class class09062
extends Record {
    public int width;
    public int height;

    class09062(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09062.class, "width;height", "width", "height"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09062.class, "width;height", "width", "height"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09062.class, "width;height", "width", "height"}, this);
    }

    public int y() {
        return this.height;
    }

    public int N() {
        return this.width;
    }
}

