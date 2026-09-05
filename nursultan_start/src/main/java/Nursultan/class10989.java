/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class02233
 */
package Nursultan;

import minecraft.class01054;
import minecraft.class02233;

public class class10989 {
    public Object N_0;
    public Object N_1;
    public static Object y_0;

    private void M() {
    }

    public class10989() {
        this.M();
    }

    static {
        class10989.u();
        y_0 = new class10989();
    }

    private static void u() {
        y_0 = null;
    }

    public class01054 y() {
        return (class01054)this.N_0;
    }

    public static class10989 N(class01054 class010542, class02233 class022332) {
        ((class10989)class10989.y_0).N_0 = class010542;
        ((class10989)class10989.y_0).N_1 = class022332;
        return (class10989)y_0;
    }

    public class10989 N(class01054 class010542) {
        this.N_0 = class010542;
        return this;
    }

    public class02233 N() {
        return (class02233)this.N_1;
    }

    public class10989 N(class02233 class022332) {
        this.N_1 = class022332;
        return this;
    }
}

