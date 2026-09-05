/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02566
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02566;
import minecraft.class06722;
import minecraft.class06730;
import minecraft.class06889;

public final class class06721
extends Record
implements class06730 {
    private final class06889 pos;
    private final int color;
    private final float size;

    public float L() {
        return this.size;
    }

    public class06721(class06889 class068892, int n, float f) {
        this.pos = class068892;
        this.color = n;
        this.size = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06721.class, "pos;color;size", "pos", "color", "size"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06721.class, "pos;color;size", "pos", "color", "size"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06721.class, "pos;color;size", "pos", "color", "size"}, this);
    }

    public int y() {
        return this.color;
    }

    public class06889 N() {
        return this.pos;
    }

    @Override
    public void N(class06722 class067222, float f) {
        class067222.N(this.pos, class02566.N((int)this.color, (float)f), this.size);
    }
}

