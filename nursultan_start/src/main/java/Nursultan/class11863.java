/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09736
 *  Nursultan.class09753
 *  Nursultan.class09780
 *  Nursultan.class09782
 *  Nursultan.class09815
 *  Nursultan.class11607
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09736;
import Nursultan.class09753;
import Nursultan.class09780;
import Nursultan.class09782;
import Nursultan.class09815;
import Nursultan.class11607;
import Nursultan.class11832;
import Nursultan.class11833;
import Nursultan.class11873;
import Nursultan.class11879;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11863
extends Record
implements class09815 {
    public float positionEpsilon;
    public float velocityEpsilon;
    public float stiffness;
    public float damping;
    public float maxStepSeconds;
    public float mass;
    public static Object R_0;
    public static Object R_1;
    public static Object R_2;
    public static Object R_3;
    public static Object R_4;
    public static Object R_5;
    public static Object R_6;

    public float L() {
        return this.stiffness;
    }

    public float M() {
        return this.mass;
    }

    public class11863(float f, float f2, float f3, float f4, float f5, float f6) {
        f = class11863.N(f);
        f2 = class11863.N(f2);
        f3 = class11863.N(f3, 1.0f);
        f4 = class11863.N(f4);
        f5 = class11863.N(f5);
        f6 = class11863.N(f6, 0.008333334f);
        this.stiffness = f;
        this.damping = f2;
        this.mass = f3;
        this.positionEpsilon = f4;
        this.velocityEpsilon = f5;
        this.maxStepSeconds = f6;
    }

    static {
        class11863.E();
        R_6 = new class11863(260.0f, 34.0f, 1.0f, 0.35f, 8.0f, 0.008333334f);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11863.class, "stiffness;damping;mass;positionEpsilon;velocityEpsilon;maxStepSeconds", "stiffness", "damping", "mass", "positionEpsilon", "velocityEpsilon", "maxStepSeconds"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11863.class, "stiffness;damping;mass;positionEpsilon;velocityEpsilon;maxStepSeconds", "stiffness", "damping", "mass", "positionEpsilon", "velocityEpsilon", "maxStepSeconds"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11863.class, "stiffness;damping;mass;positionEpsilon;velocityEpsilon;maxStepSeconds", "stiffness", "damping", "mass", "positionEpsilon", "velocityEpsilon", "maxStepSeconds"}, this);
    }

    public float B() {
        return this.velocityEpsilon;
    }

    public float i() {
        return this.damping;
    }

    public boolean u() {
        return true;
    }

    public float y() {
        return this.positionEpsilon;
    }

    private static void E() {
        R_0 = Float.valueOf(260.0f);
        R_1 = Float.valueOf(34.0f);
        R_2 = Float.valueOf(1.0f);
        R_3 = Float.valueOf(0.35f);
        R_4 = Float.valueOf(8.0f);
        R_5 = Float.valueOf(0.008333334f);
        R_6 = null;
    }

    private static float N(float f) {
        return Float.isFinite(f) ? Math.max(0.0f, f) : 0.0f;
    }

    public boolean N(class09782 class097822) {
        return class097822 == class09782.FLOAT || class097822 == class09782.AXIS_SIZE || class097822 == class09782.COLOR || class097822 == class09782.TRANSLATE_LENGTH;
    }

    public class09780 N(class09736 class097362, class09753 class097532, class09753 class097533) {
        if (class097532.N() != class097533.N()) {
            throw new IllegalArgumentException("Spring transitions require matching value kinds");
        }
        return switch (((int[])class11873.N_0)[class097532.N().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> new class11833(class097532.y(), class097533.y(), this);
            case 2 -> new class11832(class097532.u(), class097533.u(), this);
            case 3 -> new class11879(class097532.L(), class097533.L(), this);
            case 4 -> new class11607(class097532.i(), class097533.i(), this);
        };
    }

    private static float N(float f, float f2) {
        return Float.isFinite(f) && f > 0.0f ? f : f2;
    }

    public static class11863 N() {
        return (class11863)((Object)R_6);
    }

    public float R() {
        return this.maxStepSeconds;
    }
}

