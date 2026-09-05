/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11911
 */
package Nursultan;

import Nursultan.class09082;
import Nursultan.class09093;
import Nursultan.class11911;

public class class09080 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;

    public static void L() {
        ((class09082)N_0).N();
    }

    private class09080() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class09080.B();
        N_0 = new class09082();
    }

    private static void B() {
        N_0 = null;
        N_1 = null;
        N_2 = null;
        N_3 = false;
    }

    public static class09093 i() {
        return (class09093)N_2;
    }

    public static class09093 u() {
        return (class09093)N_1;
    }

    public static void y() {
        if (((Boolean)N_3).booleanValue()) {
            throw new IllegalStateException("Already initialized");
        }
        N_1 = ((class09082)N_0).N("inter", class11911.L((String)"fonts/interm.ttf"));
        N_2 = ((class09082)N_0).N("minecraft", class11911.L((String)"fonts/minecraft.ttf"));
        N_3 = true;
    }

    public static void N() {
        ((class09082)N_0).L();
    }

    public static class09093 N(String string) {
        return ((class09082)N_0).N(string);
    }
}

