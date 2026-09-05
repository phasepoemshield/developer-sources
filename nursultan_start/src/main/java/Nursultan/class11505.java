/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11908
 *  Nursultan.class11938
 *  minecraft.class03386
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.class11499;
import Nursultan.class11534;
import Nursultan.class11908;
import Nursultan.class11938;
import minecraft.class03386;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;

public class class11505 {
    private static String[] u;
    public static Object N_0;

    public static class11499 L() {
        class11534 class115342 = class11938.v();
        if (!class115342.u()) {
            return class11505.N();
        }
        return new class11499(class115342.M(), class115342.N());
    }

    private static void M() {
    }

    private class11505() {
        throw new UnsupportedOperationException(u[0]);
    }

    static {
        class11505.R();
        class11505.M();
        N_0 = class06202.Nq();
    }

    public static class11499 y() {
        class05363 class053632 = ((class03386)((class06202)class11505.N_0).i_5).s();
        return new class11499(class053632.R(), class053632.i());
    }

    public static class11499 N(class07049 class070492) {
        return new class11499(class070492.method_36454(), class070492.method_36455());
    }

    public static class11499 N(class11499 class114992, class06889 class068892) {
        return class11505.N(class068892).y(class114992);
    }

    public static class11499 N() {
        return class11505.N((class07049)((class04453)((class06202)class11505.N_0).T_4));
    }

    public static class11499 N(class06889 class068892) {
        class06889 class068893 = class068892.u(((class04453)((class06202)class11505.N_0).T_4).method_33571());
        return new class11499(class04995.R((float)(class11908.y((double)class04995.u((double)class068893.Z, (double)class068893.M)) - 90.0f)), -class11908.y((double)class04995.u((double)class068893.B, (double)Math.hypot(class068893.M, class068893.Z))));
    }

    private static void R() {
        u = new String[1];
        class11505.u[0] = "This is a utility class and cannot be instantiated";
    }
}

