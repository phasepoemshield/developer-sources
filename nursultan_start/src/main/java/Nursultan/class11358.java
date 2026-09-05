/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11784
 */
package Nursultan;

import Nursultan.class11784;

public class class11358
extends class11784 {
    public Object y_0;
    public boolean y_init;
    public static Object L_0;

    public int L() {
        this.u();
        return (Integer)this.y_0;
    }

    public class11358() {
        this.u();
    }

    static {
        class11358.i();
        L_0 = new class11358();
    }

    private static void i() {
    }

    private void u() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
        }
    }

    public static class11358 N(int n) {
        ((class11358)((Object)class11358.L_0)).y_0 = n;
        return (class11358)((Object)L_0);
    }
}

