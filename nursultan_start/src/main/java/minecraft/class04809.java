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

public final class class04809
extends Record {
    private final float u;
    private final float v;

    public class04809(float f, float f2) {
        this.u = f;
        this.v = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04809.class, "u;v", "u", "v"}, this, object);
    }

    public String toString() {
        return "(" + this.u + "," + this.v + ")";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04809.class, "u;v", "u", "v"}, this);
    }

    public float y() {
        return this.v;
    }

    public static float y(long l) {
        return Float.intBitsToFloat((int)l);
    }

    public static long N(float f, float f2) {
        long l = (long)Float.floatToIntBits(f) & 0xFFFFFFFFL;
        long l2 = (long)Float.floatToIntBits(f2) & 0xFFFFFFFFL;
        return l << 32 | l2;
    }

    public float N() {
        return this.u;
    }

    public static float N(long l) {
        return Float.intBitsToFloat((int)(l >> 32));
    }
}

