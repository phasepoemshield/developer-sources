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

public final class class00986
extends Record {
    private final int color;
    private final int height;

    public class00986(int n, int n2) {
        this.color = n;
        this.height = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00986.class, "color;height", "color", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00986.class, "color;height", "color", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00986.class, "color;height", "color", "height"}, this);
    }

    public int y() {
        return this.height;
    }

    public int N() {
        return this.color;
    }
}

