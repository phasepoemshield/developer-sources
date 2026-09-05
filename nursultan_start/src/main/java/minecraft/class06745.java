/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06722
 *  minecraft.class06730
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06722;
import minecraft.class06730;
import minecraft.class06747;
import minecraft.class06889;

public final class class06745
extends Record
implements class06730 {
    private final class06889 pos;
    private final float radius;
    private final class06747 style;
    private static final int u = 20;
    private static final float i = 0.31415927f;

    public class06747 L() {
        return this.style;
    }

    public class06745(class06889 class068892, float f, class06747 class067472) {
        this.pos = class068892;
        this.radius = f;
        this.style = class067472;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06745.class, "pos;radius;style", "pos", "radius", "style"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06745.class, "pos;radius;style", "pos", "radius", "style"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06745.class, "pos;radius;style", "pos", "radius", "style"}, this);
    }

    public float y() {
        return this.radius;
    }

    public class06889 N() {
        return this.pos;
    }

    public void N(class06722 class067222, float f) {
        int n;
        if (!this.style.y() && !this.style.N()) {
            return;
        }
        class06889[] class06889Array = new class06889[21];
        for (n = 0; n < 20; ++n) {
            class06889 class068892;
            float f2 = (float)n * 0.31415927f;
            class06889Array[n] = class068892 = this.pos.y((double)((float)((double)this.radius * Math.cos(f2))), 0.0, (double)((float)((double)this.radius * Math.sin(f2))));
        }
        class06889Array[20] = class06889Array[0];
        if (this.style.N()) {
            n = this.style.y(f);
            class067222.N(class06889Array, n);
        }
        if (this.style.y()) {
            n = this.style.N(f);
            for (int i = 0; i < 20; ++i) {
                class067222.N(class06889Array[i], class06889Array[i + 1], n, this.style.u());
            }
        }
    }
}

