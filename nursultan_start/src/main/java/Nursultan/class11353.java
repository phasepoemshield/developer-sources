/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09332
 */
package Nursultan;

import Nursultan.class09332;
import Nursultan.class11377;

public class class11353 {
    private static String[] M;
    public static Object N_0;
    public Object y_0;
    public Object y_1;

    public static class11353 L() {
        ((class11353)class11353.N_0).y_1 = class11377.staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_2;
        ((class11353)class11353.N_0).y_0 = null;
        return (class11353)N_0;
    }

    private static class09332 L(class09332 class093322) {
        if (class093322 == null) {
            throw new IllegalArgumentException(M[0]);
        }
        return class093322;
    }

    private void M() {
    }

    private class11353() {
        this.M();
    }

    static {
        class11353.z();
        class11353.i();
        N_0 = new class11353();
    }

    private static void i() {
    }

    private static void z() {
        M = new String[1];
        class11353.M[0] = "friend cannot be null";
    }

    public class11377 u() {
        return (class11377)((Object)this.y_1);
    }

    public class09332 y() {
        return (class09332)this.y_0;
    }

    public static class11353 y(class09332 class093322) {
        ((class11353)class11353.N_0).y_1 = class11377.staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_1;
        ((class11353)class11353.N_0).y_0 = class11353.L(class093322);
        return (class11353)N_0;
    }

    public static class11353 N(class09332 class093322) {
        ((class11353)class11353.N_0).y_1 = class11377.staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_0;
        ((class11353)class11353.N_0).y_0 = class11353.L(class093322);
        return (class11353)N_0;
    }

    public boolean N() {
        return (class09332)this.y_0 != null;
    }
}

