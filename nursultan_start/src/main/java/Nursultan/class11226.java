/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09087
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class11925
 *  Nursultan.class11993
 *  Nursultan.class12003
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class08066
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09087;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11185;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11216;
import Nursultan.class11925;
import Nursultan.class11993;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;
import com.mojang.blaze3d.opengl.GlStateManager;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class08066;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class11226 {
    private static String[] L;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object N_7;

    private class11226() {
        throw new UnsupportedOperationException(L[0]);
    }

    static {
        class11226.N();
        class11226.R();
        N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.E_0).N(4).N()).N(class11213.N((class09087)class09063.N_3, 1024)).N(36).N();
        N_2 = ((class09322)class11185.E_0).z(L[1]);
        N_3 = ((class09322)class11185.E_0).z(L[2]);
        N_4 = ((class09322)class11185.E_0).L(L[3]);
        N_5 = ((class09322)class11185.E_0).R(L[4]);
        N_6 = new Matrix4f();
        N_7 = new Matrix4f();
    }

    private static void N() {
        L = new String[5];
        class11226.L[0] = "This is a utility class and cannot be instantiated";
        class11226.L[1] = "invProjection";
        class11226.L[2] = "invView";
        class11226.L[3] = "depth_in";
        class11226.L[4] = "texel_size";
    }

    public static void N(class06889 class068892, class06889 class068893, float f, int n) {
        ((class11174)N_1).R().N((float)(class068893.M - class068892.M), (float)(class068893.B - class068892.B), (float)(class068893.Z - class068892.Z)).N(f).y(n).y();
    }

    public static void N(class09321 class093212) {
        if (((class11174)N_1).R().i() == 0) {
            return;
        }
        class08066 class080662 = class06202.Nq().e();
        ((Matrix4f)N_6).set((Matrix4fc)class093212.i()).invert();
        ((Matrix4f)N_7).set((Matrix4fc)class093212.N()).invert();
        class11925.N((class08066)class080662, (boolean)true);
        ((class11216)class11925.L_6).N(class093212.i(), class093212.N());
        ((class11174)N_1).y(class093222 -> {
            GlStateManager._activeTexture((int)33984);
            GlStateManager._bindTexture((int)class11925.y((class08066)class080662));
            ((class12003)N_4).N(0);
            ((class11993)N_5).N(1.0f / (float)class080662.N, 1.0f / (float)class080662.y);
            ((class12038)N_2).N((Matrix4f)N_6);
            ((class12038)N_3).N((Matrix4f)N_7);
        });
    }

    private static void R() {
        N_0 = 36;
    }
}

