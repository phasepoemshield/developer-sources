/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class08082
 */
package Nursultan;

import Nursultan.class11889;
import minecraft.class00381;
import minecraft.class08082;

public class class11912
extends class11889 {
    private static String[] y;

    static {
        class11912.y();
    }

    private static void y() {
        y = new String[5];
        class11912.y[0] = "\n";
        class11912.y[1] = "";
        class11912.y[2] = " ";
        class11912.y[3] = "";
        class11912.y[4] = "\u2554\u2550\u2550\u2550\u2550\u2557\u26a1FunTime.su\u26a1\u0420\u0435\u0436\u0438\u043c:\u0413\u0440\u0438\u0444\u0435\u0440\u0441\u043a\u0438\u0439-";
    }

    @Override
    public boolean N(class00381<?> class003812) {
        if (class003812 instanceof class08082) {
            return ((class08082)class003812).N().getString().replace(y[0], y[1]).replace(y[2], y[3]).startsWith(y[4]);
        }
        return false;
    }
}

