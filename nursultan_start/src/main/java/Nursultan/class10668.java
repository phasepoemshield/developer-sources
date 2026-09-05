/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06889;

public final class class10668
extends Record {
    private final class06889 start;
    private final class06889 end;
    private final int color;
    private final float width;

    public int L() {
        return this.color;
    }

    public class10668(class06889 class068892, class06889 class068893, int n, float f) {
        this.start = class068892;
        this.end = class068893;
        this.color = n;
        this.width = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10668.class, "start;end;color;width", "start", "end", "color", "width"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10668.class, "start;end;color;width", "start", "end", "color", "width"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10668.class, "start;end;color;width", "start", "end", "color", "width"}, this);
    }

    public float u() {
        return this.width;
    }

    public class06889 y() {
        return this.end;
    }

    public class06889 N() {
        return this.start;
    }
}

