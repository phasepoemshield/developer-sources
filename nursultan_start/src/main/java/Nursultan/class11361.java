/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06584
 */
package Nursultan;

import java.util.List;
import minecraft.class00392;
import minecraft.class06584;

public class class11361 {
    public Object N_0;
    public Object N_1;
    public static Object y_0;

    public class11361() {
        this.R();
    }

    static {
        class11361.u();
        y_0 = new class11361();
    }

    private static void u() {
    }

    public class06584 y() {
        return (class06584)this.N_1;
    }

    public class11361 N(List<class00392> list) {
        this.N_0 = list;
        return this;
    }

    public class11361 N(class06584 class065842) {
        this.N_1 = class065842;
        return this;
    }

    public List<class00392> N() {
        return (List)this.N_0;
    }

    public static class11361 N(List<class00392> list, class06584 class065842) {
        ((class11361)class11361.y_0).N_0 = list;
        ((class11361)class11361.y_0).N_1 = class065842;
        return (class11361)y_0;
    }

    private void R() {
    }
}

