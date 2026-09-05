/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09087
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

public class class11640 {
    private static String[] i;
    public static Object N_0;

    private class11640() {
    }

    static {
        class11640.N();
        class11640.u();
        N_0 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.Z_3).N(4).N()).N(class11213.N((class09087)((class09087)class09063.N_2), (int)6, (int)6)).N();
    }

    private static void u() {
    }

    private static void N() {
        i = new String[4];
        class11640.i[0] = "u_projection";
        class11640.i[1] = "u_view";
        class11640.i[2] = "u_size";
        class11640.i[3] = "u_color";
    }

    public static void N(int n, float f, float f2, float f3, float f4) {
        int n2 = -1;
        class11176.N((class11213)((class11174)N_0).u(), (float)f, (float)f2, (float)f3, (float)f4, (float)0.0f, (float)0.0f, (float)1.0f, (float)1.0f, (int)n2);
        ((class11174)N_0).N(class093222 -> {
            class093222.z(i[0]).N(class11925.L());
            class093222.z(i[1]).N(RenderSystem.getModelViewMatrix());
            class093222.R(i[2]).N(f3, f4);
            class093222.N(i[3]).N(class11300.N((int)n, (int)255));
        });
    }
}

