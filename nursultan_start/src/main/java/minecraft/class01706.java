/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01699
 *  minecraft.class07185
 *  minecraft.class07211
 *  org.joml.Vector3fc
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01699;
import minecraft.class07185;
import minecraft.class07211;
import org.joml.Vector3fc;

public final class class01706
extends Record {
    public final class01699[] vertices;
    final Vector3fc normal;

    public class01706(class01699[] class01699Array, float f, float f2, float f3, float f4, float f5, float f6, boolean bl, class07211 class072112) {
        this(class01699Array, (bl ? class01706.N(class072112) : class072112).m());
        float f7 = 0.0f / f5;
        float f8 = 0.0f / f6;
        class01699Array[0] = class01699Array[0].N(f3 / f5 - f7, f2 / f6 + f8);
        class01699Array[1] = class01699Array[1].N(f / f5 + f7, f2 / f6 + f8);
        class01699Array[2] = class01699Array[2].N(f / f5 + f7, f4 / f6 - f8);
        class01699Array[3] = class01699Array[3].N(f3 / f5 - f7, f4 / f6 - f8);
        if (bl) {
            int n = class01699Array.length;
            for (int i = 0; i < n / 2; ++i) {
                class01699 class016992 = class01699Array[i];
                class01699Array[i] = class01699Array[n - 1 - i];
                class01699Array[n - 1 - i] = class016992;
            }
        }
    }

    public class01706(class01699[] class01699Array, Vector3fc vector3fc) {
        this.vertices = class01699Array;
        this.normal = vector3fc;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01706.class, "vertices;normal", "vertices", "normal"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01706.class, "vertices;normal", "vertices", "normal"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01706.class, "vertices;normal", "vertices", "normal"}, this);
    }

    public Vector3fc y() {
        return this.normal;
    }

    public class01699[] N() {
        return this.vertices;
    }

    private static class07211 N(class07211 class072112) {
        return class072112.z() == class07185.field_11048 ? class072112.b() : class072112;
    }
}

