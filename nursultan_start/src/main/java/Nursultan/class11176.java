/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09079
 *  Nursultan.class09087
 *  Nursultan.class09093
 *  Nursultan.class11925
 *  org.joml.Matrix4f
 *  org.joml.Vector2fc
 *  org.joml.Vector4fc
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09079;
import Nursultan.class09087;
import Nursultan.class09093;
import Nursultan.class11184;
import Nursultan.class11213;
import Nursultan.class11925;
import org.joml.Matrix4f;
import org.joml.Vector2fc;
import org.joml.Vector4fc;

public class class11176 {
    public static Object N_0;
    public static Object N_1;

    private class11176() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11176.y();
    }

    public static void y(class11213 class112132, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, int n) {
        class11176.N(class112132, matrix4f, f, f2, f3, f4, f5, 0.0f, 0.0f, 1.0f, 1.0f, n);
    }

    private static void y() {
        N_0 = 4;
        N_1 = -1442182646;
    }

    public static void y(class11213 class112132, float f, float f2, float f3, float f4, float f5, int n) {
        class11176.N(class112132, (Matrix4f)class11925.y_3, f, f2, f3, f4, f5, 0.0f, 0.0f, 1.0f, 1.0f, n);
    }

    public static void N(class11213 class112132, Vector2fc vector2fc, Vector2fc vector2fc2, Vector2fc vector2fc3, Vector2fc vector2fc4, int n, float f, float f2, float f3, float f4, float f5, float f6, int n2, float f7, int n3, int n4, Vector4fc vector4fc, Vector4fc vector4fc2, int n5) {
        class11176.N(class112132, vector2fc, vector2fc2, vector2fc3, vector2fc4, n, f, f2, f3, f4, f5, f6, f7, 0.0f, n2, 0, n3, n4, vector4fc, vector4fc2, n5);
    }

    public static void N(class11213 class112132, Matrix4f matrix4f, float f, float f2, float f3, int n) {
        class11176.N(class112132, (class09087)class09063.N_0);
        f = (float)Math.floor(f) + 0.5f;
        f2 = (float)Math.floor(f2) + 0.5f;
        float f4 = f3 / 2.0f;
        class11184 class111842 = class112132.M();
        int n2 = class111842.i();
        class111842.N(matrix4f, f, f2 - f4, 0.0f).y(n).y();
        class111842.N(matrix4f, f + f4, f2, 0.0f).y(n).y();
        class111842.N(matrix4f, f, f2 + f4, 0.0f).y(n).y();
        class111842.N(matrix4f, f - f4, f2, 0.0f).y(n).y();
        class112132.N().y(n2);
    }

    public static void N(class11213 class112132, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        class11176.N(class112132, (Matrix4f)class11925.y_3, f, f2, 0.0f, f3, f4, f5, f6, f7, f8, n);
    }

    public static void N(class11213 class112132, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2) {
        class11176.N(class112132, (class09087)class09063.N_4);
        class112132.M().N(f).N(f2).N(f3).N(f4).N(f5).N(f6).N(f8).N(f9).N(f7).y(n).y(n2).y();
    }

    public static void N(class11213 class112132, float f, float f2, float f3, float f4, int n) {
        class11176.N(class112132, (Matrix4f)class11925.y_3, f, f2, f3, f4, n, n);
    }

    public static void N(class11213 class112132, Matrix4f matrix4f, float f, float f2, float f3, float f4, int n, int n2) {
        class11176.N(class112132, (class09087)class09063.N_0);
        class11184 class111842 = class112132.M();
        int n3 = class111842.i();
        class111842.N(matrix4f, f + f3, f2, 0.0f).y(n).y();
        class111842.N(matrix4f, f, f2, 0.0f).y(n).y();
        class111842.N(matrix4f, f, f2 + f4, 0.0f).y(n2).y();
        class111842.N(matrix4f, f + f3, f2 + f4, 0.0f).y(n2).y();
        class112132.N().y(n3);
    }

    public static void N(class11213 class112132, Vector2fc vector2fc, Vector2fc vector2fc2, Vector2fc vector2fc3, Vector2fc vector2fc4, int n, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n2, int n3, int n4, int n5, Vector4fc vector4fc, Vector4fc vector4fc2, int n6) {
        class11176.N(class112132, (class09087)class09063.N_5);
        class112132.M().N(vector2fc.x()).N(vector2fc.y()).N(vector2fc2.x() - vector2fc.x()).N(vector2fc2.y() - vector2fc.y()).N(vector2fc4.x() - vector2fc.x()).N(vector2fc4.y() - vector2fc.y()).y(n).N(f).N(f2).N(f3).N(f4).N(f5).N(f6).N(f7).N(f8).y(n2).y(n3).N(n4).N(n5).N(n6).N(vector4fc.x()).N(vector4fc.y()).N(vector4fc.z()).N(vector4fc.w()).N(vector4fc2.x()).N(vector4fc2.y()).N(vector4fc2.z()).N(vector4fc2.w()).y();
    }

    public static void N(class09093 class090932, String string, int n, float f, float f2) {
        float f3 = n;
        float f4 = class090932.N(f3, class09079.REGULAR, false);
        float f5 = class090932.y(string, f3, class09079.REGULAR, false) + 8.0f;
        float f6 = f4 + 8.0f;
        float f7 = f - f5 / 2.0f;
        float f8 = f2 - f6 / 2.0f;
        class090932.y(string).N(f7 + 4.0f, f8 + (f6 - f4) / 2.0f).N(f3).N(class09079.REGULAR).i(-1).y(-1442182646).u(4.0f).L();
    }

    public static void N(class11213 class112132, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n) {
        class11176.N(class112132, (class09087)class09063.N_2);
        class11184 class111842 = class112132.M();
        int n2 = class111842.i();
        class111842.N(matrix4f, f + f4, f2, f3).N(f8, f7).y(n).y();
        class111842.N(matrix4f, f, f2, f3).N(f6, f7).y(n).y();
        class111842.N(matrix4f, f, f2 + f5, f3).N(f6, f9).y(n).y();
        class111842.N(matrix4f, f + f4, f2 + f5, f3).N(f8, f9).y(n).y();
        class112132.N().y(n2);
    }

    public static void N(class11213 class112132, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, int n) {
        class11176.N(class112132, matrix4f, f, f2, f3, f4, f5, 0.0f, 1.0f, 1.0f, 0.0f, n);
    }

    public static void N(class11213 class112132, float f, float f2, float f3, float f4, float f5, int n) {
        class11176.N(class112132, (Matrix4f)class11925.y_3, f, f2, f3, f4, f5, 0.0f, 1.0f, 1.0f, 0.0f, n);
    }

    public static void N(class09093 class090932, String string, float f, float f2, float f3, int n, int n2) {
        class090932.y(string).N(f + 1.0f, f2 + 1.0f).N(f3).N(class09079.REGULAR).i(n2).L();
        class090932.y(string).N(f, f2).N(f3).N(class09079.REGULAR).i(n).L();
    }

    public static void N(class11213 class112132, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        class11176.N(class112132, matrix4f, f, f2, 0.0f, f3, f4, f5, f6, f7, f8, n);
    }

    private static void N(class11213 class112132, class09087 class090872) {
        if (class112132.R() != class090872) {
            throw new IllegalStateException("mismatch format");
        }
    }

    public static void N(class11213 class112132, Matrix4f matrix4f, float f, float f2, float f3, float f4, int n) {
        class11176.N(class112132, matrix4f, f, f2, f3, f4, n, n);
    }
}

