/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00753
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07209
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00753;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07209;

final class class04746
extends Record {
    private final class06889 position;
    private final float yaw;
    private final float pitch;

    public float L() {
        return this.pitch;
    }

    class04746(class06889 class068892, float f, float f2) {
        this.position = class068892;
        this.yaw = f;
        this.pitch = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04746.class, "position;yaw;pitch", "position", "yaw", "pitch"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04746.class, "position;yaw;pitch", "position", "yaw", "pitch"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04746.class, "position;yaw;pitch", "position", "yaw", "pitch"}, this);
    }

    public float y() {
        return this.yaw;
    }

    private static float N(class06889 class068892, class07209 class072092) {
        class06889 class068893 = class06889.L((class00753)class072092).u(class068892).u();
        return (float)class04995.i((double)(class04995.u((double)class068893.Z, (double)class068893.M) * 57.2957763671875 - 90.0));
    }

    public static class04746 N(class06889 class068892, class07209 class072092, float f) {
        return new class04746(class068892, class04746.N(class068892, class072092), f);
    }

    public class06889 N() {
        return this.position;
    }
}

