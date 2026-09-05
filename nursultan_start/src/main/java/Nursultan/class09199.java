/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09778
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09991
 *  Nursultan.class11515
 *  Nursultan.class11628
 *  Nursultan.class11872
 *  Nursultan.class12018
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09183;
import Nursultan.class09778;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09991;
import Nursultan.class11515;
import Nursultan.class11628;
import Nursultan.class11872;
import Nursultan.class12018;
import Nursultan.class12020;

public class class09199 {
    private static String[] L;
    public static Object N_0;

    private class09199() {
    }

    static {
        class09199.u();
        class09199.N();
        N_0 = (class118442, class098092) -> class09778.N((class09991)((class09991)class09183.N_3), (T class097842) -> {
            class11515 var3 = (class11515)class118442.y();
            class09785 class097852 = class098092.N("opened" + var3.P().N(), (Object)false);
            class097842.N(class12020.N((class12018)class118442.y().P()), (Boolean)class097852.L() != false ? (class09991)class09183.N_5 : (class09991)class09183.N_4);
            class097842.y(class098092.N(L[0], (class09788)class11628.N_0, (Object)new class11872(((Integer)var3.i()).intValue(), class097852, n -> {
                var3.N((Object)n);
                class118442.N().y();
            }, var3.y(), var3.L())));
        });
    }

    private static void u() {
        L = new String[1];
        class09199.L[0] = "colorPicker";
    }

    private static void N() {
    }
}

