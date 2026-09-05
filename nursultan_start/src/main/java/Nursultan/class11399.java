/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11784
 */
package Nursultan;

import Nursultan.class11784;

public class class11399
extends class11784 {
    public Object y_0;
    public boolean y_init;
    public static Object L_0;

    public int L() {
        this.u();
        return (Integer)this.y_0;
    }

    public class11399() {
        this.u();
    }

    static {
        class11399.R();
        L_0 = new class11399();
    }

    private void u() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
        }
    }

    public class11399 y(int n) {
        this.u();
        this.y_0 = n;
        return this;
    }

    public static class11399 N(int n) {
        ((class11399)((Object)class11399.L_0)).y_0 = n;
        return (class11399)((Object)L_0);
    }

    private static void R() {
    }
}

