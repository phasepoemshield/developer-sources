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

public final class class01138
extends Record {
    final float animationPos;
    final float pageFlip1;
    final float pageFlip2;
    final float open;

    public float L() {
        return this.pageFlip2;
    }

    public class01138(float f, float f2, float f3, float f4) {
        this.animationPos = f;
        this.pageFlip1 = f2;
        this.pageFlip2 = f3;
        this.open = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01138.class, "animationPos;pageFlip1;pageFlip2;open", "animationPos", "pageFlip1", "pageFlip2", "open"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01138.class, "animationPos;pageFlip1;pageFlip2;open", "animationPos", "pageFlip1", "pageFlip2", "open"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01138.class, "animationPos;pageFlip1;pageFlip2;open", "animationPos", "pageFlip1", "pageFlip2", "open"}, this);
    }

    public float u() {
        return this.open;
    }

    public float y() {
        return this.pageFlip1;
    }

    public float N() {
        return this.animationPos;
    }
}

