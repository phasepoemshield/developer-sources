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

final class class09732
extends Record {
    private final int[] glyphs;

    class09732(int[] nArray) {
        this.glyphs = nArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09732.class, "glyphs", "glyphs"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09732.class, "glyphs", "glyphs"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09732.class, "glyphs", "glyphs"}, this);
    }

    boolean N(int n) {
        int n2 = 0;
        int n3 = this.glyphs.length - 1;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            if (this.glyphs[n4] < n) {
                n2 = n4 + 1;
                continue;
            }
            if (this.glyphs[n4] > n) {
                n3 = n4 - 1;
                continue;
            }
            return true;
        }
        return false;
    }

    public int[] N() {
        return this.glyphs;
    }
}

