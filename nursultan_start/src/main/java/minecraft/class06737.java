/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00734
 *  minecraft.class02566
 *  minecraft.class06747
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00734;
import minecraft.class02566;
import minecraft.class06722;
import minecraft.class06730;
import minecraft.class06747;
import minecraft.class06889;

public final class class06737
extends Record
implements class06730 {
    private final class00734 aabb;
    private final class06747 style;
    private final boolean coloredCornerStroke;

    public boolean L() {
        return this.coloredCornerStroke;
    }

    public class06737(class00734 class007342, class06747 class067472, boolean bl) {
        this.aabb = class007342;
        this.style = class067472;
        this.coloredCornerStroke = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06737.class, "aabb;style;coloredCornerStroke", "aabb", "style", "coloredCornerStroke"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06737.class, "aabb;style;coloredCornerStroke", "aabb", "style", "coloredCornerStroke"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06737.class, "aabb;style;coloredCornerStroke", "aabb", "style", "coloredCornerStroke"}, this);
    }

    public class06747 y() {
        return this.style;
    }

    public class00734 N() {
        return this.aabb;
    }

    @Override
    public void N(class06722 class067222, float f) {
        int n;
        double d = this.aabb.N;
        double d2 = this.aabb.y;
        double d3 = this.aabb.L;
        double d4 = this.aabb.u;
        double d5 = this.aabb.i;
        double d6 = this.aabb.R;
        if (this.style.N()) {
            n = this.style.y(f);
            class067222.N(new class06889(d4, d2, d3), new class06889(d4, d5, d3), new class06889(d4, d5, d6), new class06889(d4, d2, d6), n);
            class067222.N(new class06889(d, d2, d3), new class06889(d, d2, d6), new class06889(d, d5, d6), new class06889(d, d5, d3), n);
            class067222.N(new class06889(d, d2, d3), new class06889(d, d5, d3), new class06889(d4, d5, d3), new class06889(d4, d2, d3), n);
            class067222.N(new class06889(d, d2, d6), new class06889(d4, d2, d6), new class06889(d4, d5, d6), new class06889(d, d5, d6), n);
            class067222.N(new class06889(d, d5, d3), new class06889(d, d5, d6), new class06889(d4, d5, d6), new class06889(d4, d5, d3), n);
            class067222.N(new class06889(d, d2, d3), new class06889(d4, d2, d3), new class06889(d4, d2, d6), new class06889(d, d2, d6), n);
        }
        if (this.style.y()) {
            n = this.style.N(f);
            class067222.N(new class06889(d, d2, d3), new class06889(d4, d2, d3), this.coloredCornerStroke ? class02566.N((int)n, (int)-34953) : n, this.style.u());
            class067222.N(new class06889(d, d2, d3), new class06889(d, d5, d3), this.coloredCornerStroke ? class02566.N((int)n, (int)-8913033) : n, this.style.u());
            class067222.N(new class06889(d, d2, d3), new class06889(d, d2, d6), this.coloredCornerStroke ? class02566.N((int)n, (int)-8947713) : n, this.style.u());
            class067222.N(new class06889(d4, d2, d3), new class06889(d4, d5, d3), n, this.style.u());
            class067222.N(new class06889(d4, d5, d3), new class06889(d, d5, d3), n, this.style.u());
            class067222.N(new class06889(d, d5, d3), new class06889(d, d5, d6), n, this.style.u());
            class067222.N(new class06889(d, d5, d6), new class06889(d, d2, d6), n, this.style.u());
            class067222.N(new class06889(d, d2, d6), new class06889(d4, d2, d6), n, this.style.u());
            class067222.N(new class06889(d4, d2, d6), new class06889(d4, d2, d3), n, this.style.u());
            class067222.N(new class06889(d, d5, d6), new class06889(d4, d5, d6), n, this.style.u());
            class067222.N(new class06889(d4, d2, d6), new class06889(d4, d5, d6), n, this.style.u());
            class067222.N(new class06889(d4, d5, d3), new class06889(d4, d5, d6), n, this.style.u());
        }
    }
}

