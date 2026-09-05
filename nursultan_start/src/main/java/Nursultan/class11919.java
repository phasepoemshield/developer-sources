/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11281
 *  Nursultan.class11322
 *  Nursultan.class11938
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class07050
 *  minecraft.class07085
 *  minecraft.class07510
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.class11281;
import Nursultan.class11322;
import Nursultan.class11938;
import java.util.function.BiConsumer;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class07050;
import minecraft.class07085;
import minecraft.class07510;
import minecraft.class08036;

public class class11919 {
    private static String[] Z;
    public static Object N_0;

    private class11919() {
        throw new UnsupportedOperationException(Z[0]);
    }

    static {
        class11919.R();
        class11919.Z();
        N_0 = class06202.Nq();
    }

    private static int B() {
        return ((class04453)((class06202)class11919.N_0).T_4).method_31548().N() % 8 + 1;
    }

    private static void Z() {
    }

    private static boolean i() {
        return ((class04453)((class06202)class11919.N_0).T_4).method_6115() && ((class04453)((class06202)class11919.N_0).T_4).method_6058() == class07050.field_5808;
    }

    public static void y(Runnable runnable, BiConsumer<Integer, Integer> biConsumer, int n) {
        boolean bl = class11919.i();
        int n2 = bl ? 40 : class11919.B();
        class11938.m().N(0, n, n2, class07510.field_7791).y(class062022 -> {
            if (bl) {
                class11919.N(class07050.field_5810, runnable);
            } else {
                class11322.N((int)n2);
                class11919.N(class07050.field_5808, runnable);
                class11938.Z().N(class11322::L);
            }
            biConsumer.accept(n, n2);
        }).y();
    }

    public static boolean y() {
        return ((class04453)((class06202)class11919.N_0).T_4).method_6118(class07085.field_6174).B() == class06570.sT;
    }

    public static boolean N(Runnable runnable) {
        for (class07050 class070502 : class07050.values()) {
            if (((class04453)((class06202)class11919.N_0).T_4).method_5998(class070502).B() != class06570.GJ) continue;
            class11919.N(class070502, runnable);
            return true;
        }
        return false;
    }

    public static void N(Runnable runnable, BiConsumer<Integer, Integer> biConsumer, int n) {
        if (class11919.i()) {
            class11938.m().N(0, n + 36, 40, class07510.field_7791).y(class062022 -> {
                class11919.N(class07050.field_5810, runnable);
                biConsumer.accept(n + 36, 40);
            }).y();
            return;
        }
        class11322.N((int)n);
        class11919.N(class07050.field_5808, runnable);
        class11938.Z().N(class11322::L);
    }

    public static boolean N() {
        return class11919.y() && ((class04453)((class06202)class11919.N_0).T_4).method_6128();
    }

    public static void N(class07050 class070502, Runnable runnable) {
        ((class03443)((class06202)class11919.N_0).T_2).N((class08036)((class04453)((class06202)class11919.N_0).T_4), class070502);
        runnable.run();
    }

    public static void N(Runnable runnable, BiConsumer<Integer, Integer> biConsumer) {
        if (!class11919.y() || !((class04453)((class06202)class11919.N_0).T_4).method_6128()) {
            return;
        }
        if (class11919.N(runnable)) {
            return;
        }
        int n = class11281.N((class06581)class06570.GJ);
        if (class11281.u((int)n)) {
            class11919.N(runnable, biConsumer, n);
        } else if (!class11281.y((int)n)) {
            class11919.y(runnable, biConsumer, n);
        }
    }

    private static void R() {
        Z = new String[1];
        class11919.Z[0] = "This is a utility class and cannot be instantiated";
    }
}

