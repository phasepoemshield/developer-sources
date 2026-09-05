/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08051;

public final class class03076
extends Record
implements class00381<class08051> {
    private final int offset;
    public static final class02362<class00667, class03076> N = class00381.N(class03076::N, class03076::new);

    private class03076(class00667 class006672) {
        this(class006672.E());
    }

    public class03076(int n) {
        this.offset = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03076.class, "offset", "offset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03076.class, "offset", "offset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03076.class, "offset", "offset"}, this);
    }

    public int N() {
        return this.offset;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_44898(this);
    }

    private void N(class00667 class006672) {
        class006672.L(this.offset);
    }

    public class02897<class03076> method_65080() {
        return class04248.yt;
    }
}

