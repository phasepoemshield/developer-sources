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

final class class09711
extends Record {
    private final int width;
    private final int height;

    class09711(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09711.class, "width;height", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09711.class, "width;height", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09711.class, "width;height", "width", "height"}, this);
    }

    public int y() {
        return this.height;
    }

    public int N() {
        return this.width;
    }
}

