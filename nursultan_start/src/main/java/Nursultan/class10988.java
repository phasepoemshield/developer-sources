/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 */
package Nursultan;

import minecraft.class07049;

public class class10988 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public boolean y_init;

    public class10988() {
        this.R();
    }

    static {
        class10988.i();
        N_0 = new class10988();
    }

    private static void i() {
    }

    public boolean y() {
        return (Boolean)this.y_0;
    }

    public static class10988 N(boolean bl, class07049 class070492) {
        ((class10988)class10988.N_0).y_0 = bl;
        ((class10988)class10988.N_0).y_1 = class070492;
        return (class10988)N_0;
    }

    public class10988 N(boolean bl) {
        this.y_0 = bl;
        return this;
    }

    public class10988 N(class07049 class070492) {
        this.y_1 = class070492;
        return this;
    }

    public class07049 N() {
        return (class07049)this.y_1;
    }

    private void R() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = false;
        }
    }
}

