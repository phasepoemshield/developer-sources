/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import org.jspecify.annotations.Nullable;

public class class08035
extends Record {
    public @Nullable class00392 message;
    private static String[] L;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;

    private static void L() {
        L = new String[3];
        class08035.L[0] = "block.minecraft.bed.too_far_away";
        class08035.L[1] = "block.minecraft.bed.obstructed";
        class08035.L[2] = "block.minecraft.bed.not_safe";
    }

    public class08035(@Nullable class00392 class003922) {
        this.message = class003922;
    }

    static {
        class08035.L();
        class08035.u();
        y_0 = new class08035((class00392)class00392.L((String)L[0]));
        y_1 = new class08035((class00392)class00392.L((String)L[1]));
        y_2 = new class08035(null);
        y_3 = new class08035((class00392)class00392.L((String)L[2]));
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08035.class, "message", "message"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08035.class, "message", "message"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08035.class, "message", "message"}, this);
    }

    private static void u() {
    }

    public @Nullable class00392 N() {
        return this.message;
    }
}

