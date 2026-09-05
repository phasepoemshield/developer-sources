/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06889;

final class class06754
extends Record {
    private final class06889 a;
    private final class06889 b;
    private final class06889 c;
    private final class06889 d;
    private final int color;

    public class06889 L() {
        return this.c;
    }

    class06754(class06889 class068892, class06889 class068893, class06889 class068894, class06889 class068895, int n) {
        this.a = class068892;
        this.b = class068893;
        this.c = class068894;
        this.d = class068895;
        this.color = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06754.class, "a;b;c;d;color", "a", "b", "c", "d", "color"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06754.class, "a;b;c;d;color", "a", "b", "c", "d", "color"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06754.class, "a;b;c;d;color", "a", "b", "c", "d", "color"}, this);
    }

    public int i() {
        return this.color;
    }

    public class06889 u() {
        return this.d;
    }

    public class06889 y() {
        return this.b;
    }

    public class06889 N() {
        return this.a;
    }
}

