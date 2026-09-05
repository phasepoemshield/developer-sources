/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11889
 *  minecraft.class00381
 *  minecraft.class08082
 */
package Nursultan;

import Nursultan.class11889;
import minecraft.class00381;
import minecraft.class08082;

public class class11931
extends class11889 {
    private static String[] N;

    static {
        class11931.N();
    }

    public boolean N(class00381<?> class003812) {
        if (class003812 instanceof class08082) {
            return ((class08082)class003812).N().getString().replace(N[0], N[1]).replace(N[2], N[3]).startsWith(N[4]);
        }
        return false;
    }

    private static void N() {
        N = new String[5];
        class11931.N[0] = "\n";
        class11931.N[1] = "";
        class11931.N[2] = " ";
        class11931.N[3] = "";
        class11931.N[4] = "\u2554\u2550\u2550\u2550\u2550\u2557\u26a1FunTime.su\u26a1\u0420\u0435\u0436\u0438\u043c:\u0425\u0430\u0431#";
    }
}

