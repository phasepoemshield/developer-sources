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

public final class class09960
extends Record {
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public int L() {
        return this.x;
    }

    public class09960(int n, int n2, int n3, int n4) {
        if (n < 0) {
            throw new IllegalArgumentException("x must be >= 0");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("y must be >= 0");
        }
        if (n3 <= 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        if (n4 <= 0) {
            throw new IllegalArgumentException("height must be > 0");
        }
        this.x = n;
        this.y = n2;
        this.width = n3;
        this.height = n4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09960.class, "x;y;width;height", "x", "y", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09960.class, "x;y;width;height", "x", "y", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09960.class, "x;y;width;height", "x", "y", "width", "height"}, this);
    }

    public int i() {
        return this.width;
    }

    public int u() {
        return this.y;
    }

    public int y() {
        return this.y + this.height;
    }

    public int N() {
        return this.x + this.width;
    }

    public int R() {
        return this.height;
    }
}

