/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class05216
 *  minecraft.class06541
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01757;
import minecraft.class01762;
import minecraft.class01774;
import minecraft.class05216;
import minecraft.class06541;

public final class class01759
extends Record
implements class01762 {
    private final class00405 style;
    public static final class01757<class01759> N = new class01774();
    public static final class01759 y = new class01759(class00405.N);
    public static final class01759 L = new class01759(class00405.N.N(class06541.field_1061));
    public static final class01759 u = new class01759(class00405.N.N(class06541.field_1054));

    public class01759(class00405 class004052) {
        this.style = class004052;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01759.class, "style", "style"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01759.class, "style", "style"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01759.class, "style", "style"}, this);
    }

    public class00405 y() {
        return this.style;
    }

    @Override
    public class05216 N(int n) {
        return class00392.y((String)Integer.toString(n)).L(this.style);
    }

    public class01757<class01759> N() {
        return N;
    }
}

