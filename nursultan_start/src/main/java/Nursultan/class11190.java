/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09087
 *  Nursultan.class09322
 *  Nursultan.class11925
 *  Nursultan.class11993
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  minecraft.class06202
 *  minecraft.class08844
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09087;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11185;
import Nursultan.class11200;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11215;
import Nursultan.class11925;
import Nursultan.class11993;
import Nursultan.class12019;
import Nursultan.class12036;
import java.util.function.Consumer;
import minecraft.class06202;
import minecraft.class08844;

public class class11190 {
    private static String[] u;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object N_7;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;

    static {
        class11190.R();
        class11190.i();
        y_0 = class11174.N().N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N()).N(class11213.N((class09087)class09063.N_2, 4096, 1024)).N();
        y_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N()).N(class11213.N((class09087)class09063.N_2, 4096, 1024)).N();
        y_2 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.E_7).N(4).N()).N(class11213.N((class09087)class09063.N_4, 4096)).N(6).N();
        y_3 = class11174.N().N((class11204)class11215.N_2).N(class11213.N((class09087)class09063.N_0, 4096, 1024)).N();
        N_0 = class11174.N().N((class11204)class11215.N_2).N(class11213.N((class09087)class09063.N_0, 4096, 1024)).N();
        N_1 = class11174.N().N((class11204)class11215.N_3).N(class11213.N((class09087)class09063.N_0, 4096, 1024)).N();
        N_2 = class11174.N().N((class11204)class11215.N_4).N(class11213.N((class09087)class09063.N_1, 65536)).N(6).N();
        N_3 = class11174.N().N((class11204)class11215.N_5).N(class11213.N((class09087)class09063.N_1, 65536)).N(6).N();
        N_4 = ((class09322)class11185.z_0).R(u[0]);
        N_5 = ((class09322)class11185.z_0).i(u[1]);
        N_6 = ((class09322)class11185.z_0).i(u[2]);
        N_7 = ((class09322)class11185.z_0).i(u[3]);
    }

    private static void i() {
    }

    public static void N() {
        Consumer<class09322> consumer = arg_0 -> class11190.N(class06202.Nq().Nt(), arg_0);
        ((class11174)N_2).y(consumer);
        ((class11174)N_3).y(consumer);
    }

    private static /* synthetic */ void N(class08844 class088442, class09322 class093222) {
        ((class11993)N_4).N((float)class088442.U(), (float)class088442.E());
        ((class11200)N_5).N(((Float)class11925.y_0).floatValue());
        ((class11200)N_6).N(((Float)class11925.y_1).floatValue());
        ((class11200)N_7).N(((Float)class11925.y_2).floatValue());
    }

    private static void R() {
        u = new String[4];
        class11190.u[0] = "u_viewport";
        class11190.u[1] = "u_width";
        class11190.u[2] = "u_softness";
        class11190.u[3] = "u_gamma";
    }
}

