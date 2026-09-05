/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11784
 *  minecraft.class04891
 *  minecraft.class04911
 */
package Nursultan;

import Nursultan.class11784;
import minecraft.class04891;
import minecraft.class04911;

public class class09326
extends class11784 {
    private static double[] z;
    public static Object y_0;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public boolean L_init;

    public void L(double d) {
        this.P();
        this.L_4 = d;
    }

    public class04911 L() {
        this.P();
        return (class04911)this.L_1;
    }

    public double M() {
        this.P();
        return (Double)this.L_4;
    }

    private void P() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_2 = Float.valueOf(0.0f);
            this.L_3 = Float.valueOf(0.0f);
            this.L_4 = z[0];
            this.L_5 = z[1];
            this.L_6 = z[2];
        }
    }

    public class09326() {
        this.P();
    }

    static {
        class09326.s();
        class09326.m();
        y_0 = new class09326();
    }

    public double B() {
        this.P();
        return (Double)this.L_6;
    }

    public class04891 Z() {
        this.P();
        return (class04891)this.L_0;
    }

    public float i() {
        this.P();
        return ((Float)this.L_2).floatValue();
    }

    private static void s() {
        z = new double[3];
        class09326.z[0] = Double.longBitsToDouble(0L);
        class09326.z[1] = Double.longBitsToDouble(0L);
        class09326.z[2] = Double.longBitsToDouble(0L);
    }

    private static void m() {
    }

    public double u() {
        this.P();
        return (Double)this.L_5;
    }

    public void y(float f) {
        this.P();
        this.L_2 = Float.valueOf(f);
    }

    public void y(double d) {
        this.P();
        this.L_5 = d;
    }

    public void N(class04891 class048912) {
        this.P();
        this.L_0 = class048912;
    }

    public static class09326 N(class04891 class048912, class04911 class049112, float f, float f2, double d, double d2, double d3) {
        ((class09326)((Object)class09326.y_0)).L_0 = class048912;
        ((class09326)((Object)class09326.y_0)).L_1 = class049112;
        ((class09326)((Object)class09326.y_0)).L_2 = Float.valueOf(f2);
        ((class09326)((Object)class09326.y_0)).L_3 = Float.valueOf(f);
        ((class09326)((Object)class09326.y_0)).L_4 = d;
        ((class09326)((Object)class09326.y_0)).L_5 = d2;
        ((class09326)((Object)class09326.y_0)).L_6 = d3;
        return (class09326)((Object)y_0);
    }

    public void N(class04911 class049112) {
        this.P();
        this.L_1 = class049112;
    }

    public void N(float f) {
        this.P();
        this.L_3 = Float.valueOf(f);
    }

    public void N(double d) {
        this.P();
        this.L_6 = d;
    }

    public float R() {
        this.P();
        return ((Float)this.L_3).floatValue();
    }
}

