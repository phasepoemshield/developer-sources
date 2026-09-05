/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11784
 *  minecraft.class01421
 *  minecraft.class07070
 */
package Nursultan;

import Nursultan.class11784;
import minecraft.class01421;
import minecraft.class07070;

public class class10977
extends class11784 {
    public static Object y_0;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public boolean L_init;

    public float L() {
        this.M();
        return ((Float)this.L_0).floatValue();
    }

    private void M() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = Float.valueOf(0.0f);
            this.L_1 = Float.valueOf(0.0f);
        }
    }

    public class10977() {
        this.M();
    }

    static {
        class10977.z();
        y_0 = new class10977();
    }

    public class07070 i() {
        this.M();
        return (class07070)this.L_2;
    }

    private static void z() {
    }

    public class01421 u() {
        this.M();
        return (class01421)this.L_3;
    }

    public static class10977 N(class07070 class070702, class01421 class014212, float f, float f2) {
        ((class10977)((Object)class10977.y_0)).L_2 = class070702;
        ((class10977)((Object)class10977.y_0)).L_3 = class014212;
        ((class10977)((Object)class10977.y_0)).L_1 = Float.valueOf(f);
        ((class10977)((Object)class10977.y_0)).L_0 = Float.valueOf(f2);
        return (class10977)((Object)y_0);
    }

    public float R() {
        this.M();
        return ((Float)this.L_1).floatValue();
    }
}

