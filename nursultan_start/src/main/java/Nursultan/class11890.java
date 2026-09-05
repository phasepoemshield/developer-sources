/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11792
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01434
 *  minecraft.class01590
 *  minecraft.class03063
 *  minecraft.class04790
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class08133
 */
package Nursultan;

import Nursultan.class11792;
import Nursultan.class11904;
import Nursultan.class11913;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01434;
import minecraft.class01590;
import minecraft.class03063;
import minecraft.class04790;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08133;

public class class11890 {
    private static byte[] y;
    public static Object[] N;
    private static String[] i;

    private static void L() {
        N = new Object[y[0]];
    }

    private class11890() {
        throw new UnsupportedOperationException(i[0]);
    }

    static {
        class11890.N();
        class11890.y();
        class11890.u();
        class11890.L();
    }

    private static void u() {
        i = new String[1];
        class11890.i[0] = "This is a utility class and cannot be instantiated";
    }

    private static void y() {
        y = new byte[1];
        class11890.y[0] = 4;
    }

    private static void N() {
    }

    public static List<class11904> N(Consumer<class01237> consumer) {
        class06202 class062022 = class06202.Nq();
        if ((class08133)N[3] == null) {
            class04790 class047902 = new class04790();
            class11890.N[0] = class047902;
            class11913 class119132 = new class11913();
            class11890.N[1] = class119132;
            class11913 class119133 = new class11913();
            class11890.N[2] = class119133;
            class08133 class081332 = new class08133((class04790)N[0], class062022.yU(), (class01422)((class11913)((Object)N[1])), class062022.yW(), new class01434(), (class01422)((class11913)((Object)N[2])), (class01590)class062022.i_3);
            class11890.N[3] = class081332;
        }
        try {
            consumer.accept((class01237)((class04790)N[0]));
            ((class08133)N[3]).N();
            List<class11904> var2 = ((class11913)((Object)N[1])).y();
            return var2;
        }
        finally {
            ((class11913)((Object)N[1])).N();
            ((class11913)((Object)N[2])).N();
            ((class04790)N[0]).N();
        }
    }

    public static List<class11904> N(class07049 class070492, class06889 class068892, float f) {
        class06202 class062022 = class06202.Nq();
        class06959 class069592 = ((class03063)class062022.B_2).B.N;
        return class11890.N(class012372 -> ((class11792)class062022.Ng()).N(class070492, class069592, class068892.M, class068892.B, class068892.Z, f, new class01421(), class012372));
    }
}

