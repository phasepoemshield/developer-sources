/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11784
 *  minecraft.class07050
 */
package Nursultan;

import Nursultan.class11784;
import minecraft.class07050;

public class class11375
extends class11784 {
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public boolean y_init;
    public static Object L_0;

    public float L() {
        this.z();
        return ((Float)this.y_1).floatValue();
    }

    public class11375() {
        this.z();
    }

    static {
        class11375.B();
        L_0 = new class11375();
    }

    private static void B() {
    }

    public class07050 i() {
        this.z();
        return (class07050)this.y_0;
    }

    private void z() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_1 = Float.valueOf(0.0f);
            this.y_2 = Float.valueOf(0.0f);
        }
    }

    public float u() {
        this.z();
        return ((Float)this.y_2).floatValue();
    }

    public class11375 y(float f) {
        this.z();
        this.y_2 = Float.valueOf(f);
        return this;
    }

    public class11375 N(class07050 class070502) {
        this.z();
        this.y_0 = class070502;
        return this;
    }

    public static class11375 N(class07050 class070502, float f, float f2) {
        ((class11375)((Object)class11375.L_0)).y_0 = class070502;
        ((class11375)((Object)class11375.L_0)).y_1 = Float.valueOf(f);
        ((class11375)((Object)class11375.L_0)).y_2 = Float.valueOf(f2);
        return (class11375)((Object)L_0);
    }

    public class11375 N(float f) {
        this.z();
        this.y_1 = Float.valueOf(f);
        return this;
    }
}

