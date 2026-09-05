/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00018
 *  minecraft.class00044
 *  minecraft.class00155
 *  minecraft.class01964
 *  minecraft.class04909
 *  minecraft.class04911
 */
package minecraft;

import minecraft.class00018;
import minecraft.class00044;
import minecraft.class00155;
import minecraft.class01964;
import minecraft.class04909;
import minecraft.class04911;

public class class03578
extends class00155 {
    private static final float m = 1.0f;
    private static final float P = 1.0f;
    private final class01964 s;

    public void P() {
        if (this.s.method_31481() || this.s.T() != null || !this.s.n()) {
            this.y();
            return;
        }
        this.R = (float)this.s.method_23317();
        this.M = (float)this.s.method_23318();
        this.B = (float)this.s.method_23321();
        this.u = 1.0f;
        this.i = 1.0f;
    }

    public class03578(class01964 class019642) {
        super(class04909.YH, class04911.field_15254, class00044.v());
        this.s = class019642;
        this.U = class00018.field_5476;
        this.Z = false;
        this.z = 0;
    }

    public boolean s() {
        return !this.s.method_5701();
    }
}

