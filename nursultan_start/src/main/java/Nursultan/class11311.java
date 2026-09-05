/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class05216
 */
package Nursultan;

import Nursultan.class11287;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class05216;

public class class11311
implements class11287 {
    private static String[] y;
    public static Object N_0;

    static {
        class11311.u();
        class11311.y();
        N_0 = new class11311();
    }

    private static void u() {
        y = new String[1];
        class11311.y[0] = "[IRC] ";
    }

    private static void y() {
    }

    @Override
    public class05216 N() {
        return class00392.y((String)y[0]).y(class00405.N.N(Boolean.valueOf(true)));
    }
}

