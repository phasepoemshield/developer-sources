/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04568
 *  minecraft.class06202
 */
package Nursultan;

import minecraft.class04568;
import minecraft.class06202;

public class class11715 {
    private static String[] L;
    public static Object N_0;

    private static void L() {
        L = new String[2];
        class11715.L[0] = "localhost";
        class11715.L[1] = "localhost";
    }

    private class11715() {
    }

    static {
        class11715.L();
        class11715.u();
    }

    private static void u() {
        N_0 = L[1];
    }

    public static String y() {
        return class06202.Nq().Ny().L();
    }

    public static String N() {
        class04568 class045682 = class06202.Nq().yN();
        return class045682 == null ? L[0] : class045682.y;
    }
}

