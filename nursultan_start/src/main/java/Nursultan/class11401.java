/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 */
package Nursultan;

import minecraft.class06889;

public class class11401 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;
    public static Object y_0;

    public class11401() {
        this.i();
    }

    static {
        class11401.u();
        y_0 = new class11401();
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
        }
    }

    private static void u() {
    }

    public float y() {
        return ((Float)this.N_0).floatValue();
    }

    public class06889 N() {
        return (class06889)this.N_1;
    }

    public static class11401 N(float f, class06889 class068892) {
        ((class11401)class11401.y_0).N_0 = Float.valueOf(f);
        ((class11401)class11401.y_0).N_1 = class068892;
        return (class11401)y_0;
    }
}

