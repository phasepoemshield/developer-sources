/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11784
 *  minecraft.class01054
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.class11784;
import minecraft.class01054;
import minecraft.class06584;

public class class10964
extends class11784 {
    public static Object y_0;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public boolean L_init;

    public class06584 L() {
        this.Z();
        return (class06584)this.L_1;
    }

    public class10964() {
        this.Z();
    }

    static {
        class10964.U();
        y_0 = new class10964();
    }

    private void Z() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_2 = 0;
            this.L_3 = 0;
        }
    }

    public int i() {
        this.Z();
        return (Integer)this.L_2;
    }

    private static void U() {
    }

    public class01054 u() {
        this.Z();
        return (class01054)this.L_0;
    }

    public class10964 y(int n) {
        this.Z();
        this.L_3 = n;
        return this;
    }

    public class10964 N(class06584 class065842) {
        this.Z();
        this.L_1 = class065842;
        return this;
    }

    public class10964 N(int n) {
        this.Z();
        this.L_2 = n;
        return this;
    }

    public static class10964 N(class01054 class010542, class06584 class065842, int n, int n2) {
        ((class10964)((Object)class10964.y_0)).L_0 = class010542;
        ((class10964)((Object)class10964.y_0)).L_1 = class065842;
        ((class10964)((Object)class10964.y_0)).L_2 = n;
        ((class10964)((Object)class10964.y_0)).L_3 = n2;
        return (class10964)((Object)y_0);
    }

    public class10964 N(class01054 class010542) {
        this.Z();
        this.L_0 = class010542;
        return this;
    }

    public int R() {
        this.Z();
        return (Integer)this.L_3;
    }
}

