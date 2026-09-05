/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02566
 *  minecraft.class04995
 *  minecraft.class06722
 *  minecraft.class06730
 *  minecraft.class06889
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02566;
import minecraft.class04995;
import minecraft.class06722;
import minecraft.class06730;
import minecraft.class06889;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class class06755
extends Record
implements class06730 {
    private final class06889 start;
    private final class06889 end;
    private final int color;
    private final float width;
    public static final float N = 2.5f;

    public int L() {
        return this.color;
    }

    public class06755(class06889 class068892, class06889 class068893, int n, float f) {
        this.start = class068892;
        this.end = class068893;
        this.color = n;
        this.width = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06755.class, "start;end;color;width", "start", "end", "color", "width"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06755.class, "start;end;color;width", "start", "end", "color", "width"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06755.class, "start;end;color;width", "start", "end", "color", "width"}, this);
    }

    public float u() {
        return this.width;
    }

    public class06889 y() {
        return this.end;
    }

    public void N(class06722 class067222, float f) {
        int n = class02566.N((int)this.color, (float)f);
        class067222.N(this.start, this.end, n, this.width);
        Quaternionf quaternionf = new Quaternionf().rotationTo((Vector3fc)new Vector3f(1.0f, 0.0f, 0.0f), (Vector3fc)this.end.u(this.start).W().normalize());
        float f2 = (float)class04995.N((double)(this.end.R(this.start) * (double)0.1f), (double)0.1f, (double)1.0);
        for (Vector3f vector3f : new Vector3f[]{quaternionf.transform(-f2, f2, 0.0f, new Vector3f()), quaternionf.transform(-f2, 0.0f, f2, new Vector3f()), quaternionf.transform(-f2, -f2, 0.0f, new Vector3f()), quaternionf.transform(-f2, 0.0f, -f2, new Vector3f())}) {
            class067222.N(this.end.y((double)vector3f.x, (double)vector3f.y, (double)vector3f.z), this.end, n, this.width);
        }
    }

    public class06889 N() {
        return this.start;
    }
}

