/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11887
 *  Nursultan.class11905
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.class11887;
import Nursultan.class11905;
import minecraft.class06889;

public class class11037 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;
    public static Object y_0;
    public static Object y_1;

    void L() {
        this.N_1 = (Integer)this.N_1 + 1;
    }

    private static void M() {
        y_0 = 60;
        y_1 = 30;
    }

    class11037(class06889 class068892) {
        this.i();
        this.N_0 = class068892;
    }

    static {
        class11037.M();
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
        }
    }

    float y(float f) {
        return 1.0f - this.N(60, f);
    }

    float N(float f) {
        return this.N(30, f);
    }

    boolean N() {
        return (Integer)this.N_1 >= 60;
    }

    private float N(int n, float f) {
        float f2 = Math.min(1.0f, ((float)((Integer)this.N_1).intValue() + f) / (float)n);
        return (float)((class11887)class11905.u_4).ease((double)f2);
    }
}

