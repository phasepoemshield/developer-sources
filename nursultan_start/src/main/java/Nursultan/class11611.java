/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09087
 *  Nursultan.class09181
 *  Nursultan.class09222
 *  Nursultan.class09322
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11300
 *  Nursultan.class11925
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  com.mojang.blaze3d.systems.RenderSystem
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09087;
import Nursultan.class09181;
import Nursultan.class09222;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11300;
import Nursultan.class11925;
import Nursultan.class12019;
import Nursultan.class12036;
import com.mojang.blaze3d.systems.RenderSystem;

public class class11611 {
    private static String[] i;
    private static String[] B;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    private class11611() {
    }

    static {
        class11611.N();
        class11611.R();
        N_2 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.Z_4).N(4).N()).N(class11213.N((class09087)((class09087)class09063.N_2), (int)6, (int)6)).N();
    }

    public static void N(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        int n5 = -1;
        class11176.N((class11213)((class11174)N_2).u(), (float)f, (float)f2, (float)f3, (float)f4, (float)0.0f, (float)0.0f, (float)1.0f, (float)1.0f, (int)n5);
        ((class11174)N_2).N(class093222 -> {
            class093222.z(i[0]).N(class11925.L());
            class093222.z(i[1]).N(RenderSystem.getModelViewMatrix());
            class093222.R(i[2]).N(f3, f4);
            class093222.i(i[3]).N(10.0f * class09222.L());
            class093222.i(i[4]).N(1.0f * class09222.L());
            class093222.N(i[5]).N(class11300.N((int)n, (int)255));
            class093222.N(i[6]).N(class11300.N((int)n2, (int)255));
            class093222.N(i[7]).N(class11300.N((int)n3, (int)255));
            class093222.N(B[0]).N(class11300.N((int)n4, (int)255));
            class093222.N(B[1]).N(((Integer)class09181.L_2).intValue());
        });
    }

    private static void N() {
        i = new String[8];
        class11611.i[0] = "u_projection";
        class11611.i[1] = "u_view";
        class11611.i[2] = "u_size";
        class11611.i[3] = "u_radius";
        class11611.i[4] = "u_border_width";
        class11611.i[5] = "u_top_left";
        class11611.i[6] = "u_top_right";
        class11611.i[7] = "u_bottom_left";
        B = new String[2];
        class11611.B[0] = "u_bottom_right";
        class11611.B[1] = "u_border_color";
    }

    private static void R() {
        N_0 = Float.valueOf(10.0f);
        N_1 = Float.valueOf(1.0f);
    }
}

