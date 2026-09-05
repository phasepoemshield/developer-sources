/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09857
 *  minecraft.class06202
 *  minecraft.class08844
 *  org.joml.Vector2i
 */
package Nursultan;

import Nursultan.class09857;
import minecraft.class06202;
import minecraft.class08844;
import org.joml.Vector2i;

public class class11307 {
    public static Object N_0;

    private static void L() {
        N_0 = null;
    }

    private class11307() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11307.L();
        N_0 = class06202.Nq();
    }

    public static class09857 N(int n) {
        boolean bl = (n & 2) != 0;
        boolean bl2 = (n & 1) != 0;
        boolean bl3 = (n & 4) != 0;
        boolean bl4 = (n & 8) != 0;
        return new class09857(bl, bl2, bl3, bl4);
    }

    public static Vector2i N(double d, double d2) {
        class08844 class088442 = ((class06202)N_0).Nt();
        double d3 = (double)class088442.U() / (double)class088442.W();
        double d4 = (double)class088442.E() / (double)class088442.m();
        return new Vector2i((int)(d * d3), (int)(d2 * d4));
    }

    public static boolean N(int n, int n2, int n3, int n4, int n5, int n6) {
        return n5 >= n && n5 <= n + n3 && n6 >= n2 && n6 <= n2 + n4;
    }
}

