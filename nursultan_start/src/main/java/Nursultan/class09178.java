/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09778
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09991
 *  Nursultan.class11504
 *  Nursultan.class11624
 *  Nursultan.class11830
 *  Nursultan.class12018
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09183;
import Nursultan.class09778;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09991;
import Nursultan.class11504;
import Nursultan.class11624;
import Nursultan.class11830;
import Nursultan.class12018;
import Nursultan.class12020;

public class class09178 {
    private static String[] u;
    public static Object N_0;

    private static void L() {
    }

    private class09178() {
    }

    static {
        class09178.N();
        class09178.L();
        N_0 = (class118442, class098092) -> class09778.N((class09991)((class09991)class09183.N_3), (T class097842) -> {
            class11504 var3 = (class11504)class118442.y();
            class09785 class097852 = class098092.N("sliderWasMove" + var3.P().N(), (Object)false);
            class097842.N(class12020.N((class12018)class118442.y().P()), (Boolean)class097852.L() != false ? (class09991)class09183.N_5 : (class09991)class09183.N_4);
            class097842.y(class098092.N(u[0], (class09788)class11624.N_0, (Object)new class11830(((Float)var3.i()).floatValue(), var3.M(), var3.R(), var3.T(), var3.L(), arg_0 -> ((class11504)var3).N(arg_0), class097852)));
        });
    }

    private static void N() {
        u = new String[1];
        class09178.u[0] = "slider";
    }
}

