/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class06584
 */
package Nursultan;

import minecraft.class01054;
import minecraft.class06584;

public class class10946 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public boolean y_init;

    public int L() {
        return (Integer)this.y_2;
    }

    private void M() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_2 = 0;
            this.y_3 = 0;
        }
    }

    public class10946() {
        this.M();
    }

    static {
        class10946.B();
        N_0 = new class10946();
    }

    private static void B() {
    }

    public class06584 u() {
        return (class06584)this.y_1;
    }

    public int y() {
        return (Integer)this.y_3;
    }

    public class01054 N() {
        return (class01054)this.y_0;
    }

    public static class10946 N(class01054 class010542, class06584 class065842, int n, int n2) {
        ((class10946)class10946.N_0).y_0 = class010542;
        ((class10946)class10946.N_0).y_1 = class065842;
        ((class10946)class10946.N_0).y_2 = n;
        ((class10946)class10946.N_0).y_3 = n2;
        return (class10946)N_0;
    }
}

