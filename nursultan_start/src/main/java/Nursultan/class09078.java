/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08066
 */
package Nursultan;

import java.util.ArrayDeque;
import java.util.Deque;
import minecraft.class08066;

public class class09078 {
    public static Object N_0;
    public static Object N_1;

    public static void L() {
        if (((Deque)N_0).isEmpty()) {
            N_1 = null;
            return;
        }
        N_1 = (class08066)((Deque)N_0).removeLast();
    }

    static {
        class09078.i();
        N_0 = new ArrayDeque(3);
    }

    private static void i() {
        N_0 = null;
        N_1 = null;
    }

    public static void y() {
        ((Deque)N_0).clear();
        N_1 = null;
    }

    public static void N(class08066 class080662) {
        if ((class08066)N_1 != null) {
            ((Deque)N_0).addLast((class08066)N_1);
        }
        N_1 = class080662;
    }

    public static class08066 N() {
        return (class08066)N_1;
    }
}

