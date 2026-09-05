/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09079
 *  Nursultan.class09080
 *  Nursultan.class09084
 *  Nursultan.class09087
 *  Nursultan.class09093
 *  Nursultan.class09322
 *  Nursultan.class11174
 *  Nursultan.class11185
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11925
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09079;
import Nursultan.class09080;
import Nursultan.class09084;
import Nursultan.class09087;
import Nursultan.class09093;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11185;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11620;
import Nursultan.class11635;
import Nursultan.class11925;
import Nursultan.class12019;
import Nursultan.class12036;
import java.util.List;
import org.joml.Vector4f;

public class class11617 {
    private static String[] L;
    private static String[] R;
    private static String[] v;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;

    private class11617() {
    }

    static {
        class11617.N();
        class11617.u();
        class11617.y();
        y_2 = class11213.N((class09087)((class09087)class09063.N_6), (int)65536);
        y_3 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.N_2).N(4).N()).N((class11213)y_2).N(6).N();
        y_4 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.N_3).N(4).N()).N((class11213)y_2).N(6).N();
        N_3 = List.of();
        N_4 = List.of();
    }

    private static void i() {
        if ((Integer)N_0 == 0 || ((class11213)y_2).M().i() == 0) {
            return;
        }
        int n = Math.min(Math.min(((List)N_3).size(), ((List)N_4).size()), 64);
        boolean bl = n > 1;
        (bl ? (class11174)y_4 : (class11174)y_3).y(class093222 -> {
            class093222.z(R[0]).N(class11925.L());
            class093222.M(R[1]).N(((Integer)N_0).intValue());
            class093222.i(v[0]).N(((Float)N_1).floatValue());
            class093222.i(v[1]).N(((Float)N_2).floatValue());
            class093222.N(L[0]).N(1.0f, 1.0f, 1.0f, 1.0f);
            class093222.N(L[1]).N(1.0f, 1.0f, 1.0f, 0.0f);
            if (!bl) {
                if (n == 1) {
                    Vector4f vector4f = (Vector4f)((List)N_3).getFirst();
                    Vector4f vector4f2 = (Vector4f)((List)N_4).getFirst();
                    class093222.L(L[2]).N(1);
                    class093222.N(L[3]).N(vector4f.x(), vector4f.y(), vector4f.z(), vector4f.w());
                    class093222.N(L[4]).N(vector4f2.x(), vector4f2.y(), vector4f2.z(), vector4f2.w());
                    return;
                }
                class093222.L(L[5]).N(0);
                return;
            }
            class093222.L(L[6]).N(n);
            class093222.L(L[7]).N(0);
            for (int i = 0; i < n; ++i) {
                Vector4f vector4f = (Vector4f)((List)N_3).get(i);
                Vector4f vector4f3 = (Vector4f)((List)N_4).get(i);
                class093222.N("u_clip_rects[" + i + "]").N(vector4f.x(), vector4f.y(), vector4f.z(), vector4f.w());
                class093222.N("u_clip_rounds[" + i + "]").N(vector4f3.x(), vector4f3.y(), vector4f3.z(), vector4f3.w());
            }
        });
    }

    private static void u() {
        R = new String[2];
        class11617.R[0] = "u_projection";
        class11617.R[1] = "texture_in";
        v = new String[2];
        class11617.v[0] = "u_mask_start";
        class11617.v[1] = "u_mask_end";
        L = new String[8];
        class11617.L[0] = "u_mask_start_color";
        class11617.L[1] = "u_mask_end_color";
        class11617.L[2] = "u_clip_flags";
        class11617.L[3] = "u_clip_rect";
        class11617.L[4] = "u_clip_round";
        class11617.L[5] = "u_clip_flags";
        class11617.L[6] = "u_clip_count";
        class11617.L[7] = "u_clip_flags";
    }

    private static void y() {
        y_0 = 64;
        y_1 = 1;
        N_0 = 0;
        N_1 = Float.valueOf(0.0f);
        N_2 = Float.valueOf(0.0f);
    }

    private static void y(class09093 class090932, class09084 class090842) {
        int n = class090932.u(class090842.j());
        if ((Integer)N_0 != 0 && (Integer)N_0 != n) {
            class11617.i();
        }
        N_0 = n;
        float f = class090842.y() / (float)Math.max(1, class090842.M());
        float f2 = class090842.y() / (float)Math.max(1, class090842.W());
        ((class11213)y_2).M().N(class090842.m()).N(class090842.b()).N(class090842.s()).N(class090842.N()).N(class090842.L()).N(class090842.z()).N(class090842.i()).N(class090842.R()).y(class090842.Z()).N(f).N(f2).y(0).y();
    }

    public static void N(String string, int n, float f, class09079 class090792, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        class09093 class090932 = class09080.u();
        if (class090932 == null || string == null || string.isEmpty()) {
            return;
        }
        int n2 = n;
        float f10 = f8 / Math.max(1.0f, f2);
        float f11 = Math.max(1.0f, (float)Math.round(f * f10));
        float f12 = class090932.N(f11, class090792, false);
        float f13 = Math.round(f6 + f3 * f10);
        float f14 = Math.round(f7 + (f9 - f12) / 2.0f);
        N_1 = Float.valueOf(f6 + f4 * f10);
        N_2 = Float.valueOf(f6 + f5 * f10);
        class11635 class116352 = class11620.y();
        N_3 = class116352.N();
        N_4 = class116352.y();
        N_0 = 0;
        class090932.u();
        class090932.N(string, f13, f14, f11, 1.0f, class090792, false, n2, class090842 -> class11617.y(class090932, class090842));
        class11617.i();
        N_3 = List.of();
        N_4 = List.of();
    }

    private static void N() {
    }
}

