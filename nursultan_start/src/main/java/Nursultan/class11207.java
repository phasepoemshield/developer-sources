/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09087
 *  Nursultan.class11300
 *  Nursultan.class11884
 *  minecraft.class06889
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09087;
import Nursultan.class11178;
import Nursultan.class11184;
import Nursultan.class11213;
import Nursultan.class11300;
import Nursultan.class11884;
import minecraft.class06889;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public class class11207 {
    private static String[] B;

    private class11207() {
        throw new UnsupportedOperationException(B[1]);
    }

    static {
        class11207.y();
    }

    private static void y() {
        B = new String[2];
        class11207.B[0] = "mismatch format";
        class11207.B[1] = "This is a utility class and cannot be instantiated";
    }

    public static void N(class11213 class112132, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, float f7) {
        class11207.N(class112132, (class09087)class09063.N_1);
        class112132.M().N(matrix4f, f, f2, f3).N(matrix4f, f4, f5, f6).y(n).y(n2).N(f7).y();
    }

    private static void N(class11213 class112132, class09087 class090872) {
        if (class112132.R() != class090872) {
            throw new IllegalStateException(B[0]);
        }
    }

    public static void N(Matrix4fStack matrix4fStack, class11213 class112132, class11213 class112133, class06889 class068892, class11884 class118842, int n) {
        class11207.N(class112132, (class09087)class09063.N_1);
        float f = (float)(class118842.i() - class068892.M);
        float f2 = (float)(class118842.M() - class068892.B);
        float f3 = (float)(class118842.R() - class068892.Z);
        float f4 = (float)(class118842.N() - class068892.M);
        float f5 = (float)(class118842.y() - class068892.B);
        float f6 = (float)(class118842.u() - class068892.Z);
        class11207.N((Matrix4f)matrix4fStack, class112133, f, f2, f3, f4, f5, f6, class11300.N((int)n, (int)((int)((float)class11300.y((int)n) * 0.196f * 2.0f))));
        int n2 = class11300.N((int)n, (float)0.7f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f, f2, f3, f, f2, f6, n2, n2, 1.0f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f, f2, f6, f4, f2, f6, n2, n2, 1.0f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f4, f2, f6, f4, f2, f3, n2, n2, 1.0f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f4, f2, f3, f, f2, f3, n2, n2, 1.0f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f, f5, f3, f, f5, f6, n2, n2, 1.0f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f, f5, f6, f4, f5, f6, n2, n2, 1.0f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f4, f5, f6, f4, f5, f3, n2, n2, 1.0f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f4, f5, f3, f, f5, f3, n2, n2, 1.0f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f, f2, f3, f, f5, f3, n2, n2, 1.0f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f, f2, f6, f, f5, f6, n2, n2, 1.0f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f4, f2, f6, f4, f5, f6, n2, n2, 1.0f);
        class11207.N(class112132, (Matrix4f)matrix4fStack, f4, f2, f3, f4, f5, f3, n2, n2, 1.0f);
    }

    public static void N(Matrix4f matrix4f, class11213 class112132, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        class11207.N(class112132, (class09087)class09063.N_0);
        class11184 class111842 = class112132.M();
        int n2 = class111842.i();
        class111842.N(matrix4f, f, f2, f3).y(n).y();
        class111842.N(matrix4f, f, f2, f6).y(n).y();
        class111842.N(matrix4f, f4, f2, f6).y(n).y();
        class111842.N(matrix4f, f4, f2, f3).y(n).y();
        class111842.N(matrix4f, f, f5, f3).y(n).y();
        class111842.N(matrix4f, f, f5, f6).y(n).y();
        class111842.N(matrix4f, f4, f5, f6).y(n).y();
        class111842.N(matrix4f, f4, f5, f3).y(n).y();
        class11178 class111782 = class112132.N();
        class111782.N(n2);
        class111782.N(n2 + 1);
        class111782.N(n2 + 2);
        class111782.N(n2);
        class111782.N(n2 + 2);
        class111782.N(n2 + 3);
        class111782.N(n2 + 4);
        class111782.N(n2 + 7);
        class111782.N(n2 + 6);
        class111782.N(n2 + 4);
        class111782.N(n2 + 6);
        class111782.N(n2 + 5);
        class111782.N(n2);
        class111782.N(n2 + 4);
        class111782.N(n2 + 5);
        class111782.N(n2);
        class111782.N(n2 + 5);
        class111782.N(n2 + 1);
        class111782.N(n2 + 3);
        class111782.N(n2 + 2);
        class111782.N(n2 + 6);
        class111782.N(n2 + 3);
        class111782.N(n2 + 6);
        class111782.N(n2 + 7);
        class111782.N(n2);
        class111782.N(n2 + 3);
        class111782.N(n2 + 7);
        class111782.N(n2);
        class111782.N(n2 + 7);
        class111782.N(n2 + 4);
        class111782.N(n2 + 1);
        class111782.N(n2 + 5);
        class111782.N(n2 + 6);
        class111782.N(n2 + 1);
        class111782.N(n2 + 6);
        class111782.N(n2 + 2);
    }
}

